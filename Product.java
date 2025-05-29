import java.util.*;

public class Product {
    private String productName;
    private String productID;
    private double price;
    private int stockQuantity;

    public Product(String productName, String productID, double price, int stockQuantity) {
        this.productName = productName;
        this.productID = productID;
        
        setPrice(price);
        this.stockQuantity = stockQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cant be -ve. "); 
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Public methods to update stock
    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println(quantity + " " + productName + " purchased.  Remaining stock: " + stockQuantity);
        } else {
            System.out.println("Invalid purchase quantity or nut enuff  stock.");
        }
    }

    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + " " + productName + " restocked.  New stock: " + stockQuantity);
        } else {
            System.out.println("Restock quantity must be positive.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;   
        System.out.println("Enter product details:");
        System.out.print("Product Name: ");
        String name = sc.nextLine();
        System.out.print("Product ID: ");
        String id = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Initial Stock Quantity: ");
        int stock = sc.nextInt();
        Product myProduct = new Product(name, id, price,stock);
        System.out.println("Initial stock: " + myProduct.getStockQuantity());
        
        System.out.println("how much to purchase?");
        int purchaseQuantity = sc.nextInt();
        myProduct.purchase(purchaseQuantity);
        
        System.out.println("Current stock: " + myProduct.getStockQuantity());
        System.out.println("how much to restock?");
        int restockQuantity = sc.nextInt();
        myProduct.restock(restockQuantity);
        System.out.println("Current stock: " + myProduct.getStockQuantity());
        sc.close();
    }
}
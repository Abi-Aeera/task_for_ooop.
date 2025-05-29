import java.util.*;

public class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    public SimpleInterest(double principle, double time, double rate) {
        this.principle = principle;
        this.time = time;
        this.rate = rate;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest() {
        return (principle * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double principle = sc.nextDouble();
        System.out.print("Enter the time in years: ");         
        double time = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        sc.close();
        SimpleInterest interest = new SimpleInterest(principle, time, rate);
        interest.setPrinciple(2000);
        System.out.println("Principle: " + interest.getPrinciple());
        System.out.println("Time: " + interest.getTime());
        System.out.println("Rate: " + interest.getRate());

        System.out.println("Simple Interest: " + interest.calculateInterest());
    }
}

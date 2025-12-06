package designpattern.Strategy;

public class Upi implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("making payment of $" + amount+ " using upi");
    }
}

package designpattern.Strategy;

public class CreditCard implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("making payment of $" + amount+ " using Credit card");
    }
}

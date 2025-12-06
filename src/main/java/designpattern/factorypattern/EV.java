package designpattern.factorypattern;

public class EV implements Car{
    @Override
    public void assemble() {
        System.out.println("EV is assembling");
    }
}

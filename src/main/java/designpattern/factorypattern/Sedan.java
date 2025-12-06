package designpattern.factorypattern;

public class Sedan implements Car{
    @Override
    public void assemble() {
        System.out.println("Sedan is assembling");
    }
}

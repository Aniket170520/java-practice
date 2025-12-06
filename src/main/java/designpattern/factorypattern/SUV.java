package designpattern.factorypattern;

public class SUV implements Car{
    @Override
    public void assemble() {
        System.out.println("SUV is assembling");
    }
}

package designpattern;

public class Prototype implements Cloneable {//creates new objects by cloning existing once
    private String name;
    private String age;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

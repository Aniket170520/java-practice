package designpattern;

import java.io.Serializable;

public class SingletonPattern implements Serializable {

    //1. private static instance of the class
    private volatile static SingletonPattern pattern;

    //2. private constructor to prevent instantiation of class
    private SingletonPattern(){
        if (pattern != null){// prevents reflection attacks
            throw new IllegalArgumentException();
        }
    }

    //3. public static method to provide instance of the object
    public static SingletonPattern getInstance(){
        if (pattern == null) {
            synchronized (SingletonPattern.class){
                if (pattern == null) {
                    SingletonPattern pattern = new SingletonPattern();
                }
            }
        }
        return pattern;
    }

    //4. Create static methods
    public static void printInput(String input){
        System.out.println(input);
    }

    protected Object readResolve(){
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {//prevents cloning of object
        throw new CloneNotSupportedException();
    }
}

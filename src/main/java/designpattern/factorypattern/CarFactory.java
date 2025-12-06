package designpattern.factorypattern;

public class CarFactory {
    public Car getCar(String carType){
        return switch (carType.toLowerCase()) {
            case "suv" -> new SUV();
            case "sedan" -> new Sedan();
            case "ev" -> new EV();
            default -> null;
        };
    }
}

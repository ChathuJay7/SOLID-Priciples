
package liskov.s.substitution.principle;

public class Main {

    public static void main(String[] args) {
        
        Car car = new Car();
        car.setName("Toyota CHR");
        car.setSpeed(220);
        System.out.println("Car name : " + car.getName());
        System.out.println("Car Speed : " + car.getSpeed());
        car.setEngineType("petrol");
        System.out.println("Car total Price ; " + car.price);
        
        Bike bike = new Bike();
        bike.setName("Discover");
        bike.setSpeed(120);
        System.out.println("\nBike name : " + bike.getName());
        System.out.println("Bike Speed : " + bike.getSpeed());
        System.out.println("Bike total price : " + bike.price);
        
    }
    
}

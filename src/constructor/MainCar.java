package constructor;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("KML-797 ", 1912); //Instancia
        System.out.println(car.getPlate() + " Es modelo: " + car.getModel());
    }
}

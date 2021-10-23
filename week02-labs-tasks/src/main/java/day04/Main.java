package day04;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation=new GasStation(475);
        System.out.println(gasStation.GastoCar(car, 45));
        car.setMegtettKm(152);
        System.out.println(car.carGasUse());
    }
}

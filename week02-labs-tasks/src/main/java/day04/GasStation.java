package day04;

public class GasStation {
    private int price;

    public GasStation(int price) {
        this.price = price;
    }
    public int GastoCar(Car car, int gas) {
        car.setBenzinLiter(gas);
        return gas*price;
    }
}

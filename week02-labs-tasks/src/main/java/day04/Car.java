package day04;

public class Car {
    private int benzinLiter=0;
    private int megtettKm=0;

    public void setBenzinLiter(int benzinLiter) {
        this.benzinLiter = benzinLiter;
    }

    public void setMegtettKm(int megtettKm) {
        this.megtettKm = megtettKm;
    }
    public double carGasUse() {
        return ((double)benzinLiter/megtettKm)*100;
    }

}

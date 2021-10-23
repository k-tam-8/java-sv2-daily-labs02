package day05;

public class Movie {
    private String title;
    private int yearOfProduct;
    private double rating=0;
    private int ratesFromUsers=0;
    private int ratesSum=0;

    public void Movie(String title, int yearOfProduct ) {
        this.title=title;
        this.yearOfProduct=yearOfProduct;
    }
    public double changeRate(int rate) {
        this.ratesFromUsers++;
        this.ratesSum+=rate;
        this.rating=(double)this.ratesSum/this.ratesFromUsers;
        return rating;
    }



}

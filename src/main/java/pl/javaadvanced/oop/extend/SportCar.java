package pl.javaadvanced.oop.extend;

public class SportCar extends Car{
    private boolean sportSeats;
    private String color;

    //ustawiamy zarówno parametry naszej klasy jak i parametry klasy bazowej
    public SportCar(String name, String engine, boolean sportSeats, String color) {
        //super(..) wywołuje konstruktor klasy bazowej
        super(name, engine);
        this.sportSeats = sportSeats;
        this.color = color;
    }

    //tu korzystamy z drugiego konstruktora nadklasy tym razem bezparametrowego
    public SportCar(boolean sportSeats, String color) {
        this.sportSeats = sportSeats;
        this.color = color;
    }

    public boolean isSportSeats() {
        return sportSeats;
    }

    public void setSportSeats(boolean sportSeats) {
        this.sportSeats = sportSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String carInfo() {
        return "Sport Car: " + getName() + " color: " + getColor();
    }

    @Override
    public String getEngine() {
        //super.getEngine(); powoduje wywołanie metody getEngine z klasy Car
        //return super.getEngine();

        return "Boosted " + super.getEngine();
    }
}

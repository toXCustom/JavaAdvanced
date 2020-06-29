package pl.javaadvanced.sampleOOP;

public class Fish extends Creature {
    private String fishName;

    public Fish(String fishName) {
        this.fishName = fishName;
    }

    @Override
    public String getName() {
        return fishName;
    }

    @Override
    public void move() {
        System.out.println(fishName + " is swimming!");
    }
}

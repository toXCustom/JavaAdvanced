package pl.javaadvanced.sampleOOP;

public class Human extends Creature {
    private String humanName;
    private boolean inWater;

    public Human(String humanName) {
        this.humanName = humanName;
    }

    @Override
    public String getName() {
        return humanName;
    }

    @Override
    public void move() {
        if (inWater) {
            System.out.println(humanName + " is swimming!");
        } else {
            System.out.println(humanName + " is walking");
        }
    }

    public boolean isInWater() {
        return inWater;
    }

    public void setInWater(boolean inWater) {
        this.inWater = inWater;
    }
}

package pl.javaadvanced.patterns.behavioral.state;

public class Onboarding implements FlightState {
    private static Onboarding instance = new Onboarding();

    private Onboarding() {
    }

    public static Onboarding getInstance() {
        return instance;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Onboarding. Preparing to takeaway!");
        flight.setStatus(Takeaway.getInstance());
    }
}

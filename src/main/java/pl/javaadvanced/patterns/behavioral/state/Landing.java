package pl.javaadvanced.patterns.behavioral.state;

public class Landing implements FlightState {
    private static Landing instance = new Landing();

    private Landing() {
    }

    public static Landing getInstance() {
        return instance;
    }

    @Override
    public void updateState(Flight flight) {
        System.out.println("Landing. Please remain seated!");
        flight.setStatus(Landed.getInstance());
    }
}

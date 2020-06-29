package pl.javaadvanced.patterns.behavioral.strategy;

@FunctionalInterface
public interface TravelStrategy {
    void setTravelPlan(String from, String to);
}

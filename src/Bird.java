public class Bird extends Animal{
    private double flight;
    private double wingspan;

    public void setFlight(double flight) {
        this.flight = flight;
    }

    public double getFlight() {
        return flight;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    @Override
    public String toString() {
        return "flight altitude: " + flight +
                "\n" + "wingspan length: " + wingspan;
    }
}

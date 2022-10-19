public class Bird extends Animal{
    protected double flight;
    protected double wingspan;

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
    public int Eat() {
        return super.Eat()/2;
    }
    public void Sing(){
        System.out.println("tzif, tzif tzif, tzif");
    }

    public void Dance(){
        System.out.println(this.getName() + " is dancing!!");
    }

    @Override
    public String toString() {
        return "flight altitude: " + flight +
                "\n" + "wingspan length: " + wingspan;
    }
}

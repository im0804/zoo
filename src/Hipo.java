public class Hipo extends Mammal{
    private double fat;

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String toString() {
        return "fat percent: " + fat;
    }
}

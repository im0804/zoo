public class Reptile extends Animal{
    protected double taillength;

    public void setTaillength(double taillength) {
        this.taillength = taillength;
    }

    public double getTaillength() {
        return taillength;
    }

    @Override
    public String toString() {
        return "tail length: " + taillength;
    }
}

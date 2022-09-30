public class Dairybreeds extends Cow{
    private double literofmilk;

    public void setLiterofmilk(double literofmilk) {
        this.literofmilk = literofmilk;
    }

    public double getLiterofmilk() {
        return literofmilk;
    }

    @Override
    public String toString() {
        return "liter of milk: " + literofmilk;
    }
}

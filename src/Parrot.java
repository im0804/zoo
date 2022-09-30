public class Parrot extends Bird{
    private boolean cantalk;

    public void setCantalk(boolean cantalk) {
        this.cantalk = cantalk;
    }

    public boolean isCantalk() {
        return cantalk;
    }

    @Override
    public String toString() {
        return "can it talk: " + cantalk;
    }
}

public class Cow extends Mammal{
    protected int calving;

    public void setCalving(int calving) {
        this.calving = calving;
    }

    public int getCalving() {
        return calving;
    }

    @Override
    public int Eat() {
        return super.Eat()/4;
    }

    @Override
    public String toString() {
        return "number of calving: " + calving;
    }
}

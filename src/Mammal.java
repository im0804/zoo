public class Mammal extends Animal {
    protected int milkkalories;
    protected int pregnancy;

    public void setMilkkalories(int milkkalories) {
        this.milkkalories = milkkalories;
    }

    public int getMilkkalories() {
        return milkkalories;
    }

    public void setPregnancy(int pregnancy) {
        this.pregnancy = pregnancy;
    }

    public int getPregnancy() {
        return pregnancy;
    }

    @Override
    public String toString() {
        return "milk kalories: " + milkkalories +
                "\n" + "pregnancy months: " + pregnancy;
    }
}

public class Snake extends Reptile{
    private boolean poisonous;

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    @Override
    public String toString() {
        return "is it poisonous: " + poisonous;
    }
}

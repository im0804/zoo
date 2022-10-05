public class Animal {
    protected String name;
    protected double age;
    protected boolean istoppredator;
    protected int kalories;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setIstoppredator(boolean istoppredator) {
        this.istoppredator = istoppredator;
    }

    public boolean isIstoppredator() {
        return istoppredator;
    }

    public void setKalories(int kalories) {
        this.kalories = kalories;
    }

    public int getKalories() {
        return kalories;
    }

    @Override
    public String toString() {
        return "animal's name: " + name +
                "\n" + "animal's age: " + age +
                "\n" + "is it top predator: " + istoppredator +
                "\n" + "kalories: " + kalories;
    }
}

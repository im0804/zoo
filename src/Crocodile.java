public class Crocodile extends Reptile{
    protected boolean dentistcare;

    public void setDentistcare(boolean dentistcare) {
        this.dentistcare = dentistcare;
    }

    public boolean isDentistcare() {
        return dentistcare;
    }

    @Override
    public int Eat() {
        return super.Eat()+10;
    }

    @Override
    public String toString() {
        return "went through dentist care: " + dentistcare;
    }
}

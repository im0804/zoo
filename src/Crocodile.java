public class Crocodile extends Reptile{
    private boolean dentistcare;

    public void setDentistcare(boolean dentistcare) {
        this.dentistcare = dentistcare;
    }

    public boolean isDentistcare() {
        return dentistcare;
    }

    @Override
    public String toString() {
        return "went through dentist care: " + dentistcare;
    }
}

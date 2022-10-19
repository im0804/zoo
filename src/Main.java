public class Main {
    public int kalsum(Animal[] an){
        int sum = 0;
        for (int i = 0; i < an.length; i++) {
            sum += an[i].Eat();
        }
        return sum;
    }

    public void Sbird(Animal[] an){
        for (int i = 0; i < an.length; i++) {
            if (an[i] instanceof Bird){
                ((Bird) an[i]).Sing();
            }
        }
    }

    public void Dance(Animal[] an){
        for (int i = 0; i < an.length; i++) {
            if (an[i] instanceof Bird ) {
                ((Bird) an[i]).Dance();
            }
            else {
                if (an[i] instanceof Snake) {
                    ((Snake) an[i]).Dance();
                }
            }
        }
    }

    public String hipokal(Animal[] an){
        double max = 0;
        Hipo fattest = null;
        for (int i = 0; i < an.length; i++) {
            if (an[i] instanceof Hipo){
                if (((Hipo) an[i]).getFat()>max){
                    max = ((Hipo) an[i]).getFat();
                    fattest = (Hipo) an[i];
                }
            }
        }
        return fattest.getName();
    }
}

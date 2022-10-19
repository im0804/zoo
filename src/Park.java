public class Park {
    protected Animal [] an = new Animal[1000];
    protected int countCurrentAnimals = 0;

    public Park(){
        for (int i = 0; i < an.length; i++) {
            an[i] = null;
        }
        countCurrentAnimals = 0;
    }

    public Animal[] areTopPredator(){
        Animal [] animals = new Animal[1000];
        int index = 0;
        for (int i = 0; i < an.length; i++) {
            if (an[i].getAge()>10){
                if (an[i].istoppredator){
                    animals[index] = an[i];
                    index++;
                }
            }
        }
        return animals;
    }

    public int sumTopPredator(){
        int count = 0;
        for (int i = 0; i < an.length; i++) {
            if (an[i] instanceof Reptile){
                if (an[i].isIstoppredator()){
                    count++;
                }
            } else{
                if (an[i] instanceof Bird) {
                    if (((Bird) an[i]).isIstoppredator())
                        count++;
                }
            }
        }
        return count;
    }

    public void getAnimal(Animal animal){
        this.an[countCurrentAnimals] = animal;
        countCurrentAnimals ++;
    }

    public void setAn(Animal[] an) {
        this.an = an;
    }

    public Animal[] getAn() {
        return an;
    }

    public void setCountCurrentAnimals(int countCurrentAnimals) {
        this.countCurrentAnimals = countCurrentAnimals;
    }

    public int getCountCurrentAnimals() {
        return countCurrentAnimals;
    }
}

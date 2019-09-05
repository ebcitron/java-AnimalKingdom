package AnimalKingdom;


public class Reptile extends Animal {


    public Reptile(String name, int year){
        super(name, year);
    }


    @Override
    public String move() {
        return getName() + "Crawls and Slithers";
    }

    @Override
    public String breath(){
        return getName() + " Breathes through lungs and flicks tongues";

    }

    @Override
    public String rep(){
        return getName() + "Lays Reptile eggs";
    }
}
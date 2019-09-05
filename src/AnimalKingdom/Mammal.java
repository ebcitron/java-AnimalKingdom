package AnimalKingdom;


public class Mammal extends Animal {
    public Mammal(String name, int year){
        super(name, year);
    }


    @Override
    public String move() {
        return getName() + "Walks";
    }

    @Override
    public String breath(){
        return getName() + " Breathes through lungs";

    }

    @Override
    public String rep(){
        return getName() + "Lays no eggs";
    }
}
package AnimalKingdom;


public class Fish extends Animal {
    public Fish(String name, int year){
        super(name, year);
    }


    @Override
    public String move() {
        return getName() + "Swims";
    }

    @Override
    public String breath(){
        return getName() + " Breathes through Gills";

    }

    @Override
    public String rep(){
        return getName() + "Lays eggs";
    }
}
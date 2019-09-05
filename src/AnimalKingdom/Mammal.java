public class Mammal extends Animal {
    public Mammal(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }
    @Override
    public String move() {
        return getName() + "Walks";
    }

    @Override
    public String breathe(){
        return getName() + " Breathes through lungs";

    }
}
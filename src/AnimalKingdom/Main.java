package AnimalKingdom;

import java.util.ArrayList;




public class Main{
    
    // public static void printAnimal( ArrayList<Animal> animals){
    //    animals.forEach(animal -> System.out.println(animal.move()));
           
    //   }
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        // mammals
        animals.add(new Mammal("Panda", 1869));
        animals.add(new Mammal("Zebra", 1778));
        animals.add(new Mammal("Koala", 1816));
        animals.add(new Mammal("Sloth", 1804));
        animals.add(new Mammal("Armadillo", 1758));
        animals.add(new Mammal("Raccoon", 1758));
        animals.add(new Mammal("Bigfoot", 2021));

        // fish
        animals.add(new Fish("Salmon", 1758));
        animals.add(new Fish("Catfish", 1817));
        animals.add(new Fish("Perch", 1758));

        // reptiles
        animals.add(new Reptile("Snakeeon", 1837));
        animals.add(new Reptile("Snakeock", 1821));
        animals.add(new Reptile("Snakean", 1758));
        animals.add(new Reptile("Snakeot", 1824));
        animals.add(new Reptile("Snake", 1758));
            //sounds oddly similar to pokemon naming conventions =_-
    
    
       //ArrayList<Animal> sortByYear = new ArrayList<>(animals);
       
       
       System.out.println(animals);
    
        }
    }


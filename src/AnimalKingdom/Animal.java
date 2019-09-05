package AnimalKingdom;


public abstract class Animal
{
    //blueprint to set initial fields
    static int ogId = 0;
    private int id;
    private String name;
    private int year;
//
    public Animal(String name, int year){ //constructor
        ogId++;
        this.id = ogId;
        this.name = name;
        this.year = year;
    }

    //global methods - returns strings saying how animal implements the action

    //getters
public String getName(){
    return name;
}
public int getYear(){
    return year;
    }
public int getId(){
    return id;
}

public void setYear(int year){
    this.year = year;
}
public void setName(String name) {
    this.name = name;
}
//setters

public abstract String move();
public abstract String breath();
public abstract String rep();
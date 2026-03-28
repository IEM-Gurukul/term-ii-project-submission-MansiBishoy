package model;

public class Workshop extends Event{
    private String instructor;

    public Workshop(String name,String date,String location,String instructor){
        super(name,date,location);
        this.instructor=instructor;
    }
    @Override
    public String toString(){
        return "[Workshop]" + getName() + " | Date: " + getDate() + " | Instructor: " + instructor;
    }

} 


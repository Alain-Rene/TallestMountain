package co.grandcircus;

public class mountain implements iFormation {

    //Properties
    private int height;
    private String name;

    //Constructor
    public mountain(int height, String name){
        this.height = height;
        this.name = name;
    }

    //Getters
    @Override
    public int getHeight() {
       return this.height;
    }

    public String getName() {
        return this.name;
    }

    //Setters
    public void setHeight(int height){
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    

    @Override
    public String getInfo() {
        return "This mountain, " + this.name + " has a height of: " + this.height;
    }

}

package co.grandcircus;

public class mesa implements iFormation{
    //Props.
    private int height;
    private String name;
    private double area;

    //Constructor
    public mesa (int height, String name, double area){
        this.height = height;
        this.name = name;
        this.area = area;
    }

    //Getters
    @Override
    public int getHeight() {
        return height;
    }

    public String getName(){
        return name;
    }

    @Override
    public String getInfo() {
        return "This mesa, " + this.name + " has a height of: " + this.height 
        + " and surface area of: " + this.area; 
    }

    //Setters
    public void setHeight(int height){
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }
    
}

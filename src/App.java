/*
 * Creates an interface called formation and two classes, Mountain and Mesa
 * that implement that interface. Creates instances of each class, put them into a
 * array list and determine which is the tallest, prints info about each as well.
 */

import java.util.ArrayList;

import co.grandcircus.mountain;
import co.grandcircus.iFormation;
import co.grandcircus.mesa;

public class App {
    public static void main(String[] args) throws Exception {
        //Initialize formations list with values
        ArrayList<iFormation> formations = new ArrayList<>();
        mountain m1 = new mountain(8848, "Mount Everest");
        mountain m2 = new mountain(5895, "Mount Killimanjaro");
        mesa s1 = new mesa(3353, "Grand Mesa", 1300);
        mesa s2 = new mesa(2600, "Mesa Verde", 211);
        formations.add(m1);
        formations.add(m2);
        formations.add(s1);
        formations.add(s2);
        showInfo(formations);
        findTallest(formations);
        findTallestMesa(formations);
        
    }
    //ShowInfo method which displays info about the formation using getInfo
    public static void showInfo(ArrayList<iFormation> formations){
        for (iFormation formation: formations){
            System.out.println(formation.getInfo());
        }
    }
    //Finds tallest mountain/mesa
    public static void findTallest(ArrayList<iFormation> formations){
        iFormation tallestFormation = null;
        int tallest = Integer.MIN_VALUE;
       for (iFormation formation: formations){
        if (tallest < formation.getHeight()){
            tallest = formation.getHeight();
            tallestFormation = formation;
            
        }
       }
       System.out.println("The tallest mountain is: " + tallestFormation.getInfo());
    }
    //Extended, uses instance of to find the tallest mesa
    public static void findTallestMesa(ArrayList<iFormation> formations){
        int most = Integer.MIN_VALUE;
        iFormation mtallest = null;

        for (int i = 0; i < formations.size(); i++){
            if (formations.get(i) instanceof mesa){
                if (formations.get(i).getHeight() > most){
                    most = formations.get(i).getHeight();
                    mtallest = formations.get(i);
                }
                else{
                    continue;
                }
            }
        }
        
        if (mtallest != null){
            System.out.println("This is the tallest mesa:");
            System.out.println(mtallest.getInfo());
        }
        else{
            System.out.println("No mesa was found in this list");
        }
        
    }

}

import java.util.*;
/**
 * Write a description of class Uebung2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung2
{
    public Uebung2()
    {
    }
    
    public static void main(String[] args) {
        
        int max = (int) (Math.random()*20+1);
        
        ArrayList<Uebung1> personen = new ArrayList<Uebung1>();
        
        for(int i = 0; i < max; i++) {
            Uebung1 p = new Uebung1("Max", "Muster");
            
            personen.add(p);
        }
        
        
        for(Uebung1 p : personen) {
            System.out.println("Person: " + p.getVorname() + "Anzahl personen: " + p.getAnzahlInitialisiertePersonen());
        }
    }
}

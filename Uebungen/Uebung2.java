import java.util.*;
/**
 * Write a description of class Uebung1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung2
{    
    private static int anzahl = 100000;
    public void arrayListVersion() 
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl; i++)
        {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        
        System.out.println("Dauer füllen der ArrayList: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl; i++)
        {
            int value = arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("Dauer auslesen der ArrayList: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 100; i++)
        {
            arrayList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Dauer am Anfang einfügen der ArrayList: " + (endTime - startTime));
        
    }
    
    public void linkedListVersion() 
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl /2; i++)
        {
            linkedList.add(i);
        }
        long endTime = System.currentTimeMillis();
        
        System.out.println("Dauer füllen der LinkedList: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl / 2; i++)
        {
            int value = linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("Dauer auslesen der LinkedList: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < 100; i++)
        {
            linkedList.add(0, i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Dauer am Anfang einfügen der ArrayList: " + (endTime - startTime));
    }
    
}

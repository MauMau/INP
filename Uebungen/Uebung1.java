import java.util.*;
/**
 * Write a description of class Uebung1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung1
{    
    private static int anzahl = 10000000;
    public void hashMapVersion() 
    {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl; i++)
        {
            hashMap.put(i, i);
        }
        long endTime = System.currentTimeMillis();
        
        System.out.println("Dauer füllen der HashMap: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl; i++)
        {
            int value = hashMap.get(i);
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("Dauer auslesen der HashMap: " + (endTime - startTime));
    }
    
    public void treeMapVersion() 
    {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl; i++)
        {
            treeMap.put(i, i);
        }
        long endTime = System.currentTimeMillis();
        
        System.out.println("Dauer füllen der TreeMap: " + (endTime - startTime));
        
        startTime = System.currentTimeMillis();
        for(int i = 0; i < anzahl; i++)
        {
            int value = treeMap.get(i);
        }
        endTime = System.currentTimeMillis();
        
        System.out.println("Dauer auslesen der TreeMap: " + (endTime - startTime));
    }
    
}

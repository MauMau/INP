import java.util.*;
/**
 * Write a description of class Uebung1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung1
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Uebung1
     */
    public Uebung1()
    {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000000; i++)
        {
            hashMap.put(i,i);
        }
        long endTime = System.currentTimeMillis();
        
        System.out.println("hashMap füllen: " + (endTime - startTime));
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

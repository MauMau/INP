import java.util.*;
/**
 * Write a description of class ArrayTraining here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayTraining
{
    public ArrayTraining()
    {
    }
    
    public void aufgabe1()
    {
        int[] data = new int[20];
        
        for(int i = 0; i < 20;i++)
        {
            data[i] = 1;
        }
        
        System.out.println("Position 1: " + data[0]);
        
        System.out.println("Position 10: " + data[9]);
        
        System.out.println("Position 20: " + data[20]);
    }
    
    public void aufgabe2()
    {
        int[] data = new int[100];
        
        for(int i = 0; i < 100; i++)
        {
            data[i] = i + 1;
        }
        
        int i = 0;
        while(i < 100)
        {
            System.out.print(data[i++] + " ");
        }
    }
    
    public void aufgabe3(int count)
    {
        int[] data = new int[count];
        int[] data_copy = new int[count];
        
        for(int i = 0; i < count; i++)
        {
            data[i] = i;
        }
        
        for( int i = count; i > 0; i--)
        {
            data_copy[i - 1] = data[count - i];
        }
        
        for( int i = 0; i < count; i++)
        {
            System.out.println("data:\t" + data[i] + "\tdata_copy:\t" + data_copy[i]);
        }
    }
    
    public void aufgabe4()
    {
        int[] data = new int[1000];
        Random rand = new Random();
        for(int i = 0; i < 1000; i++)
        {
            
            data[i] = rand.nextInt((10000) + 1);
        }
        
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for( int i = 0; i < 1000; i++)
        {
            sum += data[i];
            max = max < data[i] ? data[i] : max;
            min = min > data[i] ? data[i] : min;
        }
        
        System.out.println("Min: " + min + " Max: " + max + " mittel: " + sum/1000);
    }
    
    public void aufgabe5()
    {
        int[] data = new int[100000];
        Random rand = new Random();
        for(int i = 0; i < 100000; i++)
        {
            
            data[i] = rand.nextInt((26)) + 65;
        }
        
        int[] charCount = new int[26];
        
        for( int i = 0; i < 100000; i++)
        {
            int charVal = data[i];
            charCount[charVal - 65]++;
        }
        
        for(int i = 0; i < 26; i++)
        {
            System.out.println("Anzahl von " + (char)(i+65)  + " - " + charCount[i]);
        }
    }
    
    public void aufgabe6(int anzahlZahlen, int maxZahl)
    {
        int[] data = new int[anzahlZahlen];
        Random rand = new Random();
        for(int i = 0; i < anzahlZahlen; i++)
        {
            
            data[i] = rand.nextInt((maxZahl) + 1);
        }
        
        double sum = 0;
        double max = 0;
        double min = Integer.MAX_VALUE;
        
        for( int i = 0; i < anzahlZahlen; i++)
        {
            sum += data[i];
            max = max < data[i] ? data[i] : max;
            min = min > data[i] ? data[i] : min;
        }
        double mittel = ((double)sum)/(double)anzahlZahlen;
        double einProzent = sum/100;
        
        System.out.println("Min: " + min + " Max: " + max + " mittel: " + mittel);
        System.out.println("Summe: " + sum);
        
        for(int i = 0; i < anzahlZahlen; i++)
        {
            double zahl = data[i];
            double anzahlProzent = zahl / einProzent;
            
            System.out.printf("Zahl: %1f\t\tProzent: %5.2f\n", zahl, anzahlProzent);
            
        }
    }
    
    public void aufgabe7()
    {
        int[] data = new int[20];
        Random rand = new Random();
        for(int i = 0; i < 20; i++)
        {
            
            data[i] = rand.nextInt((10000) + 1);
        }
        
        boolean sortCompleted = false;
        
        while(!sortCompleted)
        {
            boolean hadToSort = false;
            for(int i = 0; i < data.length - 1; i++)
            {
                if(data[i] > data[i + 1])
                {
                    int tmp = data[i+1];
                    data[i + 1] = data[i];
                    data[i] = tmp;
                    hadToSort = true;
                }
            }
            
            if(!hadToSort)
                sortCompleted = true;
        }
        
        for(int i = 0; i < 20; i++)
        {
            System.out.println("Position " + i + " - Wert: " + data[i]);
        }
    }
}

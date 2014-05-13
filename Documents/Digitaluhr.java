public class Digitaluhr
{
    private int stunde;
    private int minute;
    private int sekunde;
    
    public Digitaluhr(int std, int min, int sek)
   {
       stunde=std;
       minute=min;
       sekunde=sek;
    }
    
    public int gibStunde()
    {
        return stunde;
    }
    
    public int gibMinute()
    {
        return minute;
    } 
    
    public int gibSekunde()
    {
        return sekunde;
    }
    
    public void setzeUhrzeit(int std, int min, int sek)
    {
        stunde = std;
        minute = min;
        sekunde = sek;
    }
    
    public void zeigeUhrzeit()
    {
        System.out.println("Aktuelle Uhrzeit " + stunde + ":" + minute + ":" + sekunde);
    }
}
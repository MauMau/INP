public class Slot
{
    double preis;
    String name;
    int anzahl;
    
    public Slot(double preis, String name, int anzahl)
    {
        this.preis = preis;
        this.name = name;
        this.anzahl = anzahl;
    }
    
    public double gibPreis()
    {
        return this.preis;
    }
    
    public String gibName()
    {
        return this.name;
    }
    
    public int gibAnzahl()
    {
        return this.anzahl;
    }
    
    public void getraenkBeziehen()
    {
        this.anzahl--;
    }
}

public class Produkt
{
    double preis;
    String name;
    
    public Produkt(double preis, String name)
    {
        this.preis = preis;
        this.name = name;
    }
    
    public double gibPreis()
    {
        return this.preis;
    }
    
    public String gibName()
    {
        return this.name;
    }
}

public class Person
{
    public Person()
    {
    }
    
    public void verwendeAutomat()
    {
        GetraenkeAutomat automat = new GetraenkeAutomat();
        
        automat.uebersichtAnzeigen();
        
        automat.geldEinwerfen(10);
        
        automat.produktWaehlen(0);
        
        automat.getraenkAusgeben();
    }
    
    public void trinken(Produkt p)
    {
        System.out.println("Die Person trinkt " + p.gibName());
    }
}

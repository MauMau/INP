import java.text.*;

public class Display
{
    public Display()
    {
    }
    
    public void zeigeBegruessung()
    {
        System.out.println("***********************");
        System.out.println("*Hallo                *");
        System.out.println("*My Getraenkeautomat  *");
        System.out.println("***********************");
    }
    
    public void zeigeProduktInfo(Produkt p)
    {
        System.out.println("***********************");
        System.out.println("* gewähltes Produkt:  *");
        System.out.printf("* %-14s %-4.2f *%n", p.gibName(), p.gibPreis());
        System.out.println("***********************");
    }
    
    public void zeigeBedankung()
    {
        System.out.println("***********************");
        System.out.println("*Danke!               *");
        System.out.println("***********************");
    }
    
    public void zeigeFehler(String fehler)
    {
        System.out.println("***********************");
        System.out.println("*FEHLER               *");
        System.out.println("*" + fehler + " *");
        System.out.println("***********************");
    }
    
    public void uebersichtAnzeigen(Produkt[] produkte)
    {
        System.out.println("***********************");
        
        for(int i = 0; i < produkte.length; i++)
        {
            System.out.printf("* %-14s %-4.2f *%n", produkte[i].gibName(), produkte[i].gibPreis());
        }       
        System.out.println("***********************");
    }
}

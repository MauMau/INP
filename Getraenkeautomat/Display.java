public class Display
{
    public Display()
    {
    }
    
    public void zeigeBegruessung()
    {
        System.out.println("**********************");
        System.out.println("*Hallo               *");
        System.out.println("*My Getraenkeautomat *");
        System.out.println("**********************");
    }
    
    public void zeigeProduktInfo(Produkt p)
    {
        System.out.println("**********************");
        System.out.println("");
        System.out.println("*" + p.gibName() + " " + p.gibPreis() + " *");
        System.out.println("**********************");
    }
    
    public void zeigeBedankung()
    {
    }
}

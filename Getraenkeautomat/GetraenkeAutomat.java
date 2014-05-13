import java.text.*;

public class GetraenkeAutomat
{
    Display display;
    double betrag;
    DecimalFormat df = new DecimalFormat("#.00");
    Produkt ausgewaehltesProdukt = null;
    Produkt[] produkte = new Produkt[4];
    
    public GetraenkeAutomat()
    {
        betrag = 0;
        produkte[0] = new Produkt(3.00, "Coca Cola");        
        produkte[1] = new Produkt(3.50, "Ice Tea");
        produkte[2] = new Produkt(3.60, "Wasser");
        produkte[3] = new Produkt(4.00, "Rivella");
        
        display = new Display();
        display.zeigeBegruessung();
    }
    
    public double gibAktuellenBetrag()
    {
        return betrag;
    }
    
    public void produktWaehlen(int produktNummer)
    {
        if(produktNummer < 0 || produktNummer >= produkte.length)
        {
            System.out.println("Bitte einen gültigen Slot wählen!");
            return;
        }
        this.ausgewaehltesProdukt = produkte[produktNummer];
        
        display.zeigeProduktInfo(this.ausgewaehltesProdukt);
        
        System.out.println(ausgewaehltesProdukt.gibName() + ": CHF " + df.format(ausgewaehltesProdukt.gibPreis()));
    }
    
    public double gibRueckgeld()
    {
        double wert = betrag;
        betrag = 0;
        return wert;
    }
    
    public void geldEinwerfen(double betrag)
    {
       this.betrag += betrag;
    }
    
    public Produkt getraenkAusgeben()
    {
        if(ausgewaehltesProdukt == null)
        {
            System.out.println("Fehler, es wurde kein Produkt ausgewählt!");
            return null;
        }
        
        if(ausgewaehltesProdukt.gibPreis() > betrag)
        {
            System.out.println("Aktueller Betrag zu klein! Bitte genügend Geld einwerfen!");
            return null;
        }
        else
        {
            betrag -= ausgewaehltesProdukt.gibPreis();
            Produkt gewaehlt = ausgewaehltesProdukt;
            ausgewaehltesProdukt = null;
            
            for(int i = 0; i < produkte.length; i++)
                if(gewaehlt == produkte[i])
                    produkte[i] = null;
            
            return gewaehlt;
        }
    }   
    
    public void uebersicht()
    {
        System.out.println("########## Unser Getränkeautomat ##########");
        for(int i = 0; i < produkte.length; i++)
        {
         System.out.println(produkte[i].gibName() + ": CHF " + df.format(produkte[i].gibPreis()));         
        }
        System.out.println("###########################################");
    }
}

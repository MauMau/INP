import java.text.*;

public class GetraenkeAutomat
{
    Display display;
    double betrag;
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
            display.zeigeFehler("Bitte einen gültigen Slot wählen!");
            return;
        }
        this.ausgewaehltesProdukt = produkte[produktNummer];
        
        display.zeigeProduktInfo(this.ausgewaehltesProdukt);
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
            display.zeigeFehler("Fehler, es wurde kein Produkt ausgewählt!");
            return null;
        }
        
        if(ausgewaehltesProdukt.gibPreis() > betrag)
        {
            
            display.zeigeFehler("Aktueller Betrag zu klein! Bitte genügend Geld einwerfen!");
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
    
    public void uebersichtAnzeigen()
    {
        display.uebersichtAnzeigen(produkte);
    }
}

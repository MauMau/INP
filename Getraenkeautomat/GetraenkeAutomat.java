import java.text.*;

public class GetraenkeAutomat
{
    double betrag;
    DecimalFormat df = new DecimalFormat("#.00");
    Slot ausgewaehlterSlot = null;
    Slot[] slots = new Slot[4];
    
    public GetraenkeAutomat()
    {
        betrag = 0;
        slots[0] = new Slot(3.00, "Coca Cola", 5);        
        slots[1] = new Slot(3.50, "Ice Tea", 4);
        slots[2] = new Slot(3.60, "Wasser", 6);
        slots[3] = new Slot(4.00, "Rivella", 10);
    }
    
    public double gibAktuellenBetrag()
    {
        return betrag;
    }
    
    public void fuellstandAnzeigen(String getraenkeName)
    {
        int fuellstand = 0;
        for(int i = 0; i < slots.length; i++)
        {
         if(slots[i].gibName()== getraenkeName)
         {
            fuellstand += slots[i].gibAnzahl();   
         }
        }
        System.out.println(getraenkeName + ": " + fuellstand);
    }
    
    public void slotWaehlen(int slotNummer)
    {
        if(slotNummer < 0 || slotNummer >= slots.length)
        {
            System.out.println("Bitte einen gültigen Slot wählen!");
            return;
        }
        this.ausgewaehlterSlot = slots[slotNummer];
        System.out.println(ausgewaehlterSlot.gibName() + ": CHF " + df.format(ausgewaehlterSlot.gibPreis()));
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
    
    public void getraenkAusgeben()
    {
        if(ausgewaehlterSlot == null)
        {
        System.out.println("Fehler, es wurde kein Slot ausgewählt!");
        return;
        }
        
        if(ausgewaehlterSlot.gibAnzahl() < 1)
        {
            System.out.println("Fehler, der Slot ist leer!");
            return;
        }
        
        if(ausgewaehlterSlot.gibPreis() > betrag)
        {
            System.out.println("Aktueller Betrag zu klein! Bitte genügend Geld einwerfen!");
            return;
        }
        else
        {
            betrag -= ausgewaehlterSlot.gibPreis();
            ausgewaehlterSlot.getraenkBeziehen();
            System.out.println("Getränk " + ausgewaehlterSlot.gibName() + " im Fach entnehmen!");
        }
    }   
    
    public void uebersicht()
    {
        System.out.println("########## Unser Getränkeautomat ##########");
        for(int i = 0; i < slots.length; i++)
        {
         System.out.println(slots[i].gibName() + ": CHF " + df.format(slots[i].gibPreis()) + " Anzahl: " + slots[i].gibAnzahl());         
        }
        System.out.println("###########################################");
    }
}

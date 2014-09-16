
/**
 * Write a description of class Uebung1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung1
{
    private String nachname;
    private String vorname;
    private static int personen;
    
    public String getNachname() {
        return nachname;
    }
    
    public String getVorname() {
        return vorname;
    }
    
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    
    public int getAnzahlInitialisiertePersonen() {
        return personen;
    }
    
    public Uebung1(String vorname, String nachname) {
        personen++;
        this.nachname = nachname;
        this.vorname = vorname;
    }
}

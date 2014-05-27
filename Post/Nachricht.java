
/**
 * Stellt einen einzelnen Brief / Nachricht dar
 * 
 * @author Maurus Kühne
 * @version 1.0
 */
public class Nachricht
{
    private String empfaenger;
    private String absender;
    private String text;

    /**
     * Erstellt eine neue Nachricht
     * @param   empfaenger  Emfpänger der Nachricht
     * @param   absender    Der Absender der Nachricht
     * @param   text        Inhalt der Nachricht
     */
    public Nachricht(String empfaenger, String absender, String text)
    {
        this.empfaenger = empfaenger;
        this.absender = absender;
        this.text = text;
    }

    /**
     * Gibt den Empfänger der Nachricht zurück
     * 
     * @return     der Empfänger der Nachricht
     */
    public String gibEmpfaenger()
    {
        return empfaenger;
    }
    
    /**
     * Gibt den Absender der Nachricht zurück
     * 
     * @return     der Absender der Nachricht
     */
    public String gibAbsender()
    {
        return absender;
    }
    
    /**
     * Gibt den Inhalt der Nachricht zurück
     * 
     * @return     der Inhalt der Nachricht
     */
    public String gibText()
    {
        return text;
    }
}

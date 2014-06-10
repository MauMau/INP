import java.util.ArrayList;

/**
 * Stellt eine Post dar, auf welcher mehrere Nachrichten abgelegt werden können.
 * Kunden können Nachrichten ablegen und abholen.
 * 
 * @author Maurus Kühne 
 * @version 1.0
 */
public class Post
{
    private ArrayList<Nachricht> nachrichten;

    /**
     * Erstellt eine neue Post-Instanz
     */
    public Post()
    {
        nachrichten = new ArrayList<Nachricht>();
    }
    
    /**
     * Versucht eine Nachricht auf der Post abzulegen
     * 
     * @param   nachricht   Die abzulegende Nachricht
     * 
     * @return true: Nachricht konnte abgelegt werden, false: Nachrich konnte nicht abgelegt werden
     */
    public boolean speichereNachricht(Nachricht nachricht)
    {
        return this.nachrichten.add(nachricht);
    }
    
    /**
     * Holt die nächste Nachricht für den Kunden ab
     * 
     * @param   empfaenger  Empfänger der Nachricht
     * @param   text        Inhalt der nachricht
     * 
     * @return Nachricht die abgeholt wurde
     */
    public Nachricht holeNachricht(String kundenName)
    {
        Nachricht returnValue = null;
        
        for(Nachricht nachricht : nachrichten)
        {   
            if(nachricht.gibEmpfaenger() == kundenName)
            {
                returnValue = nachricht;
                this.nachrichten.remove(returnValue);
                return returnValue;
            }
        }
        
        return null;
    }
    
}

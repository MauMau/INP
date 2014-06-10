import java.util.ArrayList;

/**
 * Stellt eine Post dar, auf welcher jeweils eine Nachricht abgelegt werden kann.
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
     * @return true: Nachricht konnte abgelegt werden, false: Bereits eine Nachricht vorhanden,
     *         ablegen nicht möglich
     */
    public boolean speichereNachricht(Nachricht nachricht)
    {
        return this.nachrichten.add(nachricht);
    }
    
    /**
     * Erstellt eine neue Nachricht
     * 
     * @param   empfaenger  Empfänger der Nachricht
     * @param   text        Inhalt der nachricht
     * 
     * @return true: Nachricht konnte abgelegt werden, false, konnte nicht abgelegt werden
     */
    public Nachricht holeNachricht(String kundenName)
    {
        Nachricht returnValue = null;
        
        for(Nachricht nachricht : nachrichten)
        {   
            if(nachricht != null && nachricht.gibEmpfaenger() == kundenName)
            {
                returnValue = nachricht;
                break;
            }
        }
        
        if(returnValue != null)
            this.nachrichten.remove(returnValue);
        
        return returnValue;
    }
    
}

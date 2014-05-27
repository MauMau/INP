
/**
 * Stellt eine Post dar, auf welcher jeweils eine Nachricht abgelegt werden kann.
 * Kunden können Nachrichten ablegen und abholen.
 * 
 * @author Maurus Kühne 
 * @version 1.0
 */
public class Post
{
    private Nachricht nachricht;

    /**
     * Erstellt eine neue Post-Instanz
     */
    public Post()
    {
        nachricht = null;
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
        if(this.nachricht != null)
        {
            return false;
        }
        
        this.nachricht = nachricht;
        
        return true;
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
        
        if(nachricht != null && nachricht.gibEmpfaenger() == kundenName)
        {
            returnValue = this.nachricht;
            this.nachricht = null;
        }
        
        return returnValue;
    }
    
}

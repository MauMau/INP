
/**
 * Kunde, kann Nachrichten erstellen und abholen
 * 
 * @author Maurus Kühne
 * @version 1.0
 */
public class Kunde
{
    Post post;
    String name;
    
    /**
     * Erstellt einen neuen Kunden
     * 
     * @param   post    Die Post, bei welcher der Kunde seine Nachrichten ablegen soll
     * @param   name    Name des Kunden
     */
    public Kunde(Post post, String name)
    {
        this.post = post;
        this.name = name;
    }
    
    /**
     * Erstellt eine neue Nachricht
     * 
     * @param   empfaenger  Empfänger der Nachricht
     * @param   text        Inhalt der nachricht
     * 
     * @return true: Nachricht konnte abgelegt werden, false, konnte nicht abgelegt werden
     */
    public boolean neueNachricht(String empfaenger, String text)
    {
        Nachricht n = new Nachricht(empfaenger, this.name, text);
        
        if(post.speichereNachricht(n))
        {
            System.out.println("Brief auf Poststelle abgelegt");
            return true;
        }
        else
        {
            System.out.println("Nachricht konnte aufgrund einer Überlastung nicht abgelegt werden.");
            
            return false;
        }
    }
    
    /**
     * Holt Nachricht von der Post ab, sofern sie an diesen Kunden verschickt wurde
     * 
     * @return Die von der Post abgeholte Nachricht. Gibt NULL zurück wenn keine Nachricht vorhanden
     */
    public Nachricht holeNaechsteNachricht()
    {
        Nachricht n = post.holeNachricht(this.name);
        
        if(n == null)
        {
            System.out.println("Keine Nachricht für dich vorhanden");
        }
        else
        {
            System.out.println("Neue Nachricht von: " + n.gibAbsender());
        }
        
        return n;
    }
}

import java.util.*;
/**
 * Write a description of class Uebung3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung3
{
    HashMap<String, Person> _telefonbuch = new HashMap<String, Person>();
        
    public void Uebung3()
    {
        _telefonbuch.put("071 300 20 00", new Person ("Maurus Kühne (work)"));
        _telefonbuch.put("079 200 30 30", new Person ("Maurus Kühne (mobile)"));
        _telefonbuch.put("055 200 30 00", new Person ("Maurus Kühne (home)"));
        
        Person p2 = _telefonbuch.get("055 200 30 00");
        
        System.out.println(p2.getName());
    }
    
    public void speichereTelefonNummer(String telNr, Person p)
    {
        _telefonbuch.put(telNr, p);
    }
    
    public Person findePersonZuNummer(String telNr) 
    {
        return _telefonbuch.get(telNr);
    }
}

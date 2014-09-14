import java.util.*;
/**
 * Write a description of class Uebung3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung3
{
    public void Uebung3()
    {
        HashMap<String, Person> _telefonbuch = new HashMap<String, Person>();
        
        _telefonbuch.put("071 300 20 00", new Person ("Maurus Kühne (work)"));
        _telefonbuch.put("079 200 30 30", new Person ("Maurus Kühne (mobile)"));
        Person p1 = new Person ("Maurus Kühne (home)");
        _telefonbuch.put("055 200 30 00", p1);
        _telefonbuch.put("055 200 30 00", p1);
        
        Person p2 = _telefonbuch.get("055 200 30 00");
        
        System.out.println(p2.getName());
    }
}

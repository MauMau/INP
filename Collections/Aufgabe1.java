import java.util.*;

/**
 * @author Maurus Kühne
 * @version 01.09.2014
 */
public class Aufgabe1
{
    public static void main()
    {
       //HashMap erstellen, welche als Key einen String und als Wert ein Objekt vom Typ 
       //Person entgegennimmt
       HashMap<String, Person> map = new HashMap<String, Person>();
       
       //HashMap mit zwei Schlüssel/Wert Paaren befüllen
       map.put("7561234567890", new Person("Maurus Kühne"));
       map.put("7560987654321", new Person("Ruel Holderegger"));
       
       //Person anhand der Versichertennummer auslesen
       Person p = map.get("7560987654321");
       
       //HashMap eignet sich hier, da wir genau wissen, nach welchen Werten wir suchen möchten
       // (Versichertennummer). 
    }
}

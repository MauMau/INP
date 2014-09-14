import java.util.*;
/**
 * Write a description of class Uebung4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uebung4
{
    public void Uebung4()
    {
        HashMap<String, String> _telefonbuch = new HashMap<String, String>();
        
        _telefonbuch.put("123456790", "Maurus Kühne");
        _telefonbuch.put("0987654321", "Natascha Kühne");
        
        for(Map.Entry<String,String> entry : _telefonbuch.entrySet()) {
            String telNr = entry.getKey();
            String name = entry.getValue();

            System.out.println(telNr + " => " + name);
        }
    }
}

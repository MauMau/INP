import java.util.ArrayList;

public class Personenverwaltung
{
    private ArrayList<String> personen;

    public Personenverwaltung()
    {
        personen = new ArrayList<String>();
    }
    
    public void neuePersonHinzufuegen(String name)
    {
        personen.add(name);
    }
    
    public String gibPersonAnPosition(int position)
    {
        if(position < 0 || position >= personen.size())
        {
            System.out.println("Der Parameter position ist ungültig");
            return null;
        }
        
        return personen.get(position);
    }
    
    public int gibAnzahlGespeichertePerson()
    {
        return personen.size();
    }
    
    public void loeschePersonAnPosition(int position)
    {
        if(position < 0 || position >= personen.size())
        {
            System.out.println("Der Parameter position ist ungültig");
            return;
        }
        
        personen.remove(position);
    }
}

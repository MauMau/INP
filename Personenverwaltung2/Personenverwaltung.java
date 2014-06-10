import java.util.ArrayList;

public class Personenverwaltung
{
    private ArrayList<Person> personen;

    public Personenverwaltung()
    {
        personen = new ArrayList<Person>();
    }
    
    public void neuePersonHinzufuegen(Person person)
    {
        personen.add(person);
    }
    
    public Person gibPersonAnPosition(int position)
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
    
    public void alleNamenAnzeigen()
    {
        for(Person p : personen)
        {
            System.out.println(p.gibName());
        }
    }
    
    public boolean istPersonInSammlungVorhanden(Person person)
    {
        for(Person p : personen)
        {
            if(person == p)
                return true;
        }
        
        return false;
    }
    
    public int gibPositionVonNamenInSammlung(String name)
    {
        for(Person p : personen)
        {
            if(name == p.gibName())
                return personen.indexOf(p);
        }
        
        return -1;
    }
}

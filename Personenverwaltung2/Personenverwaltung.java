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
    
    public void personEinfuegen(String vorname, String nachname, int alter, String telnummer, String handynummer)
    {
        Person p = new Person(nachname, vorname, telnummer, handynummer, alter);
        
        personen.add(p);
    }
    
    public void listeAusgeben()
    {
        System.out.println("--------------------------");
        
        for(Person p : personen)
        {
            System.out.println("Vorname: " + p.gibVorname());
            System.out.println("Nachname: " + p.gibName());
            System.out.println("Alter: " + p.gibAlter());
            System.out.println("TelNr: " + p.gibTelNr());
            System.out.println("HandyNr: " + p.gibHandyNr());
        }
        
        System.out.println("--------------------------");
    }
}

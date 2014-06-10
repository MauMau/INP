import java.util.ArrayList;
import java.util.HashMap;

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
            if(name.equals(p.gibName()))
                return personen.indexOf(p);
        }
        
        return -1;
    }
    
    //complex
    
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
            
            
            System.out.println("--------------------------");
        }
        
    }
    
    public int gibAltersDurchschnitt()
    {
        int pCount = personen.size();
        int sum = 0;
        
        for(Person p : personen)
        {
            sum += p.gibAlter();
        }
        
        return sum / pCount;
    }
    
    public int zaehleBestimmtenAnfangsbuchstaben(char buchstabe)
    {
        int count = 0;
        
        for(Person p : personen)
        {
            if(p.gibName().charAt(0) == (buchstabe))
                count++;
        }
        
        return count;
    }
    
    public Person gibAeltestePerson()
    {
        Person p = null;
        int maxAlter = 0;
        for(Person person : personen)
        {
            if(person.gibAlter() > maxAlter)
            {
                p = person;
                maxAlter = person.gibAlter();
            }
        }
        
        return p;
    }
    
    //very complex
    
    public int anzahlGleicherPersonenBestimmen()
    {
        int retVal = 0;
        ArrayList<Person> geprueftePersonen = new ArrayList<Person>();
        
        for(Person p : personen)
        {
            geprueftePersonen.add(p);
            for(Person p2 : personen)
            {
                if(!geprueftePersonen.contains(p2))
                {
                    if(p.gibVorname().equals(p2.gibVorname()) &&
                       p.gibName().equals(p2.gibName()) &&
                       p.gibAlter() == p2.gibAlter() &&
                       p.gibTelNr().equals(p2.gibTelNr()) &&
                       p.gibHandyNr().equals(p2.gibHandyNr()))
                    {
                        retVal++;
                    }
                }
            }
        }
        
        return retVal;
    }
    
    public void setup()
    {
        this.personEinfuegen("mk", "mk", 22, "mk","mk");
        this.personEinfuegen("nk", "nk", 24, "nk","nk");
        this.personEinfuegen("mk", "mk", 22, "mk","mk");
    }
    
    public Person suchePersonNachNachname(String nachname)
    {
        Person retVal = null;
        for(Person p : personen)
        {
            if(p.gibName().equals(nachname))
            {
                retVal = p;
                break;
            }
        }
        
        return retVal;
    }
    
    public ArrayList<Person> suchePersonenNachNachname(String nachname)
    {
        ArrayList<Person> retVals = new ArrayList<Person>();
        for(Person p : personen)
        {
            if(p.gibName().equals(nachname))
            {
                retVals.add(p);
            }
        }
        
        return retVals;
    }
    
    public Person suchePerson(String vorname, String nachname, int alter)
    {
        Person retVal = null;
        for(Person p : personen)
        {
            if(p.gibName().equals(nachname) && p.gibVorname().equals(vorname) && 
               alter == p.gibAlter())
            {
                retVal = p;
                break;
            }
        }
        
        return retVal;
    }
    
    public Person suchePerson(Person p)
    {
        return this.suchePerson(p.gibVorname(), p.gibName(), p.gibAlter());
    }
    
    public boolean entfernePerson(int position)
    {
        if(personen.size() < position && position > 0)
        {
            personen.remove(position);
            return true;
        }
        
        return false;
    }
    
    public boolean entfernePerson(Person p)
    {
        if(personen.contains(p))
        {
            personen.remove(p);      
            return true;
        }
        return false;
    }
    
    public void entferneDuplikate()
    {
        ArrayList<Person> geprueftePersonen = new ArrayList<Person>();
        ArrayList<Person> zuEntfernen = new ArrayList<Person>();
        
        for(Person p : personen)
        {
            geprueftePersonen.add(p);
            for(Person p2 : personen)
            {
                if(!geprueftePersonen.contains(p2))
                {
                    if(p.gibVorname().equals(p2.gibVorname()) &&
                       p.gibName().equals(p2.gibName()) &&
                       p.gibAlter() == p2.gibAlter() &&
                       p.gibTelNr().equals(p2.gibTelNr()) &&
                       p.gibHandyNr().equals(p2.gibHandyNr()))
                    {
                        zuEntfernen.add(p2);
                    }
                }
            }
        }
        
        personen.removeAll(zuEntfernen);
    }
}



public class Person
{
    // instance variables - replace the example below with your own
    private String name;
    private String vorname;
    private String telNr;
    private String handyNr;
    private int alter;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, String vorname, String telNr, String handyNr, int alter)
    {
        this.name = name;
        this.vorname = vorname;
        this.telNr = telNr;
        this.handyNr = handyNr;
        this.alter = alter;
    }
    
    public String gibName()
    {
        return name;
    }
    
    public String gibVorname()
    {
        return vorname;
    }
    
    public String gibTelNr()
    {
        return telNr;
    }
    
    public String gibHandyNr()
    {
        return handyNr;
    }
    
    public int gibAlter()
    {
        return alter;
    }
}

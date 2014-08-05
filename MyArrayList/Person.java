
/**
 * Person-Mockup Klasse
 * 
 * @author Maurus Kühne
 * @version 05.08.2014
 */
public class Person
{
    private String name;

    public Person(String name)
    {
        this.name = name;
    }
    
    public Person()
    {
        
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}

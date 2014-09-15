
/**
 * Write a description of class Reservation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reservation
{
    private String _name;
    private String _geraet;
    
    public Reservation(String name, String geraet)
    {
        _name = name;
        _geraet = geraet;
    }
    
    public String getName(){
        return _name;
    }
    
    public String getGeraet(){
        return _geraet;
    }
    
}

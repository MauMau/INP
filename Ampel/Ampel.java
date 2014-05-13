public class Ampel
{
    boolean rot;
    boolean gelb;
    boolean gruen;
    
    public Ampel()
    {
        rot = false;
        gelb = false;
        gruen = true;
    }
    
    public Ampel(boolean istGruen)
    {
        if(istGruen)
        {
            rot = false;
            gelb = false;
            gruen = true;
        }
        else
        {
            rot = true;
            gelb = false;
            gruen = false;
        }
    }
    
    public void schalten()
    {
        if(gruen)
        {
            gruen = false;
            gelb = true;
        }
        else if(!rot && gelb)
        {
            gelb = false;
            rot = true;
        }
        else if(rot && !gelb)
        {
            gelb = true;
        }
        else
        {
            rot = false;
            gelb = false;
            gruen = true;
        }
    }
    
    public void zeichneAmpel()
    {
        System.out.println(rot ? "O" : ".");
        System.out.println(gelb ? "O" : ".");
        System.out.println(gruen ? "O" : ".");
    }
}

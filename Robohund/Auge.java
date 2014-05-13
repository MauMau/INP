public class Auge
{
    private boolean zustand;

    public Auge(boolean zustand)
    {
        this.zustand = zustand;
    }

    public void oeffne()
    {
        zustand = true;
    }
    
    public void schliesse()
    {
        zustand = false;
    }
    
    public boolean gibAugeZustand()
    {
        return zustand;
    }
}

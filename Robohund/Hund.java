public class Hund
{
    private Auge linkesAuge;
    private Auge rechtesAuge;

    public Hund()
    {
        linkesAuge = new Auge(true);
        rechtesAuge = new Auge(true);
    }
    
    public Hund(boolean linkesAugeOffen, boolean rechtesAugeOffen)
    {
        linkesAuge = new Auge(linkesAugeOffen);
        rechtesAuge = new Auge(rechtesAugeOffen);
    }
    
    public void augenOeffnen()
    {
        linkesAuge.oeffne();
        rechtesAuge.oeffne();
    }
    
    public void augenSchliessen()
    {
        linkesAuge.schliesse();
        rechtesAuge.schliesse();
    }
    
    public void zeigeAugen()
    {
        String str = "";
        
        str += linkesAuge.gibAugeZustand() ? "O" : "_";
        str += ".";
        str += rechtesAuge.gibAugeZustand() ? "O" : "_";
        
        System.out.println(str);
    }
}

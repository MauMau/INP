
public class Lohn
{
    String name;
    double ansatz;
    double sollStunden;
    double ueberzeitFaktor;
    double wochenendFaktor;

    double habenStunden[];
    
    public Lohn(String name, 
                double ansatz, 
                double sollStunden, 
                double ueberzeitFaktor, 
                double wochenendFaktor)
    {
        this.name = name;
        this.ansatz = ansatz;
        this.sollStunden = sollStunden;
        this.ueberzeitFaktor = ueberzeitFaktor;
        this.wochenendFaktor = wochenendFaktor;

        habenStunden = new double[7];
    }
    
    public void rapportiereStunden(int tag, double anzahlStunden)
    {
        if(tag <0 || tag > 6)
            System.out.println("Tag muss zwischen 0 und 6 liegen (0=Montag, 6=Sonntag)");        
        else
        {
            habenStunden[tag] += anzahlStunden;
        }
    }
    
    public void uebersicht()
    {
        System.out.println("Arbeitsrapport von " + name);
        System.out.println("--------------------------------------------------");
        
        System.out.println("Tag\t\tHaben\tUeberstunden\tVerdienst");
        
        double totalStunden = 0;
        double totalVerdienst = 0;
        
        for(int i = 0; i < 7; i++)
        {
            double ueberstunden = 0;
            double verdienst = 0;
            double ueberstundenAnsatz = ueberzeitFaktor;
            if(i < 5)
            {
                ueberstunden = habenStunden[i] - sollStunden;
                ueberstunden = ueberstunden < 0 ? 0 : ueberstunden;
            }
            else
            {
                ueberstunden = habenStunden[i];
                ueberstundenAnsatz = wochenendFaktor;
            }
            
            double grundHaben = habenStunden[i] - ueberstunden;
            
            verdienst = grundHaben * ansatz;
            verdienst += ueberstunden * ansatz * ueberstundenAnsatz;
            
            totalStunden += habenStunden[i];
            totalVerdienst += verdienst;
            
            System.out.println(wochenTag(i) + "\t" + habenStunden[i] + "\t" + ueberstunden + "\t\t" + verdienst);
        }
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("Stundentotal: " + totalStunden + "\tDurchschnitt (h): " + (totalStunden / 7f) + 
                           "\tDurchschnitt(Fr.): " + (totalVerdienst / 7f));
    }
    
    private String wochenTag(int i)
    {
        switch(i)
        {
            case 0:
            return "Montag    ";
            case 1:
            return "Dienstag  ";
            case 2: 
            return "Mittwoch  ";
            case 3:
            return "Donnerstag";
            case 4:
            return "Freitag   ";
            case 5:
            return "Samstag   ";
            case 6:
            return "Sonntag   ";
        }
        
        return "Tag " + i + " gibt es nicht"; 
    }
}

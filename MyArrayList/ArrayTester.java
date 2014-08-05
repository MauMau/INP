
/**
 * Unit Tests für MyArrayList
 * 
 * @author Maurus Kühne
 * @version 05.08.2014
 */
public class ArrayTester
{
    public static void runAllTestCases()
    {
        testAddAndGetMethod();
        testAutoSizing();
        testRemove();
        testClearAndSize();
        testSet();
        testToArray();
        testGetIndex();
        testTrimToSize();
    }
    
    private static void testSet()
    {
        System.out.println("***************testSet*****************");
        MyArrayList l = new MyArrayList();
        
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(new Person("3"));
        l.add(new Person("4"));
        l.add(new Person("5"));
        
        
        System.out.println("Objekt an 2. Stelle ist: " + l.get(1).getName());
        l.set(1, new Person("Neu an 2. Stelle"));
        System.out.println("Objekt an 2. Stelle ist nun: " + l.get(1).getName());
    }
    
    private static void testAddAndGetMethod()
    {
        System.out.println("***************testAddAndGetMethod*****************");
        MyArrayList l = new MyArrayList();
        
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(new Person("3"));
        l.add(new Person("4"));
        l.add(new Person("5"));
        
        for(int i  = 0; i < 5; i++)
        {
            System.out.println("lese Objekt an Position: " + i + " - Wert: " + l.get(i).getName());
        }
        
        System.out.println("Füge neues Objekt an 2. Stelle ein...");
        l.add(1, new Person("Neu an 2. Stelle"));
        System.out.println("Objekt an 2. Stelle ist nun: " + l.get(1).getName());
        
        System.out.println("Objekt an 6. Stelle ist nun: " + l.get(5).getName());
    }
    
    private static void testAutoSizing()
    {
        System.out.println("***************testAutoSizing*****************");
        MyArrayList l = new MyArrayList();
        
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(new Person("3"));
        l.add(new Person("4"));
        l.add(new Person("5"));
        l.add(new Person("6"));
        l.add(new Person("7"));
        System.out.println("7. Objekt eingefügt, Grösse: " + l.getArraySize());
        l.add(new Person("8"));
        System.out.println("8. Objekt eingefügt, Grösse: " + l.getArraySize());
        l.add(new Person("9"));
        System.out.println("9. Objekt eingefügt, Grösse: " + l.getArraySize());
        l.add(new Person("10"));
        System.out.println("10. Objekt eingefügt, Grösse: " + l.getArraySize());
        l.add(new Person("11"));
        System.out.println("11. Objekt eingefügt, Grösse: " + l.getArraySize());
        l.add(new Person("12"));
        System.out.println("12. Objekt eingefügt, Grösse: " + l.getArraySize());
        
        System.out.println("Objekt an 1. Positon " + l.get(0).getName());
        
        System.out.println("Objekt an 12. Positon " + l.get(11).getName());
        
    }
    
    private static void testRemove()
    {
        System.out.println("***************testRemove*****************");
        MyArrayList l = new MyArrayList();
        
        Person drittePerson = new Person("3");
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(drittePerson);
        l.add(new Person("4"));
        l.add(new Person("5"));
        
        System.out.println("Entferne Person an zweiter Stelle");
        l.remove(1);
        System.out.println("Neue Person an zweiter Stelle: " + l.get(1).getName());
        System.out.println("Entferne spezifische Person (3)");
        l.remove(drittePerson);
        System.out.println("Neue Person an zweiter Stelle: " + l.get(1).getName());
        System.out.println("Neue Person an dritter Stelle: " + l.get(2).getName());
    }
    
    private static void testClearAndSize()
    {
        System.out.println("***************testClearAndSize*****************");
        MyArrayList l = new MyArrayList();
        
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(new Person("3"));
        l.add(new Person("4"));
       
        System.out.println("Array enthält " + l.size() + " Objekte");
        
        l.clear();
        
        if(l.size() == 0)
            System.out.println("Array erfolgreich gelöscht");
        else
            System.out.println("Array NICHT erfolgreich gelöscht");
    } 
    
    private static void testToArray()
    {
        System.out.println("***************testToArray*****************");
        MyArrayList l = new MyArrayList();
        
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(new Person("3"));
        l.add(new Person("4"));
        
        Person[] arr = l.toArray();
        
        System.out.println("Länge von 4 Personen grossem Array: " + arr.length);
    }
    
    private static void testGetIndex()
    {
        System.out.println("***************testGetIndex*****************");
        MyArrayList l = new MyArrayList();
        
        Person drittePerson = new Person("3");
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(drittePerson);
        l.add(new Person("4"));
        l.add(new Person("5"));
        
        System.out.println("Index der dritten Person (sollte 2 sein): " + l.getIndex(drittePerson));
    }
    
    private static void testTrimToSize()
    {
        System.out.println("***************testTrimToSize*****************");
        MyArrayList l = new MyArrayList();
        
        l.add(new Person("1"));
        l.add(new Person("2"));
        l.add(new Person("3"));
        l.add(new Person("4"));
        
        System.out.println("Arraygrösse vor trim: " + l.getArraySize());
        l.trimToSize();
        System.out.println("Arraygrösse nach trim: " + l.getArraySize());
    }
}


/**
 * Meine eigene ArrayList...
 * 
 * @author Maurus Kühne
 * @version 05.08.2014
 */
public class MyArrayList
{
    // aktuelles Datenarray
    private Person[] _content;
    private int _lastEmptyIndex;
    
    public MyArrayList()
    {
        // initialise instance variables
        _content = new Person[10];
        _lastEmptyIndex = 0;
    }

    public void add(Person p)
    {
        ensureArraySize(1);
        
        _content[_lastEmptyIndex++] = p;
    }
    
    public void add(int index, Person p)
    {
        ensureArraySize(1);
        
        if(p == null)
            return;
        
        for(int i = _lastEmptyIndex; i > index; i--)
        {
            _content[i + 1] = _content[i];
        }
        
        _content[index] = p;
        
        _lastEmptyIndex++;
    }
    
    public Person remove(int index)
    {
        Person retVal = _content[index];
        
        for(int i = index; i <= _lastEmptyIndex; i++)
        {
            _content[i] = _content[i + 1];
        }
        
        _lastEmptyIndex--;
        
        return retVal;
    }
    
    public boolean remove(Person p)
    {
        int index = getIndex(p);
        if(index >= 0)
        {
            remove(index);
            return true;
        }
        else
            return false;
    }
    
    public void clear()
    {
        for(int i = 0; i < _lastEmptyIndex; i++)
        {
            _content[i] = null;
        }
        _lastEmptyIndex = 0;
    }
    
    public Person set(int index, Person p)
    {
        if(p == null)
        {
            return remove(index);
        }
        _content[index] = p;
        
        return p;
    }
    
    public Person get(int index)
    {
        return _content[index];
    }
    
    public Person[] toArray()
    {
        Person retVal[] = new Person[this.size()];
        this.copyArrayTo(_content, retVal, this.size());
        return retVal;
    }
    
    public int getIndex(Person p)
    {
        for(int i = 0; i < _lastEmptyIndex; i++)
        {
            if(_content[i] == p) return i;
        }
        
        return -1;
    }
    
    public void trimToSize()
    {
        int desiredSize = this.size() + 2;
        Person oldArray[] = this._content; 
        this._content = new Person[desiredSize];
        this.copyArrayTo(oldArray, this._content, this.size());
    }
    
    private void ensureArraySize(int numberOfItemsToAdd)
    {
        if(_content.length <= this.size() + numberOfItemsToAdd + 1)
        {
            Person[] oldArray = _content;
            
            _content = new Person[oldArray.length * 2];
            
            copyArrayTo(oldArray, _content, oldArray.length);
        }
    }
    
    private void copyArrayTo(Person[] fromArray, Person[] toArray, int numberOfElements)
    {
        for(int i = 0; i < numberOfElements; i++)
        {
            toArray[i] = fromArray[i];
        }
    }
    
    public int size()
    {
        return _lastEmptyIndex;
    }
    
    public int getArraySize()
    {
        return _content.length;
    }
}

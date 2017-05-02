//Name: Ronald Baasland
//Project: class Set: Vector
//Date: Septemeber 28, 2008


public abstract class Vector
{
    protected static final int DEFAULT_CAPACITY = 100;
    protected Object[] data;
    protected int numItems;
    
    public Vector()
    {
        data = new Object[DEFAULT_CAPACITY];
    }
    
    public abstract boolean append(Object element);
    
    public void clear()
    {
        for (int j = 0; j < numItems; j++)
            data[j] = null;
        numItems = 0;
    }
    
    public boolean contains(Object element)
    {
        return indexOf(element) != -1;
    }
    
    public Object elementAt(int index)
    {
        if (index < 0 || index > numItems - 1)
            return null;
        return data[index];
    }
    
    public int indexOf(Object element)
    {
        for (int j = 0; j < numItems; j++)
            if (element.equals(data[j]))
                return j;
        return -1;
    }
    
    public abstract boolean insertAt(int index, Object element);
    
    public boolean isEmpty()
    {
        return numItems == 0;
    }
    
    protected boolean isFull()
    {
        return numItems == data.length;
    }
    
    public Object removeAt(int index)
    {
        if (index < 0 || index > numItems - 1)
            return null;
        Object temp = data[index];
        while (index < numItems - 1)
        {
            data[index] = data[index + 1];
            index++;
        }
        data[--numItems] = null;
        return temp;
    }
    
    public boolean remove(Object element)
    {
        int pos = indexOf(element);
        if (pos == -1)
            return false;
        removeAt(pos);
        return true;
    }
    
    public boolean replace(int index, Object element)
    {
        if (index < 0 || index > numItems - 1)
            return false;
        data[index] = element;
        return true;
    }
    
    public int size()
    {
        return numItems;
    }
}
    
    
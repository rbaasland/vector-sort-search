//Name: Ronald Baasland
//Project: class Set: FixedVector
//Date: Septemeber 28, 2008

public class FixedVector extends Vector
{
    public FixedVector(){}
    
    public boolean append(Object element)
    {
        if (isFull())
            return false;
        data[numItems++] = element;
        return true;
    }
    
    public boolean insertAt(int index, Object element)
    {
        if (index < 0 || index > numItems - 1 || isFull())
            return false;
        for (int j = numItems - 1; j >= index; j--)
            data[j + 1] = data[j];
        data[index] = element;
        numItems++;
        return true;
    }
    
    public boolean isFull()
    {
        return super.isFull();
    }
}
       
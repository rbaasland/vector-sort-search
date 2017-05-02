//Name: Ronald Baasland
//Project: class Set: DynamicVector
//Date: Septemeber 28, 2008
import java.util.Iterator;

public class DynamicVector extends Vector
{
    public DynamicVector() {}
    
    public DynamicVector(int initCapacity)
    {
        if (initCapacity <= 0)
            data = new Object[DEFAULT_CAPACITY];
        else
            data = new Object[initCapacity];
     }
     
     public boolean append(Object element)
     {
         if( isFull())
         {
             Object[] newData = new Object[data.length * 2];
             for (int j = 0; j < numItems; j++)
                newData[j] = data[j];
             data = newData;
         }
         data[numItems++] = element;
         return true;
     }
      
     public void ensureCapacity(int minCapacity)
     {
         if (minCapacity <= data.length)
            return;
        Object[] newData = new Object[minCapacity];
        for (int j = 0; j < numItems; j++)
            newData[j] = data[j];
        data = newData;
    }
    
    public boolean insertAt(int index, Object element)
    {
        if (index < 0 || index > numItems - 1)
            return false;
        int i, j;
        if (isFull())
        {
            Object[] newData = new Object[data.length * 2];
            for (i = j = 0; j < numItems; i++, j++)
            {
                if (j == index)
                {
                    i++;
                    continue;
                }
                newData[i] = data[j];
            }
            data = newData;
            data[index] = element;
            numItems++;
            return true;
        }
        for (j = numItems - 1; j >= index; j--)
            data[j + 1] = data[j];
        data[index] = element;
        numItems++;
        return true;
    }

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}

   
        
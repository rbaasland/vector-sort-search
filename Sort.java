public class Sort
{
    private Sort() {}
    
    public static void swap(Vector vec, int first, int second)
    {
        Object temp = vec.elementAt(first);
        vec.replace(first, vec.elementAt(second));
        vec.replace(second, temp);
    }
    
    public static void bubbleSort(Vector vec)
    {
        int i, j, n = vec.size();
        Comparable first, second;
        for (i = 1; i < n; i++)
            for (j = n - 1; j >= i; j--)
            {
                first = (Comparable)vec.elementAt(j - 1);
                second = (Comparable)vec.elementAt(j);
                if (first.compareTo(second) > 0)
                    swap(vec, j - 1, j);
            }
            
        }
        
        public static void selectionSort(Vector vec)
        {
            int i, j, n = vec.size(), smallPos;
            Comparable smallest, current;
            for (i = 0; i < n - 1; i++)
            {
                smallPos = i;
                smallest = (Comparable)vec.elementAt(smallPos);
                for (j = i + 1; j < n; j++)
                {
                    current = (Comparable)vec.elementAt(j);
                    if (current.compareTo(smallest) < 0)
                    {
                        smallPos = j;
                        smallest = (Comparable)vec.elementAt(smallPos);
                    }
                }
                if (smallPos != i)
                    swap(vec, i, smallPos);
            
           }
        }
        
        public static void insertionSort(Vector vec, int left,int right)
        {
        	int inner,outer;
        	Object target;
        	for (outer = left + 1; outer <= right; outer++)
        	{
        		target = vec.elementAt(outer);
        		inner = outer;
        		while (inner > left && ((Comparable)vec.elementAt(inner - 1)).compareTo(target) > 0)
        		{
        			vec.replace(inner, vec.elementAt(inner - 1));
        			inner--;
        		}
        		vec.replace(inner, target);
        	}
        	
        	
        	
        }
    }

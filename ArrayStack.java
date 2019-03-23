public class ArrayStack<T> implements Stack<T> {
    
    private T[] arr;
    private int head = -1;
    
    public ArrayStack() 
    {
        Object[] temp_arr = (T[])(new Object[10]);
        arr = (T[]) temp_arr;
    }
    
    // double size
    private void growArray() 
    {
        Object[] temp_arr = new Object[arr.length * 2];
        T[] cast_arr = (T[]) temp_arr;

        for (int i = 0; i < arr.length; i++) 
        {
            cast_arr[i] = arr[i];
        }
        arr = cast_arr;
    }
    
    public void push(T item) 
    {
        if (head == arr.length - 1) 
        {
            growArray();
        }

        arr[++head] = item;
    }
    

    public T peek() 
    {
        if (empty()) 
        {
            return null;
        }
        
        return arr[head];
    }
    
    
    public T pop() 
    {
        if (empty()) 
        {
            return null;
        }

        return arr[head--];
    }
    
    public boolean empty() 
    {
        if (head == -1)
        {
            return true;
        }

        return false;
    }
}

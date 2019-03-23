public class ArrayQueue<T> implements Queue<T> {
    
    private int head = 0;
    private int tail = 0;
    private T[] arr;
    
    public ArrayQueue() 
    {
        Object[] temp_arr = new Object[10];
        arr = (T[]) temp_arr; // casting
    }
    
    public void enqueue(T item) 
    {
        if (tail == arr.length) 
        {
            growArray();
        }

        arr[tail++] = item;
    }
    
    public T dequeue() 
    {
        if (empty()) 
        {
            return null;
        }

        return arr[head++];
    }
    
    public boolean empty() 
    {
        if (head == tail)
        {
            return true;
        }

        return false;
    }
    
    private void growArray() 
    {
        Object[] temp_arr = new Object[arr.length * 2];
        T[] arrC = (T[]) temp_arr;

        for (int i = 0; i < arr.length; i++) 
        {
            arrC[i] = arr[i];
        }
        arr = arrC;
    }
}

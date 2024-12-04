import java.lang.reflect.Array;

public class  CircularQueue<T extends Comparable<T>> implements Queueable<T> {
	
	
	private int count,front,back;
	private T[] arr;
	
@SuppressWarnings("unchecked")
public CircularQueue(Class <T> clazz,int size) {
	arr=(T[]) Array.newInstance(clazz, size);
	front=-1;
	back=-1;
	count=0;
}
	
	
	
	@Override
	public void enqueue(T data) {
		
		if(count<arr.length) { 
			back=++back%(arr.length);
			arr[back]=data;
			++count;
		if(count==1) 
			front=back;
		}
	      
		
	}

	@Override
	public T dequeue() {
		if(count>0) {
			T temp=arr[front];
			front=++front%(arr.length);
			--count;
			if(count==0) {
				front=-1;
				back=-1;
			}
			return temp;
		}
		return null;
		
	}

	@Override
	public T getFront() {
		if(count>0) {
			return arr[front];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return count==0;
	}

	@Override
	public void clear() {
	count=0;
	front=-1;
	back=-1;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}

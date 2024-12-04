import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class ArrayQueue<T extends Comparable<T>> implements Queueable<T> {
	
	private int front ,back;
	private T[] arr;
	
	
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(Class<T> clazz,int size) {
		arr = (T[]) Array.newInstance(clazz, size);
		front = -1;
		back = -1;
		
		
	}

	@Override
	public void enqueue(T data) {
		if(isEmpty()) {
			arr[0]=data;
			front++;
			back++;
			
		}else if(back<arr.length-1) {
			arr[++back]=data;
			
		}
		
	}

	@Override
	public T dequeue() {
		T temp=arr[front];
		if(isEmpty()) {
			return null;
		}else {
			for(int i=0;i<back;i++) {
				arr[i]=arr[i+1];
				
			}
			back--;
		}
		return temp;
	}

	@Override
	public T getFront() {
		if(isEmpty()) {
			return null;
		}else {
			return arr[front];
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==-1&&back==-1;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		front=-1;
		back=-1;
		
	}

	@Override
	public void print() {
		for(int i=0;i<back;i++) {
			System.out.println(arr[i].toString());
		}
		
	}

}

import java.lang.reflect.Array;

public class LinkedQueue<T extends Comparable<T>> implements Queueable<T> {
	private Node<T> first;
	private Node<T> last;

	
	
	

	@Override
	public void enqueue(T data) {
		Node<T> newNode=new Node<>(data);
		if(!isEmpty()) {
			last.setNext(newNode);
			last=newNode;
		}else {
			first=newNode;
		}
		
		
		
	}

	@Override
	public T dequeue() {
		T front=this.getFront();
		if(!isEmpty()) {
			first=first.getNext();
			
		}
		if(first==null) {
			last=null;
		}
		return front;
	}

	@Override
	public T getFront() {
		
		if(!isEmpty()) {
			return first.getData();
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (first==null&&last==null);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		first=null;
		last=null;
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}


}



import java.util.Stack;


public class SQueue<T extends Comparable<T>> implements Queueable<T>{
	Stack<T> item=new Stack<>();
	Stack<T> temp=new Stack<>();
	

	@Override
	public void enqueue(T data) {
	while(!item.isEmpty()){
		temp.push(item.pop());
		
	}
	item.push(data);
	while(!temp.isEmpty()){
		item.push(temp.pop());
	}
		
	}

	@Override
	public T dequeue() {
	
		return item.pop();
		
	}

	@Override
	public T getFront() {
		
		return item.peek();
	}

	@Override
	public boolean isEmpty() {
		return item.isEmpty();
	}

	@Override
	public void clear() {
		item.clear();
		
	}

	@Override
	public void print() {
		System.out.println("back->");
		while(item.isEmpty()){
			temp.push(item.pop());
		}
		
		while(!temp.isEmpty()){
			System.out.println("\t"+temp.peek());
			item.push(temp.pop());
		}
	}
	
	
	
	
	
	

}
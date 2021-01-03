package org.kodluyoruz;

public class Queue<T> {
	
	private QueueNode<T> head;
	private QueueNode<T> tail;
	//private int size = 0;
		
	public void add(T element) {
		
		QueueNode<T> n = new QueueNode<T>(element);
		
		if(head == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
	}
	
	public T peek() {

		if(head == null) {
			return null;
		}
		return head.value;
	}
	
	public T pool() {
		
		T res = null;
		
		if(head != null) {
			QueueNode<T> temp = head;
			head = head.next;
			res = temp.value;
		}
		return res;
	}
	
	public void printQueue(Queue queue) 
    { 
		QueueNode<T> temp = queue.head; 
        while (temp != null) {  
            System.out.print(temp.value + " ");
        	temp = temp.next;
        }
        System.out.println();
    }	
}

class QueueNode<T> {
	
	QueueNode<T> next;
	T value;

	public QueueNode(T e) 
	{
		this.value = e;
		this.next = null;
	}
}


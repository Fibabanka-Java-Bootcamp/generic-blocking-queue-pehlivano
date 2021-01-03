package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here
    	
    	Queue<String> myStrQueue = new Queue<>();
    	myStrQueue.add("ABC");
    	myStrQueue.add("DEF");
    	myStrQueue.add("XCV");
    	myStrQueue.add("KLS");
    	myStrQueue.add("PLK");
    	System.out.println(myStrQueue.peek());
    	myStrQueue.pool();
    	System.out.println(myStrQueue.peek());
    	myStrQueue.pool();
    	myStrQueue.add("RFG");
    	myStrQueue.printQueue(myStrQueue);
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	
    	Queue<Integer> myIntQueue = new Queue<>();
    	myIntQueue.add(1);
    	myIntQueue.add(2);
    	myIntQueue.add(3);
    	myIntQueue.add(4);
    	myIntQueue.add(5);
    	System.out.println(myIntQueue.peek());
    	myIntQueue.pool();
    	System.out.println(myIntQueue.peek());
    	myIntQueue.add(6);
    	myIntQueue.pool();
    	myIntQueue.printQueue(myIntQueue);
    }
}

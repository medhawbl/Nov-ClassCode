package com.wbl.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public void queueBasics(){
		
		MyPriorityComparator mcm = new MyPriorityComparator();
		Queue<String> queue = new PriorityQueue<String>(mcm);
		queue.add("java");
		queue.add("html");
		queue.add("webdriver");
		queue.add("webdriver");
		queue.add(null);
		queue.add("restApi");
		
		Iterator<String> itr = queue.iterator();
		while(itr.hasNext()){
			//System.out.println(itr.next());
				System.out.println(itr.next());//poll gives the head/first element of queue and removes it
			}
		
		/*
		 * 	Queue<Student> queue = new PriorityQueue<Student>(mcm);
		 * Student s1 = new Student(1233849398,"rohan");//643847
		Student s2 = new Student(2362223,"hema");	
		Student s3 = new Student(13212412,"ahad");	
		Student s4 = new Student(34325232,"beena");	
		queue.add(s1);
		queue.add(s2);
		queue.add(s3);
		queue.add(s4);
		
		Iterator<Student> itr = queue.iterator();
		while(itr.hasNext()){
		//System.out.println(itr.next());
			System.out.println(queue.poll().name);//poll gives the head/first element of queue and removes it
		}
		*/
	}
	
	public static void main(String[] args) {
		QueueExample qe = new QueueExample();
	    qe.queueBasics();

	}

}

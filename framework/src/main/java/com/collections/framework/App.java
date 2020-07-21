package com.collections.framework;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App{
	
    public static void main( String[] args ){	
    	Scanner sc = new Scanner(System.in);
    	ArrayList clist1 =new ArrayList();
    	System.out.println("Intializing the list with 10 Integers");
    	clist1.adding(new Integer(1));
    	clist1.adding(new Integer(2));
    	clist1.adding(new Integer(3));
    	clist1.adding(new Integer(4));
    	clist1.adding(new Integer(5));
    	clist1.adding(new Integer(6));
    	clist1.adding(new Integer(7));
    	clist1.adding(new Integer(8));
    	clist1.adding(new Integer(9));
    	clist1.adding(new Integer(10));
    	System.out.print("After adding the elements : ");
        System.out.println(clist1);
        System.out.println("Enter how many elements you want to remove:");
        int remove_elements  = sc.nextInt();
    	for(int i = 0; i < remove_elements; i++) {
    		System.out.println("Enter the index you want to remove:");
    		int n = sc.nextInt();
    		clist1.remove(n);
    	}
    	System.out.println(" Elements in the list after removing:");
    	System.out.println(clist1);
    	
    	System.out.println("Enter how many elements you want to fetch:");
    	int fetch_elements  =sc.nextInt();
    	for(int i = 0; i < fetch_elements; i++) {
    		System.out.println("Enter the elemen you want to fetch: ");
    		int n = sc.nextInt();
    		clist1.fetching(n);
    	}  	
    	
    	System.out.print("All Elements in list after fetching ");
        System.out.println(clist1);
    	System.out.println("Fectching");
    	
       System.out.print("All Elements in list are ");
       System.out.println(clist1);
       System.out.println("Number of elements in list are:"+clist1.size());
    }
}
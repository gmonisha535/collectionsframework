
package com.collections.framework;

import java.util.*;
public class ArrayList {
	public Object clist1[];
	int index = 0;
	
	public ArrayList() {
		clist1=new Object[10];
	}
	
	public Object fetching(int i) {
		if(i <index)
			return clist1[i];
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public void adding(Object obj) {
		if(clist1.length-index<=6)
		resize();
		clist1[index++]=obj;
	}
	
	public int size() {
		return index;
	}
	
	private void resize() {
		clist1=Arrays.copyOf(clist1,clist1.length*2);
	}
	
	public String toString() {
		String string="[";
		for(int i=0;i<index-1;i++)
			string+=clist1[i]+",";
		string+=clist1[index-1]+"]";
		return string;
	}
	
	 public Object remove(int i){
	       if(i < index){
	           Object obj = clist1[i];
	           clist1[i] = null;
	           int temp = i;
	           while(temp < i){
	        	   clist1[temp] = clist1[temp+1];
	        	   clist1[temp+1] = null;
	               temp++;
	           }
	           index--;
	           return obj;
	       } else {
	           throw new ArrayIndexOutOfBoundsException();
	       }
	 }

	public void adding(Integer obj) {
		if(clist1.length-index<=6)
		resize();
		clist1[index++]=obj;

		// TODO Auto-generated method stub
		
	}
}

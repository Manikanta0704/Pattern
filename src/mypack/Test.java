package mypack;

import java.awt.List;
import java.util.Arrays;

/*

import java.awt.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

*/

/*
public class Test{
public static void main(String[] args) {
	int age=17;
	if(age>18) {
		System.out.println("Eligible for vote");
	}else {
		System.out.println(18-age +" year need to eligible for vote");
	}
}
}*/

/*
public class Test{
	public static void main(String[] args) {
		message();
	}

	public static void message() {
		System.out.println("Hello World -1");
		message1();
	}
	
	public static void message1() {
		System.out.println("Hello World -2");
		message2();
	}
	
	public static void message2() {
		System.out.println("Hello World -3");
		message3();
	}
	
	public static void message3() {
		System.out.println("Hello World -4");
		message4();
	}
	
	public static void message4() {
		System.out.println("Hello World -5");
	}
}*/

/*
public class Test{
	public static void main(String[] args) {
//		int n;
		print1(1);
	}
	static void print1(int n) {
		System.out.println(n);
		print2(2);
	}
	static void print2(int n) {
		System.out.println(n);
		print3(3);
	}
	static void print3(int n) {
		System.out.println(n);
		print4(4);
	}
	static void print4(int n) {
		System.out.println(n);
		print5(5);
	}
	static void print5(int n) {
		System.out.println(n);
 
	}
}*/
/*
public class Test{
	int i=10;
	static int j=10;
	public static void main(String [] args) {
		Test t1=new Test();
		System.out.println(t1.i+"  "+j);
		t1.i=t1.i+10;
		j=j+10;
		System.out.println(t1.i+"  "+j);
		System.out.println();
		
		Test t2=new Test();
		System.out.println(t2.i+"  "+j);
		t2.i=t2.i+10;
		j=j+10;
		System.out.println(t2.i+"  "+j);
		System.out.println();
		
		Test t3=new Test();
		System.out.println(t3.i+"  "+j);
		t3.i=t3.i+10;
		j=j+10;
		System.out.println(t3.i+"  "+j);
		System.out.println();
		
		Test t4=new Test();
		System.out.println(t4.i+"  "+j);
		t4.i=t4.i+10;
		j=j+10;
		System.out.println(t4.i+"  "+j);
		System.out.println();
	
	}
}

*/
/*import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimalValue = Integer.parseInt(binaryString, 2);

            System.out.println("The integer value is: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
        scanner.close();
    }
}

*/
/*
public class Test{
	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n==5) {
			System.out.println(5);
			return;
		}
		System.out.println(n);
		print(n+1);
		
	}
}
*/
/*class BankAccount{
	int amount=25000;

	public BankAccount(int amount) {
		super();
		this.amount = amount;
	}
	synchronized void deposit(int amount) {
		
		this.amount+=amount;
		
		System.out.println("Available Balance :"+this.amount);
		this.notify();
	}
	synchronized void withdraw(int amount) {
		while(this.amount<amount) {
			System.out.println("Sorry Insufficent balance");
			try {
				this.wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		else {
			this.amount-=amount;
			System.out.println("Available Balance "+this.amount);
		}
//	}
}

public class Test extends Thread{
	BankAccount obj;
	
	public Test(BankAccount obj) {
		super();
		this.obj = obj;
	}
	public void run() {
		System.out.println("Welcome to the bank");
		obj.deposit(20000);
		obj.withdraw(20000);
		
		
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(10000);
		Test t1=new Test(ba);
		Test t2=new Test(ba);
		t1.start();
		t2.start();
	}
}
*/
/*
public class Test{
	public static void main(String[] args) {
		int[] arr= {7,3,7,3,7,3};
		int n=arr.length/2;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;			
				}		
			}	
			if(count>n) {
				System.out.println(arr[i]);
				break;
			}
		}		
	}
}

*/
/*
public class Test{
	public static void main(String[] args) {
		int[] arr= {5,7,83,78,901,83,107,65,175};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println(arr[i+1]);
			}
		}	
	}
}*/

/*public class Test{
	public static void main(String[] args) {
		int[] arr= {182,3,6,0,17,88,0};
		int count=0;
		int n=arr.length-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
				else
					break;		
			}
			if(n==count) {
				System.out.println(arr[i]);	
			}
			n--;
			count=0;
		}
	}
*/
/*
public class Test{
	public static void main(String[] args) {
		int[] arr = {12,4,34,54,65,75,87,787,56,45};
		int k=13;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			while(temp>0) {
				temp=temp/10;
				count++;
			}
			if(count==k) {
				System.out.println(arr[i]);
			}
		}
	}
}*/
/*
import java.util.*;
public class Test{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6};
//		int arr[]= {1,2,3,4,5,6};
//		System.out.println(arr);
		
		java.util.List<Integer> list=Arrays.asList(arr);
		Set<Integer> set= new LinkedHashSet(list);
		System.out.println(set);
	}
}*/


import java.util.*;
/*public class Test{
	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,1,2};
//		int arr[]= {1,2,3,4,5,6};
//		System.out.println(arr);
		
		java.util.List<Integer> list=Arrays.asList(arr);
		Integer[] a=(Integer[])list.toArray();
		for(Integer a1:a)
		System.out.println((Integer)a1);
	}
}*/
/*
public class Test{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("y1");
		hs.add("y2");
		hs.add("y3");
		hs.add("y4");
		hs.add("y5");
		hs.add("y6");
		hs.add("y17");
		hs.add("y7");
		hs.add("y8");
		hs.add("y9");
		hs.add("y0");
		hs.add("y11");
		hs.add("y12");
		hs.add("y13");
		hs.add("y14");
		hs.add("y15");
		System.out.println(hs);
//		Iterator<String> itr=hs.iterator();
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}*/


public class Test{
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
//		Collections.sort(list);
		Iterator<Integer> itr=list.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
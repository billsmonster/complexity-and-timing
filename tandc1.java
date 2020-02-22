// Derek Lenz
//Timing and Complexity


import java.util.*;

import java.util.Arrays;


public class complexity {
	 static void printArray(int arr[])  { // helper method for going through array
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	 
	 public static void insertionSort(int array[]) {  // insertion short no class needed
	        int n = array.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  
	        }  
	    }  
	       

	public static int numList(int num) {// Creating a list of random numbers
		Random randNum = new Random();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = randNum.nextInt();
		    System.out.println(arr[i]);
		      }
          int n = arr.length;     
		
        mergeSort ob = new mergeSort(); 
		ob.sort(arr, 0, arr.length-1); 
		System.out.println("\n Merge sorted list array" ); 
		printArray(arr); 
		  
	  insertionSort(arr);
	  System.out.println("\n Insertion sorted list array" ); 
	  printArray(arr);
	  
	  QuickSort q = new QuickSort(); 
      ob.sort(arr, 0, n-1); 
      System.out.println("Quick sorted list array"); 
      printArray(arr); 
 
		return 0;
		
	}
	private static int getRandomNumberInRange(int min, int max) { // random number seed value helper functions

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public static void revArray(int [] a) {// for reversing for the  array
		int [] rev= new int [a.length];
		for (int i=0; i<a.length; i++) {
			rev[a.length -1 -i]=a[i];
		}
		for (int i=0; i<a.length; i++) {
			a[i]=rev[i];
		}
		  
	
	
	}
	
	public static int aesArrmak(int arr) {//ascending method 
		int[] nar = new int[arr];
		for (int a = 0; a < nar.length; a++) {
			nar[a] = getRandomNumberInRange(1,9);
			Arrays.parallelSort(nar);
			System.out.print(nar[a] + " , ");
			
		}
		int a1 = nar.length;
		mergeSort ob = new mergeSort(); 
		ob.sort(nar, 0, nar.length-1); 
		System.out.println("\n Merge sorted ascending array" ); 
		 printArray(nar); 
		 
		insertionSort(nar);
		System.out.println("\n Insertion sorted ascending array" ); 
	    printArray(nar);
	    
	    
	    QuickSort u = new QuickSort(); 
	      ob.sort(nar, 0, a1-1); 
	      System.out.println("Quick sorted ascending array"); 
	      printArray(nar); 	 
		return 0;
	}
	
	
	public static int desArrmak(int des) {// descending array method
		int[] ar = new int[des];
		for (int b = 0; b < ar.length; b++) {
			ar[b] = getRandomNumberInRange(1,9);
			Arrays.parallelSort(ar);
			
		}
		int a2= ar.length;
		revArray(ar);
		System.out.println("Your descending Array: " + Arrays.toString(ar));
		
		mergeSort ob = new mergeSort(); 
		ob.sort(ar, 0, ar.length-1); 
		System.out.println("\n Merge sorted  descending array" ); 
	    printArray(ar); 
	    
	    insertionSort(ar);
		System.out.println("\n Insertion sorted descending array" ); 
	    printArray(ar);
	     
	    QuickSort qs = new QuickSort(); 
	    ob.sort(ar, 0, a2-1); 
	    System.out.println("Quick descending sorted array"); 
	    printArray(ar); 
	      
		return 0;
	}

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Please enter the number you want the length of the list to be ");
	     int num = scan.nextInt();
	     long startTime = System.nanoTime();  //Current System Time at start
	     numList(num); //calling the numList
	     long endTime = System.nanoTime(); //Current system Time at end
	     long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
	     System.out.println("Duration for numList() :" + duration);
	    
	     System.out.println("Please enter the number you want the length of the ascending list of Integers ");
         int narr = scan.nextInt();
		 //int nu = scan.nextInt();
	     long startTime1 = System.nanoTime();
	     aesArrmak(narr); // calling the ascending
	     long endTime1 = System.nanoTime();
	     long duration1 = (endTime1 - startTime1);  //divide by 1000000 to get milliseconds.
	     System.out.println("Duration for aesArrmak():" + duration1);
	      
		 System.out.println("\nPlease enter the number you want the length of the desceding list of Integers ");
		 int des= scan.nextInt();
		 long startTime2 = System.nanoTime();
		 desArrmak(des); //call the descending
		 long endTime2 = System.nanoTime();
	     long duration2 = (endTime2 - startTime2);  
	     System.out.println("Duration for desArrmak():" + duration2);
		
	}

}
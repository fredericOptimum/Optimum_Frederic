package Assignment_MockTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sort1{
	boolean Sort1(int userinput){
		boolean check = true;
		if (userinput < 1 || userinput > 12) {
			System.out.println("Please Input A Proper number up from 1 to 12.");
			check = false;
		}
		else {
			int[] size = new int[userinput];
			for (int counter = 0; counter < size.length;counter++) {
				if (counter < 2) {
					size[counter] = counter;
				}
				else {
					size[counter] = size[counter -1] + size[counter -2];
				}
				System.out.print(size[counter]+" ");
			}System.out.println();
		}return check;
	}
}

class Sort{
	Sort(int userinput,int maxValue){
		int[] size = new int[userinput]; 
		List<Integer> result = new ArrayList<Integer>();
		for (int counter = 0; counter < size.length;counter++) {
			if (counter < 2) {
				size[counter] = counter;
			}
			else {
				size[counter] = size[counter -1] + size[counter -2];
			}
		}
		
		for (int reply = 0; reply<size.length;reply++) {
			if (size[reply]<= maxValue) {
				result.add(size[reply]);
				System.out.print(result.get(reply)+" ");
			}
			else {break;}
		}
		System.out.println();
}
		
}

public class Array {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input the size of array: ");
	     int sizeArray = sc.nextInt();
	     Sort1 ref1 = new Sort1();
	     boolean check = true;
	     while(check)
	     {
	    	 if (ref1.Sort1(sizeArray)==true) 
	    	 {
	    		 System.out.println("Enter Max Value: ");
	    		 int maxValue = sc.nextInt();
	    		 Sort ref = new Sort(sizeArray, maxValue);
	    		 check = false;
	    	}else {sizeArray = sc.nextInt();}
	     }
	     
	     
	}
}

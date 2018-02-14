package Assignment02;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;


class UseLoop{
	UseLoop(String input){
		String obj = "";
		for (int i = 0; i < 5; i++) {
			obj = obj += input;
			obj = obj += " ";
			System.out.println(obj);
			}
		}
	}
class UseLoop2{
	UseLoop2(int input){
		String obj = "";
		for (int i = 0; i < 5; i++) {
			obj = obj + (input + i);
			obj = obj += " ";
			System.out.println(obj);
			}
		}
	}
class UseLoop3{
	
	 UseLoop3(String input){
		String obj1 = "";
		for (int i = 0; i < 5; i++) {
			for (int r = 5; r > i; r--) {
				System.out.print(" ");
			}
			for (int u = i; u > -1; u--) {
				
				System.out.print(input + " ");
				}
			System.out.println();
		}
	}
}

class UseLoop4{
	UseLoop4(){
		String obj1 = "";
		for (int i = 1; i < 6; i++) {
			for (int r = i; r > 0; r--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	 
}

class UseLoop5{
	UseLoop5(){
		String obj = "";
		for (int i = 5; i > 0; i--) {
			obj = obj + (i);
			obj = obj += " ";
			System.out.println(obj);
			}
		} 
}

class UseLoop6{
	UseLoop6(){
		for (int s = 1; s < 6; s++) {
		
			for (int i = 0; i < s; i++) {
				System.out.print((i+1)+ " ");
			}
			
			for (int r = (s-1) ;r > 0 ; r--) {
				System.out.print(r + " ");
			}
			
		
			System.out.println();
		}
		
		} 
}

class TwoA{
	TwoA(){
		int[] anArray = new int[] {1,2,4,6,3,7,8,9,10,11};
		int length = anArray.length;
		int check = 0;
		for (int i = 0; i < anArray.length;i++) {
			
			for (int r = 0; r < length;r++) {
				if (i+1 == anArray[r]) {length = r; check++;}
			}
			if (check != i+1) {System.out.println(i+1);break;}
			else {length = anArray.length;}
		}
		
		}
		
	}

class TwoB{
	TwoB(){
	int[] array = new int[]{5,2,9,15,2,7,7,18,15,5};
	int length = array.length;
	int check = 0;
	for (int i = 0; i < array.length;i++) {
		
		for (int r = 0; r < length;r++) {
			if (array[i] == array[r]) {check++;}
		}
		if (check == 1) {System.out.println(array[i]);break;}
		else {length = array.length;check = 0;}
	}
	}
	
}

class TwoC{
	TwoC(){
		int[] array = new int[]{5,2,9,15,2,7,7,18,15,5};
		int length = array.length;
		int check = 0;
		for (int i = 0; i < array.length;i++) {
			
			for (int r = i; r < length;r++) {
				if (array[i] > array[r]) {check = array[i]; array[i] = array[r];
				array[r] = check;}
			}
			System.out.print(array[i]+" ");
		}
	System.out.println();
	}
}

class TwoD{
	TwoD(){
		int[] array = new int[]{16,7,89,20,7,99,21,56,12,10};
		int length = array.length;
		int check = 0;
		for (int i = 0; i < array.length;i++) {
			
			for (int r = 0; r < length;r++) {
				if (array[i] == array[r]) {check++;}
			}
			if (check == 2) {System.out.println(array[i]);break;}
			else {check = 0;}
		}
	}
}

class TwoE{
	TwoE(){
		int[] array = new int[]{16,4,89,20,7,99,21,56,12,10};
		int length = array.length;
		int check = 0;
		int check2 = array[1];
			
		for (int r = 0; r < length;r++) {
			if (check < array[r]) {check=array[r];}
			}
		
		for (int i = 0; i < array.length;i++) {
			if (check2 > array[i]) {check2=array[i];}
		}
		System.out.print(check + " ");
		System.out.println(check2);
	}
}

class TwoF{
	TwoF(){
		int x = 0;
		int[] array = new int[]{16,4,20,20,7,99,21,56,12,10};
		int[] array2 = new int[x];
		int length = array.length;
		int check = 0;
		for (int i = 0; i < array.length;i++) {
				
			for (int r = 0; r < length;r++) {
				if (array[i] == array[r]) {
					check++;
					for (int m = 0; m < length;m++) {
						if (check == 1) {System.out.print(array[i]+ ", ");check = 0;}
						else {	array2[x] = array[i];
							check = 0;
							x = x+1;
						}
					}
				
				}
			}
			
		}
		System.out.println();
	}
}

class ThreeA{
	ThreeA(){
		String[] array = new String[]{"java","oracle","python","scala","hibernate"};
		int length = array.length;
		String[] check = new String[]{"java","oracle","python","scala","hibernate"};
		for (int i = 0,r = (length-1); i < length; i++, r--) {
			check[i] = array[r];
			System.out.print(check[i]+", ");
			
		}
		System.out.println();
		}
}

class ThreeB{
	ThreeB(String text){
		String[] array = new String[text.length()];
		for (int input = text.length()-1; input>-1;input--) {
			array[input]=Character.toString(text.charAt(input));
			System.out.print(array[input]);
			}
	    System.out.println();
		//for (int reverse = text.length(); reverse<0;reverse--) {
			//System.out.println(array[reverse]);
			//}
	}

}

class ThreeC{
	ThreeC(){
		int checker = 0;
		String[] array = new String[]{"java","hibernate","python","scala","hibernate"};
		for (int input = 0; input<array.length;input++) {
			for (int check = 0; check<array.length;check++) {
				if (array[input] == array[check]) {
					checker++;
				}
			}
			if (checker == 1) {
				System.out.print(array[input]+", ");
			}
			checker = 0;
		}
		System.out.println();
	}
}

class ThreeD{
	ThreeD(int armStrong){
		int checker= 0;
		int[] array = new int[Integer.toString(armStrong).length()];
		for (int input = 0; input<Integer.toString(armStrong).length();input++) {
			int num = Integer.parseInt(Character.toString(Integer.toString(armStrong).charAt(input)));
			array[input] = (int) Math.pow(num, 3);
			checker = checker+ array[input];
		}
		if (armStrong == checker) {
			System.out.println(armStrong+ " is an Armstrong number");
		}
	}
}

class Four{
	Four(){
		int[] arr1 = {4,7,3,9,2};
		int[] arr2 = {3,2,12,9,40,32,4};
		List<Integer> results = new ArrayList<Integer>();
		int checker = 0;

		for (int input = 0; input<arr1.length;input++) {
			for (int Sec_input = 0; Sec_input<arr2.length;Sec_input++) {
				if (arr1[input] == arr2[Sec_input]) {
					checker++;
				}
			}
			if (checker > 0) {
				results.add(arr1[input]);
				checker = 0;
			}
		}
		for (int input = 0; input<results.size();input++) {
			System.out.print(results.get(input)+" ");
		}
	}
}


public class Assignment2_1 {
	public static void main(String[] args) throws IOException {
	//UseLoop loop = new UseLoop("*");
	//UseLoop2 loop2 = new UseLoop2(1);
	//UseLoop3 loop3 = new UseLoop3("x");
	//UseLoop4 loop4 = new UseLoop4();
	//UseLoop5 loop5 = new UseLoop5();
	//UseLoop6 loop6 = new UseLoop6();
	
	//TwoA find = new TwoA();
	//TwoB find2 = new TwoB();
	//TwoC find3 = new TwoC();
	//TwoD find4 = new TwoD();
	//TwoE find5 = new TwoE();
	//TwoF find6 = new TwoF();
	
	//ThreeA find7 = new ThreeA();
	//ThreeB find8 = new ThreeB("oracle");
	//ThreeC find9 = new ThreeC();
	//ThreeD find10 = new ThreeD(153);
		
	Four find11 = new Four();
	
	
	
	}
}

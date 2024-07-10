package array;

import java.util.Scanner;

class NumberOfPrimeElements {
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();  //77, 19, 2, 12 , 33
		}
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
		int cp = 0;
		for(int i=0;i<n;i++) {
			if(numberOfPrimeElements(arr[i])) {
				cp++;
			}
		}
		System.out.println(cp);
	}
	static public boolean numberOfPrimeElements(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				return false;	
			i++;
		}
		return true;
	}
}
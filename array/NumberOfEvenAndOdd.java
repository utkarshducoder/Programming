package array;

import java.util.Scanner;

class NumberOfEvenAndOdd {
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();  
		}
		int ec=0,oc = 0;
		for(int i=0;i<n;i++) {
		int count=arr[i]%2==0?ec++:oc++;
			
		}
		System.out.println("Even numbers are"+ ec);
		System.out.println("Odd numbers are "+ oc);
	}
}

package array;

import java.util.Scanner;

class BasicProgram {
	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are:- ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int biggest = biggestElement(arr);
		System.out.println("Biggest element is "+biggest);
		System.out.println();
		int smallest = smallestElement(arr);
		System.out.println("Smallest element is "+smallest);
		System.out.println();
		int avg = averageOfArray(arr);
		System.out.println("Average of elements is "+avg);
	}
	public static int biggestElement(int arr[]) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}
	public static int smallestElement(int []arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}
	public static int averageOfArray(int [] arr) {
		int avg = 0,sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			avg= sum/arr.length;
		}
		return avg;
	}
}

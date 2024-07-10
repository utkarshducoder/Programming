package array;

import java.util.Scanner;

class FrequencyOfAnElement {
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
		countFrequency(arr);
	}
	
	public static void countFrequency(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count=1; //because atleast once the element is coming in the array
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) { //if bothe the elements are equals then increase the count value
					count++;
					//Now swapping the last element to that position
					arr[j] = arr[n-1];
					n--;
					j--;
				}
			
			}
			System.out.println("Number of occurence of "+arr[i]+" ----> "+count);
		}

	}
}

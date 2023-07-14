package PrefixSum;
import java.util.*;

public class PrefixSum {
	
	public static int[] prefix(int[] arr,int size)
	{
		int[] array = new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum += arr[i];
			array[i] = sum;
		}
		return array;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		int size = arr.length;
		int result[] = prefix(arr,size);
		for(int i=0;i<size;i++)
		{
		System.out.println(result[i]);
	}
	}
}

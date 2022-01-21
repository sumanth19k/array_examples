package array_examples;
import java.util.*;
public class TestEx1 {

	public static void main(String[] args) {
		
		// 1. printing values of an array
		int arr[] = new int[5];
		int b[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i*i;
		}
		System.out.println("the values of array are: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		// 2. printing in reverse order
		System.out.println("the values of array in reverse are: ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
		// 3. finding the duplicates
		for(int i=1;i<b.length;i++) {
			b[i]=i;
		}
		b[0]=1;
		for(int i:b) {
			for(int j:b) {
				if(i==j) {
					System.out.println(i+" is a duplicate");
					
				}
				
			}
			break;
		}
		
		// 4. sorting the array
		Arrays.sort(b);
		System.out.println(Arrays.toString(arr));
		
		// another method to sort the array
//		for (int i = 0; i < arr.length; i++)   
//		{  
//		for (int j = i + 1; j < arr.length; j++)   
//		{  
//		int tmp = 0;  
//		if (arr[i] > arr[j])   
//		{  
//		tmp = arr[i];  
//		arr[i] = arr[j];  
//		arr[j] = tmp;  
//		}  
//		}   
//		System.out.println(arr[i]);  
//		}  
		
		// 5. reverse a 6 digit number
		int num = 123456;
		int c[] = new int[6];
		for(int i=0;i<c.length;i++) {
			c[i]=num%10;
			num=num/10;
		}
		int res=0;
	    for(int i=0;i<c.length;i++) {
	         res=res*10+c[i];
	    }
				System.out.println(res);
	}

}

/*operation on arrat(INSERTION)*/
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[100];
		int position,i,n,value;
		System.out.println("Enter number of elements in array: ");
		n=scan.nextInt();
		System.out.println("Enter elements: ");        for(i=0;i<n;i++)
		array[i]=scan.nextInt();
		System.out.println("Enter the location where you wish to insert an element: ");
		position=scan.nextInt();
		System.out.println("Enter the value yo insert: ");
		value=scan.nextInt();
		for(i=n-1;i>=position-1;i--)
		array[i+1]=array[i];
		array[position-1]=value;
		System.out.println("Resultant array is: ");
		for(i=0;i<=n;i++)

	System.out.println(array[i]);
		}
}
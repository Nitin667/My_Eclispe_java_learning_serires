package Basic_learning;

//import java.util.Iterator;
import java.util.Scanner;

import com.package_np.interface1;

public class arrays {
public static void main(String[] args) {
	
	Scanner Sc=new Scanner(System.in);
	int[][] arr2=new int[2][3];
	System.out.println(arr2.length);
	for (int i = 0; i < arr2.length; i++) {
		for (int j = 0; j < arr2[i].length; j++) {
		arr2[i][j]=Sc.nextInt();
		}
		
	}

//	searching 
	int found=-1;
	for (int i = 0; i < arr2.length; i++) {
		for (int j = 0; j < arr2[i].length; j++) {
//		System.out.print(arr2[i][j]+" ");
			if(arr2[i][j]==12) {
				found=arr2[i][j];
			}
		}
//		System.out.println();
	}
	if(found!=-1) {
		System.out.println("Element found correct");
	}
	else {
		System.out.println("Element not found");
	}
}
}

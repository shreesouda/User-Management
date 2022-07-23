package com.tutorialspoint;
//import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Twodarray {
	
	//stayahead interview question. not related to this project.
	public static int[] milestones (String s[][], int m) {
		int arr[] = new int[3];
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(5, 10, 15));
		int k = -1;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			min = Integer.MAX_VALUE;
			k++;
			for (int j = 0; j < m; j++) {
				if (Integer.parseInt(s[j][2]) == al.get(i) && Integer.parseInt(s[j][1]) < min)
					min = Integer.parseInt(s[j][1]);
			}
			if (min != Integer.MAX_VALUE)
				arr[k] = min;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		System.out.println("enter number of events");
		int m = sc.nextInt();
		String str[][] = new String[m][3];
		for (int i = 0; i < m; i++) {
			System.out.println("entries for event " + (i + 1));
			for (int j = 0; j < 3; j++)
				str[i][j] = sc.next();
		}
		sc.close();
		arr = milestones (str, m);
		System.out.println("result array : ");
		for (int k = 0; k < arr.length; k++)
			System.out.print(arr[k] + " ");
		
	}
}

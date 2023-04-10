package AtmProject;
import java.util.ArrayList;

 import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java .util.Scanner;

public class FindingCommonElements {
    

	public static void main(String[] args) 
	{
		
		ArrayList<Integer>li_1=new ArrayList<>();
		ArrayList<Integer>li_2=new ArrayList<>();
		
		int na ,nb;
		
		int []arr=new int[50];
		int []arr1=new int[40];
		
		Scanner x= new Scanner(System.in);
		
		
		
		System.out.println("\nEnter num of  elements to store in arr");
		na=x.nextInt();
		System.out.println("\nEnter "+na+" Elements in List_1\n");
		
		for(int i=0;i<na;i++)
		{
			arr[i]=x.nextInt();
			 
			 li_1.add(arr[i]);	
		}
		
		
		
			
		System.out.println("\nEnter num of  elements to store in arr1");
		nb=x.nextInt();
		System.out.println("\nEnter "+nb+" Elements in List_2\n");
		
		for(int i=0;i<nb;i++)
		{
			arr1[i]=x.nextInt();
			 
			 li_2.add(arr1[i]);	
		}
		
		
		
		ArrayList<Integer>Common=new ArrayList<>();
		for(int element :li_1)
		{
				if(li_2.contains(element))
					
				{
					Common.add(element); 
					
				}
		}
		
		
		System.out.println("\n Common elements in list1 and list2 "+Common);
		
	    Collections.sort(Common);
		
		System.out.println("\n\n Common elements in Sorted  order"+Common);
		
		
	
	}

}


    


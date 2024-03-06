package sorting;

import java.util.Scanner;

public class sortString{
	public static void main(String[]args) {
		String list[]=new String[2];
		Scanner inScanner=new Scanner(System.in);
		System.out.println("enter list of names one by one...");
		for(int i=0;i<2;i++)
			list[i]=inScanner.next();
		for(int i=0;i<2;i++)
		{
			for(int j=1;j<2-i;j++)
				if(list[j-1].compareTo(list[j])>0)
				{
					String str=list[j];
					list[j]=list[j-1];
					list[j-1]=str;
				}
		}
		for(int i=0;i<2;i++)
			System.out.println(list[i]);
		inScanner.close();
	}
}         
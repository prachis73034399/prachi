
import java.util.Scanner;
import java.util.Random;

public class Utility
{ Scanner sc=new Scanner(System.in);
//Storing words in array of size no
public String[] addStrings(int no) 
{ 
    Scanner sc=new Scanner(System.in);
	int i;
	String list[]=new String[no];
	System.out.println("Enter word ::");
		//adding strings in array
		for(i=0;i<no;i++)		
			{
			list[i]=sc.next();	
			}
	return list;
}
//insertion sort on String array
public String[] insertionSort(String[] list,int no)
{
	int i,j;
	String key;
	for(i=1;i<no;i++)
	{
	key=list[i];
	for(j=i-1;j>=0 && list[j].compareTo(key)>0;j--)
		{
		list[j+1]=list[j];
		list[j]=key;
		}
		}
return list;
}

}

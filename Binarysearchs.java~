import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class Binarysearchs
{
public static void main(String[] args) throws Exception
{
String name;


BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number of words");
int n = Integer.parseInt(br.readLine());
String[] a= new String[n];
System.out.println("enter the elements");
		for(int j=0;j<n;j++)
			{
			a[j]=br.readLine();
			//System.out.println("\n");
			}
			System.out.println(" Entered elements are");
                
			for(int j=0;j<n;j++)
			{
			System.out.println(a[j]);
                          //System.out.println("\n");
			}
System.out.println("enter element to be found ");
name =br.readLine();
Utility u= new Utility();
int index=u.binarySearch(a,name);
if(index==(-1))
{
System.out.println("entered element is not found ");
}
else
{
System.out.println("entered element found at "+(index+1));

}
}
}

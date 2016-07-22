import java.io.*;
class Stocksport
{   String name;
    int shares, price, total;
    Stocksport()
 	{
          BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
          
	  System.out.println("Enter name:");
	  String name = br.readLine();
          
	  System.out.println("Enter  No. of shares:");
	  int shares = Integer.parseInt(br.readLine());
          
	  System.out.println("Enter price:");
	  int price = Integer.parseInt(br.readLine()); 
          
	  total= shares*price;
	}
  void display()
  {
    System.out.println(name+"\t"+shares+"\t"+price+"\t"+total);

}

}

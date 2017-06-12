import java.util.Scanner;

public class Xy {
  public static void main(String []args){
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
  int a=n;
	  int b=0;
	  int c=1;
	  while(n>0){
		  b=n%10;
		  c=b*c;
		  n=n/10;  
	  }c=c*a;
    System.out.println(+c);
  }
}

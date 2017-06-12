import java.util.Scanner;

public class Add2Number {
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the target");
		int target=s.nextInt();
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]+a[j]==target){
					System.out.println("Sum of this two integer in arrayis :"+a[i]+","+a[j]);
					j=n;
					i=n;
				}
			}
		}
	}

}

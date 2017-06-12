import java.util.Scanner;

public class Kdigit {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int b=0;
		System.out.print("no. of element of array is :");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int k=0;k<n;k++){
			a[k]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]>a[j]){
				b=a[i];a[i]=a[j];
		
				a[j]=b;}}}
		System.out.print("the k input is:");
		int k=s.nextInt();
		for(int i=0;i<n-k;i++){
			if(a[i]<a[i+1]){
			System.out.print(a[i]+",");}
		}

	}}

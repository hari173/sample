package Condinalstatement;
import java.util.Scanner;
public class Studentgrad {

	public static void main(String[] args)
	{
		int a;
		Scanner Sc = new Scanner(System.in);
		a=Sc.nextInt();
		
			System.out.print("grade");
		
		if (a==100)
		{
			System.out.print("s");
		}
		 else if (a>90 && a<100)
		{
			System.out.print("A");
		}
			else if  (a>80 && a<90)
		{
			System.out.print("B");
		}
		 else if  (a>70 && a<80)
		{
			System.out.print("c");
		}
		else if (a>60 && a<70)
		{
			System.out.print("E");
		}
		else
			{
				System.out.print("F");
			}
			}
			
			
			
		}
		
	



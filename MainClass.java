package aaa;
import java.util.Scanner;
public class MainClass {
	
	public static int menu(Scanner s) {
		int r;
		do {
			System.out.println("1: Enter a number : "
					+ "\n2: Search a number : "
					+ "\n3: Display in Inorder : "
					+ "\n4: Display in Preorder : "
					+ "\n5: Display in Postorder : "
					+ "\n6: Display maximum : "
					+ "\n7: Display minimum : "
					+ "\n8: Display total nodes : "
					+ "\n9: Display Sum of all : ");
			r=s.nextInt();
		}while(r!=1 && r!=2 && r!=3 &&r!=4 && r!=5 && r!=6 && r!=7 && r!=8 && r!=9);
		return r;
	}
	
public static void main(String [] atgs)
{
	Scanner obj = new Scanner(System.in);
	BST tr = new BST();
	do {
		int ch = menu(obj);
		
		switch(ch)
		{
		case 1:
			int n;
			System.out.println("Enter a number : ");
			n=obj.nextInt();
			tr.Insertion(n);
			break;
		case 2:
			int s;
			System.out.println("Enter a number : ");
			s=obj.nextInt();
			tr.search(s);
			break;
		case 3:
			tr.Inorder(0);
			break;
		case 4:
			tr.Preorder(0);
			break;
		case 5:
			tr.Postorder(0);
			break;
		case 6:
			tr.max();
			break;
		case 7:
			tr.min();
			break;
		case 8:
			int h =tr.Total(0);
			System.out.println("Total nodes are : "+h);
			break;
		case 9:
			int y=tr.sum(0);
			System.out.println("Total sum of nodes is : "+y);
			break;
			
		}
	}while(true);
}
}

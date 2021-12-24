package linecomparision;
import java.util.*;


public class linecmparisionUC1 {


	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x1,y1,x2,y2;
	        double len;

			System.out.println("Enter the Co-ordinates of x1 and y1 : ");
	        x1 = sc.nextInt();
	        y1 = sc.nextInt();
	        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
	        x2 = sc.nextInt();
	        y2 = sc.nextInt();
	        //len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
	        len = Math.sqrt(Math.pow((x2-x1),2)  +  Math.pow((y2-y1),2));
	        System.out.println("length of line is "+len);
	        //System.out.println("Length of the given Line is : " + len + " units" );
	    }
	}
	
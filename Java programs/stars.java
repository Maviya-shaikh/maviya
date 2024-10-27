//stars

package b1;

import java.util.Scanner;

public class stars{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO");
        int i, j;
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {


                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

//pattern

package b1;
import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO");
        int i, j;
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {


                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

}


//countinue after 5

package b1;
import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {



    	        Scanner sc = new Scanner(System.in);
    	        System.out.println("ENTER NO");
    	        int i;
    	        int n = sc.nextInt();

    	        for (i = 1; i <= n; i++) {
    	           if(i==5) {
    	               continue;
    	           }


    	                System.out.println(i);
    	            }

    	    }
    	}

//break after 5

package b1;
import java.util.Scanner;
public class pattern {
    public static void main(String args[]) {
   

    	        Scanner sc = new Scanner(System.in);
    	        System.out.println("ENTER NO");
    	        int i;
    	        int n = sc.nextInt();

    	        for (i = 1; i <= n; i++) {

    	            if(i==5) {
    	                break;
    	            }


    	                System.out.println(i);
    	            }

    	    }
    	
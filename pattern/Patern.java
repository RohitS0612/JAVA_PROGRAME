import java.util.Scanner;

public class Patern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 0; i <= 5; i++) {
                    for (int j = 0; j <= 5; j++) {
                        if (i == 5 || i == 0 || j < 1 || j>4) {
                            System.out.print(" * ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.print("\n");
                }
                break;

	case 3:
	  for(int i=0; i<=5; i++) {
	     for(int j=0; j<=5; j++) {
	         System.out.print(" * ");
	     }
	   System.out.println();
	  }

	break;

	case 4:
	   for(int i=1; i<=5; i++) {
	        for(int j=1; j<=5; j++) {
	         if(i<=j) {
		System.out.print("*");
	         }

	        }
	     System.out.println();
	   }
	break;

	case 5:
	    for(int i=1; i<=5; i++) {
		int count = 0;
	        for(int j=1; j<=5; j++) {
		if(j>=i){
		   count++;
		   System.out.print(count);
		}
	        }
	    System.out.println();
	    }
	break;
	
	case 6:
	   for(int i=1; i<=5; i++) {
	      for(int j=1; j<=i; j++) {
 	          if(j==1 || i == 5 || i>j ){
		System.out.print(j);
		}
	        else{
		System.out.print(" ");
	        }
	     }
	    System.out.println();
	   }
	break;

            default:
	System.out.println("Case not Found");
                break;
        }
        sc.close();
    }
}

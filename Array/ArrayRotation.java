import java.util.Scanner;
public class ArrayRotation {
	

 
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a[] ,b[];
         a=new int[5];
         b=new int[5];
         int k=0;;
         System.out.println("enter the array elem");
         for(int i=0;i<a.length;i++)
         {
             a[i]=sc.nextInt();
         }
         int index;
         System.out.println("enter the index value ");
        index=sc.nextInt();

         for(int i=index;i<a.length;i++)
         {
             b[k]=a[i];
             k++;
         }
         for(int i=0;i<index;i++)
         {
             b[k]=a[i];
             k++;
         }
          System.out.println("the rotared array ");
         {
             for(int i=0;i<a.length;i++)
             {
                 System.out.println(b[i]);
             }
         }
         sc.close();
     }
}





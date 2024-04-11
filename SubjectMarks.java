import java.util.Scanner;

public class SubjectMarks {
      public static void main(String[] args) {
	
	String[] subject= {"English", "Java", "Python", "Networking","Softwae Testing ","Cyber Security"};
	subjectMarks(subject);	
     }

    static void subjectMarks( String[] subject) {
	Scanner sc = new Scanner (System.in);	
	int[] marks = new int [subject.length];
	for(int i=0; i<marks.length; i++) {
    	     System.out.print(subject[i] + " : " );
	     marks[i] = sc.nextInt();
	}

	int total = 0;
	for(int i=0; i<marks.length; i++) {
		total += marks[i];
	}
	System.out.println("Average  = " + total);
	int per = (total * 100 ) / 600;
	System.out.println("Percentsge of Marks = "+ per +"%");
	sc.close();
    }
}
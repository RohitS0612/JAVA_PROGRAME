import java.util.Scanner;

class Per {
    int total = 0;
    double per;

    void calPer(int s[]) {
        for (int i = 0; i < s.length; i++) {
            total = total +  s[i];
        }

        per = (total * 100) / 600;
    }
}

class CSE extends Per {
    int id;
    String name, address, year;

    CSE(String name, int id, String address, String year) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.address = address;
    }

    void showCsePer() {
        System.out.println("Result of CSE Students:");
        System.out.println("Id\tName\tAddress\tYear\tTotal\tPercentage");
        System.out.println(id + "\t" + name + "\t" + address +  "\t" + year +"\t"+ total+"\t" + per);
    }

}

class ETC extends Per {
    int id;
    String name;
    String address;
    String year;

    ETC(int id, String name, String address, String year) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.year = year;
    }

    void showEtcPer() {
        System.out.println("Result of ETC student:");
        System.out.println("Id\tName\tAddress\tYear\tTotal\tPercentage");
        System.out.println(id + "\t" + name + "\t" + address +  "\t" + year +"\t"+ total+"\t" + per);
    }
}

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("Eneter the Subject Marks:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Subject " + (i + 1) + " = ");
            arr[i] = sc.nextInt();
        }

        CSE cse = new CSE("Rohit", 6, "Glataga", "2023");
        cse.calPer(arr);
        cse.showCsePer();

        ETC etc = new ETC(9, "Yash", "Glataga", "2023");
        etc.calPer(arr);
        etc.showEtcPer();

        sc.close();
    }
}
/*There are total n number of Monkeys sitting on the branches of a huge Tree. As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas and p number of Peanuts are offered by travelers, calculate how many Monkeys remain on the Tree after some of them jumped down to eat. At a time one Monkeys gets down and finishes eating and go to the other side of the road. The Monkey who climbed down does not climb up again after eating until the other Monkeys finish eating. 
Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are less than k Bananas left on the ground or less than j Peanuts left on the ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j). Write code to take inputs as n, m, p, k, j and return  the number of Monkeys left on the Tree. 
    Where, n= Total no of Monkeys 
        k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last may get less than k Bananas) 
        j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last may get less than j Peanuts)         m = Total number of Bananas         p  = Total number of Peanuts 
Remember that the Monkeys always eat Bananas and Peanuts, so there is no possibility of k and j having a value zero 
Example : 
Input Values     
20 
2 
3 
12 
12 
Output Values 
Number of Monkeys left on the tree:10 
 */

import java.util.Scanner;

public class MonkeyEat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Number of Monkeys : ");
        int n = sc.nextInt(); // number of monkeys
        System.out.print("Number of eatable Bananas by Single Monkey : ");
        int k = sc.nextInt(); // number of eatable bananas by singel monkey
        System.out.print("Number of eatable Peanuts by single Monkey : ");
        int j = sc.nextInt(); // number of eatable peanutes by single monkey
        System.out.print("Total number of Bananas : ");
        int m = sc.nextInt(); // Total number of Bananas
        System.out.print("Total number of Peanuts : ");
        int p = sc.nextInt(); // Total number of penuts

        if (n > 0 && k > 0 && j > 0) {
            int rm = n - ((m / k) + (p / j)); // rm - rememebr Monkeys
            System.out.println("Number of Monkeys Left On The Tree : " + rm);
        } else {
            System.out.println("No possiblieties having zero Monkey");
        }
        sc.close();
    }
}

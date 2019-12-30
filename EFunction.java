import java.util.Scanner;
import java.lang.Math;
public class EFunction
{
    private double eapprox = 0;
    private long nterms = 0;
    private double nextTerm = 1;
    public EFunction() {}
    public double getEapprox() {return eapprox;}
    public long getNterms() {return nterms;}
    public void addNextTerms(long n){ //takes in a number representing the number of new terms
        for(int i=0;i<n;i++){
            eapprox += nextTerm;
            nextTerm /= ++nterms;
             /*
              * alternative code?!
              * if(nterms != 0){nextTerm/=nterms}
              * nterms++;
              * eapprox += nextTerm
              */                
            }
    }
    public static void main(String[] args){
        EFunction c = new EFunction();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Brian's e numerical calculator \nHow many terms do you want to add (0 to exit)");
        long input = scanner.nextInt();
        while(input != 0){
            if(input < 0) System.out.println("Invalid input. Please input a non-negative integer");
            else{
                c.addNextTerms(input);
                System.out.printf("After %d terms e is %f\n",c.nterms, c.eapprox);
            }
            System.out.println("How many terms do you want to add (0 to exit)");
            input = scanner.nextInt();
        }
        System.out.println("See you next time!");
    }
}

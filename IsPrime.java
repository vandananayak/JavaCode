import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int f=1;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0)
            {
                System.out.println("Not a prime number");
                f=0;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Is a prime");
        }
        scan.close();
    }
}

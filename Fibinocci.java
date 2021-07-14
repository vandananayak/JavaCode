import java.util.Scanner;

public class Fibinocci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=scan.nextInt();

        int a=0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < count-2; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }

        scan.close();
    }
}

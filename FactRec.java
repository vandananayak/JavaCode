import java.util.Scanner;

public class FactRec {
    int Fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        else
        {
            return num*Fact(num-1);
        }
    }
}
class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        FactRec fact=new FactRec();
        int res=fact.Fact(num);
        System.out.print(res);
        scan.close();
    }
}
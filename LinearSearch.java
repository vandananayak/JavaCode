import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,5,33,56};
        int i;
        Scanner scan= new Scanner(System.in);
        int key=scan.nextInt();
        scan.close();
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==key)
            {
                System.out.println("found at"+i);
                break;
                
            }
        }
        if(i==arr.length)
        {
            System.out.println("not found");
        }
        
        
    }
}

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        scan.close();
    }
    
}

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={3,21,23,88,399};
        Scanner scan=new Scanner(System.in);
        int key=scan.nextInt();
        scan.close();
        int low=0,high=arr.length-1,mid=(low+high)/2;
        int f=0;
        while(f!=1)
        {
            if(arr[mid]==key)
            {
                System.out.println("found at "+mid);
                f=1;
            }
            else if (arr[mid]<key) {
                low=mid+1;
                mid=(low+high)/2;
            } else {
                high=mid-1;
                mid=(low+high)/2;
            }
        }
        if(f==0)
        {
            System.out.println("not found");
        }
    }
}

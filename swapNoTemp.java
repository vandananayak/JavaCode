public class swapNoTemp {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.print("before swap: "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("after swap: "+a+" "+b);
    }
}

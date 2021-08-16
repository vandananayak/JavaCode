class super_class{
    void sup()
    {
        System.out.println("this is super class");
    }
}

class sub_class extends super_class{
    
    void sub()
    {
        System.out.println("this is sub class extends super class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        sub_class obj=new sub_class();
        obj.sub();
        obj.sup();//using object of sub class super classes properties can be extracted
        
    }
}

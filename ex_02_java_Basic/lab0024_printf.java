package ex_02_java_Basic;

public class lab0024_printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print command print without the new line");
        System.out.println("hello world");
        System.out.println("add new line in the end");

        System.out.println(a);
        System.out.printf("your variable name is %d", a);

        int b=20;
        System.out.println("-----");
        System.out.printf("%d + %d",a,b);


    }
}
//%d -> int,byte,long,short-datatypes
//%s-> String
//%f -> float,double,
//%b-> boolean

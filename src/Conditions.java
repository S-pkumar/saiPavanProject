public class Conditions {
public static void main (String[] args){
    int a=10;
    int b=20;
    int c=13;
    if(a>b && a>c){
System.out.println("a is largest number");
    }
    else if (b>c && b>a){
        System.out.println("b is largest number");
    } else if (c>a && c>b) {
        System.out.println("c is largest number");

    }
}
}

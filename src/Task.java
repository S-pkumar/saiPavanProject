public class Task {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int c=20;
        int d=15;
        int greatestof4numbers = (a>b && a>c && a >d) ? a : (b>c && b>a && b>d) ? b : (c>d && c>a && c>b)? c : d;
        System.out.println(" c greatest number");
    }
}

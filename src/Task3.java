public class Task3 {
    public static void main (String[] args){
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        if (a>b && a>c && a>d) {
            System.out.println("a should be greatest");
        }
             else if (b>a && b>c && b>d) {
                 System.out.println("b should be greatest");


            }
             else if (c>a && c>b && c>d){
                 System.out.println("c should be greatest");}
             else  {
                    System.out.println("d will be greatest");
                 }
    }
}

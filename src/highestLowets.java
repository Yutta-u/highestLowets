import java.util.Scanner;

public class highestLowets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if( a == b ){
            System.out.print("=");
        }else if( a > b ){
            System.out.print(">");
        }else if(a < b){
            System.out.print("<");
        }else{
            System.out.print("");
        }
    }
}
import java.util.Scanner;

public class colorcode {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    switch (a) {
        case 'R':
            System.out.println("Red");
            break;
        case 'B':
            System.out.println("Blue");
            break;
        case 'G':
            System.out.println("Green");
            break;
        case 'O':
            System.out.println("Orange");
            break;
        case 'W':
            System.out.println("White");
            break;
        case 'M':
            System.out.println("Invalid");
            break;
        default:
            throw new AssertionError();
    }
 }   
}

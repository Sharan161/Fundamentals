import java.util.*;
public class palindrom{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int palin=0,a;
        while(n>0){
         a=n%10;
            palin=palin*10+a;
            n=n/10;
        }
            System.out.println(palin);
    
    }
    
}
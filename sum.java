import java.util.*;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,a;
        for(;n>0;){
         a=n%10;
            sum+=a;
            n=n/10;
        }
            System.out.println(sum);
    
    }
    
}

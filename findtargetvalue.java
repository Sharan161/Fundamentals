import java.util.Scanner;
class findtargetvalue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
         System.out.print("Enter array elements: ");
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
            } 
            System.out.print("Enter target number: ");
            int n=sc.nextInt();
            int count=0;
          for(int i=0;i<a;i++){
              if(arr[i]==n){
                System.out.print("index number of target is: "+i);
                count++;
              }
          }if(count==0){
              System.out.println(-1);
          }
    }
}
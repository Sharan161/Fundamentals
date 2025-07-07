import java.util.Scanner;
class twolargesmallnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int a=sc.nextInt();
        int arr[]=new int[a];
         System.out.print("Enter array elements: ");
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
            }int temp=0;
          for(int i=0;i<a;i++){
              for(int j=0;j<a;j++){
                  if(arr[i]>arr[j]){
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
              
          }
          } 
         System.out.println("First two smallest "+arr[a-1]+","+arr[a-2]);
         System.out.println("First two largest "+arr[0]+","+arr[1]);
          }
    }

import java.util.*;
public class ReverseArrays{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your array size in numbers ");
     int size = sc.nextInt();
     int num[] = new int[size];

     for(int i=0; i<size; i++){
        num[i] = sc.nextInt();
     }
    for(int i=0; i<size; i++){
      System.out.println(num[i]);
     }
     int j=0;
     int rev[]= new int[size];
     System.out.println("Your Array is reversed");
     for(int i=size-1; i>=0; i--){
        rev[j] = num[i];
        j++;
     }
     for(int i=0; i<size; i++){
      System.out.println(rev[i]);
     }
    }
}
import java.util.*;
public class max_min {
 public int max(int arr[]){
  int max = arr[0];
  for(int i=0; i<arr.length; i++){
   if(arr[i]>max){
   max=arr[i];
  }
 }
 return max;
 }
 public int min(int arr[]){
  int min = arr[0];
  for(int i=0; i<arr.length; i++){
   if(arr[i]<min){
    min=arr[i];
   }
  }
  return min;
 }
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter size of array: ");
  int n = sc.nextInt();
  int Array[]= new int[n];
  System.out.println("Enter elements of array: ");
  for(int i=0; i<n; i++){
   Array[i]=sc.nextInt();
  }
  max_min ob = new max_min();
  System.out.println("Max element of Array: "+ob.max(Array));
  System.out.println("Min element of Array"+ob.min(Array));

 }
}

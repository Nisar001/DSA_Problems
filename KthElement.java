import java.util.*;

public class KthElement {
 public void sortArray(int arr[]){
  int n = arr.length;
  for(int i=0; i<n; i++){
   int temp=i;
   for(int j=i+1; j<n; j++){
    if(arr[temp]>arr[j]){
     temp=j;
    }
   }
   if(temp!=i){
    int t = arr[i];
    arr[i] = arr[temp];
    arr[temp] = t;
   }
  }
}
 public int kthmax(int arr[], int n, int k){
  sortArray(arr);
  return arr[n-k];
}
 public int kthMin(int arr[], int n, int k){
  sortArray(arr);
  return arr[k-1];
}
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of an array: ");
  int size = sc.nextInt();
  System.out.println("Enter the elements of the array: ");
  int array[] = new int[size];
  for (int i=0; i<size; i++){
   array[i] = sc.nextInt();
  }
  System.out.println("Enter the k: ");
  int Kth = sc.nextInt();
  KthElement k = new KthElement();
  int max = k.kthmax(array, size, Kth);
  int min = k.kthmax(array, size, Kth);
  System.out.println("Kth max is: " + max);
  System.out.println("Kth min is " + min);
 }
}

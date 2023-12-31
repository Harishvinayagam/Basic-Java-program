import java.util.Arrays;
import java.util.Scanner;
public class Heapsort {
   public static void heapSort(int[] myArray, int length) {
      int temp;
      int size = length-1;
      for (int i = (length / 2); i >= 0; i--) {
         heapify(myArray, i, size);
      };
      for(int i= size; i>=0; i--) {
         temp = myArray[0];
         myArray[0] = myArray[size];
         myArray[size] = temp;
         size--;
         heapify(myArray, 0, size);
      }
      System.out.println(Arrays.toString(myArray));
   }
   public static void heapify (int [] myArray, int i, int heapSize) {
      int a = 2*i;
      int b = 2*i+1;
      int largestElement;
      if (a<= heapSize && myArray[a] > myArray[i]) {
         largestElement = a;
      } else {
         largestElement = i;
      }
      if (b <= heapSize && myArray[b] > myArray[largestElement]) {
         largestElement = b;
      }
      if (largestElement != i) {
         int temp = myArray[i];
         myArray[i] = myArray[largestElement];
         myArray[largestElement] = temp;
         heapify(myArray, largestElement, heapSize);
     }
   }
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
       long start = System.nanoTime();
      System.out.println("Enter the size of the array :");
      int size = scanner.nextInt();
      System.out.println("Enter the elements of the array :");
      int[] myArray = new int[size];
      for(int i=0; i<size; i++) {
         myArray[i] = scanner.nextInt();
      }
      heapSort(myArray, size);
      long end = System.nanoTime();
	  long exe = (end-start);
	  double secs = exe/1_000_000_000;
	System.out.println("Execution Time in Secs:"+secs);
   }
}

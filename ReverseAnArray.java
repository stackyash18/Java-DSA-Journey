public class ReverseAnArray {
  public static void main(String[] args) {
   int[] array = {5,10,15,20,25};
   int n = array.length;
   int[] reversedArray = new int[n];
   for(int i = 0; i < n; i++) {
     reversedArray[i] = array[n - 1 - i];
   }
   System.out.println("Reversed Array:" + java.util.Arrays.toString(reversedArray));
  }
}

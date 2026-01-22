public class ReverseAnArray {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7,8,9,10};
    int mid = Math.floorDiv(array.length,2);

    for(int i=0; i<mid; i++)
    {
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
       
    }
    for(int num:array)
    {
      System.out.print(num + " ");
    }
  }
}

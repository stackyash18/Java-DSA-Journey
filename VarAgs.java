public class VarAgs {
  static int sum(int ...arr){
    int result = 0;
    for(int a: arr) {
      result += a;
    }
    return result;
  }
  public static void main(String[] args) {
   int result1 = sum(4,2,5,4,6,2,45,6,4,6,2,12,52,63,85);
   System.out.println(result1);
  }
}

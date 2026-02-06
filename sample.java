public class sample {
  int z;

  public void process (sample T)
  {
    T.z = T.z / 10;
  }
  public static void main(String[] args) {
    sample obj = new sample();
    obj.z = 100;
    obj.process(obj);
    System.out.println(obj.z);
  }
}

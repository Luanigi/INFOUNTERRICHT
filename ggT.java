public class ggT() {
  public ggT(){
    rechneGGT(2, 5);
  }

  int rechneGGT(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}

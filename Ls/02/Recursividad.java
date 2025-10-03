public class Recursividad {
  
  static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else { // n > 1
      return n * factorial(n - 1);
    }
  }

  static int factorialTail(int x, int y) {
    if (x == 1) {
      return y;
    } else {
      return factorialTail(x - 1, y * x);
    }
  }

  public static void main(String[] args) {
    int n = 5;
    int resultado = factorial(n);
    int resultadoTail = factorialTail(n, 1);
    System.out.println(n + "! = " + resultado);
    System.out.println(n + "! = " + resultadoTail + " (tail)");
  }
}

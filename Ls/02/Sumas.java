public class Sumas {

  static int sumaFormula(int n) {
    return n * (n + 1) / 2;
  }

  static int sumaIterativa(int n) {
    int suma = 0;
    for (; n > 0; suma += n, n--)
      ;
    return suma;
  }

  static int sumaRecursiva(int n) {
    return n == 1 ? 1 : n + sumaRecursiva(n - 1);
  }

  static int sumaRecursivaTail(int n, int suma) {
    return n == 0 ? suma : sumaRecursivaTail(n - 1, suma + n);
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int sumFor = sumaFormula(n);
    int sumIte = sumaIterativa(n);
    int sumRec = sumaRecursiva(n);
    int sumRecTail = sumaRecursivaTail(n, 0);

    System.out.println("sumaFormula: " + sumFor);
    System.out.println("sumaIterativa: " + sumIte);
    System.out.println("sumaRecursiva: " + sumRec);
    System.out.println("sumaRecursivaTail: " + sumRecTail);
  }
}

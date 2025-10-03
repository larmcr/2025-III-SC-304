import java.util.ArrayList;
import java.util.Arrays;

public class Conteo {

  static int contarItemsArreglo(int[] arreglo) {
    // if (arreglo.length == 0) {
    // return 0;
    // } else {
    // return 1 + contarItemsArreglo(Arrays.copyOf(arreglo, arreglo.length - 1));
    // }

    return arreglo.length == 0 ? 0 : 1 + contarItemsArreglo(Arrays.copyOf(arreglo, arreglo.length - 1));
  }

  static int contarItemsArregloTail(int[] arreglo, int contador) {
    if (arreglo.length == contador) {
      return contador;
    } else {
      return contarItemsArregloTail(arreglo, contador = contador + 1);
    }
  }

  static int contarItemsLista(ArrayList<Integer> arrayList) {
    if (arrayList.isEmpty()) {
      return 0;
    } else {
      arrayList.removeFirst();
      return 1 + contarItemsLista(arrayList);
    }
  }

  static int sumaListaRec(ArrayList<Integer> arrayList) {
    if (arrayList.isEmpty()) {
      return 0;
    } else {
      int item = arrayList.removeFirst();
      return item + sumaListaRec(arrayList);
    }
  }

  static int sumaListaIte(ArrayList<Integer> arrayList) {
    int suma = 0;

    // int indice = 0;
    // while(indice < arrayList.size()) {
    // int item = arrayList.get(indice);
    // suma += item; // suma = suma + item;
    // indice++; // indice = indice + 1;
    // }

    for (int indice = 0; indice < arrayList.size(); indice++) {
      suma += arrayList.get(indice);
    }

    return suma;
  }

  static int fibonacci(int n) {
    return n == 0 || n == 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
  }

  static int maximo(ArrayList<Integer> list) {
    int max = 0;
    for (int item : list) {
      max = item > max ? item : max;
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = new int[] { 7, 25, 0, 8 };
    int contArr = contarItemsArreglo(arr);
    System.out.println("contarItemsArreglo: " + contArr);
    int contArrTail = contarItemsArregloTail(arr, 0);
    System.out.println("contarItemsArregloTail: " + contArrTail);

    ArrayList<Integer> arrLst = new ArrayList<Integer>(Arrays.asList(5, 7, 25, 9, 10));
    System.out.println(arrLst);
    ArrayList<Integer> myNewList = new ArrayList<Integer>(arrLst);
    int contList = contarItemsLista(myNewList);
    System.out.println(arrLst);
    System.out.println("contarItemsLista: " + contList);

    int sumaRec = sumaListaRec(new ArrayList<Integer>(arrLst));
    System.out.println("sumaRec: " + sumaRec);
    int sumaIte = sumaListaIte(new ArrayList<Integer>(arrLst));
    System.out.println("sumaIte: " + sumaIte);

    int fib = fibonacci(45);
    System.out.println("fibonacci: " + fib);

    int max = maximo(arrLst);
    System.out.println("maximo: " + max);
  }
}
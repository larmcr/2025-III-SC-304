import java.util.Arrays;

public class DefaultValues {
  public static void main(String[] args) {
    int N = 5;

    int[] myInts = new int[N];
    boolean[] myBooleans = new boolean[N];
    double[] myDoubles = new double[N];
    char[] myChar = new char[N];
    String[] myStrings = new String[N];
 
    System.out.println("myInts: " + Arrays.toString(myInts));
    System.out.println("myBooleans: " + Arrays.toString(myBooleans));
    System.out.println("myDoubles: " + Arrays.toString(myDoubles));
    System.out.println("myChar: " + Arrays.toString(myChar));
    System.out.println("myStrings: " + Arrays.toString(myStrings));
  }
}
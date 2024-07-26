/**
 * Main
 *
 * This class demonstrates the use of generic methods to display arrays
 * and get the first element of arrays with different data types.
 */
public class Main {

  public static void main(String[] args) {
    // Define arrays of different types
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 5.1, 4.2, 3.3, 2.4, 1.5 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' }; // Corrected '0' to 'O'
    String[] stringArray = { "Bro!" };

    // Display each array using the generic displayArray method
    displayArray(intArray);
    displayArray(doubleArray);
    displayArray(charArray);
    displayArray(stringArray);

    System.out.println();

    // Get and print the first element of each array using the generic getFirstElement method
    System.out.println(getFirstElement(intArray));
    System.out.println(getFirstElement(doubleArray));
    System.out.println(getFirstElement(charArray));
    System.out.println(getFirstElement(stringArray));
  }

  /**
   * Generic method to display elements of an array
   *
   * @param array The array to be displayed
   * @param <T>   The type of elements in the array
   */
  public static <T> void displayArray(T[] array) {
    // Loop through each element in the array and print it
    for (T i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  /**
   * Generic method to get the first element of an array
   *
   * @param array The array from which to get the first element
   * @param <T>   The type of elements in the array
   * @return The first element of the array
   */
  public static <T> T getFirstElement(T[] array) {
    // Return the first element of the array
    return array[0];
  }
}

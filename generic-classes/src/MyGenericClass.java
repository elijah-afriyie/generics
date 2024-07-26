/**
 * MyGenericClass
 */
public class MyGenericClass<T, V> {

  // Fields to store the generic types
  T x;
  V y;

  // Constructor to initialize the fields
  MyGenericClass(T x, V y) {
    this.x = x;
    this.y = y;
  }

  // Method to get the value of x
  public T getX() {
    return x;
  }

  // Method to get the value of y
  public V getY() {
    return y;
  }
}

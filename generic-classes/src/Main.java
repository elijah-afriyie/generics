public class Main {

  public static void main(String[] args) {
    // Creating instances of MyGenericClass with different type parameters

    // Instance with both types as Integer
    MyGenericClass<Integer, Integer> firstSet = new MyGenericClass<Integer, Integer>(
      127,
      8008
    );

    // Instance with the first type as Double and the second type as Integer
    MyGenericClass<Double, Integer> secondSet = new MyGenericClass<Double, Integer>(
      3.147,
      99
    );

    // Instance with both types as Character
    MyGenericClass<Character, Character> thirdSet = new MyGenericClass<Character, Character>(
      'A',
      'Z'
    );

    // Instance with the first type as String and the second type as Integer
    MyGenericClass<String, Integer> fourthSet = new MyGenericClass<String, Integer>(
      "How is it going, boy and girls?",
      14
    );

    // Printing the values stored in each instance

    // Printing the first and second elements in firstSet
    System.out.println("1st element in firstSet: " + firstSet.getX());
    System.out.println("2nd element in firstSet: " + firstSet.getY());
    System.out.println();

    // Printing the first and second elements in secondSet
    System.out.println("1st element in secondSet: " + secondSet.getX());
    System.out.println("2nd element in secondSet: " + secondSet.getY());
    System.out.println();

    // Printing the first and second elements in thirdSet
    System.out.println("1st element in thirdSet: " + thirdSet.getX());
    System.out.println("2nd element in thirdSet: " + thirdSet.getY());
    System.out.println();

    // Printing the first and second elements in fourthSet
    System.out.println("1st element in fourthSet: " + fourthSet.getX());
    System.out.println("2nd element in fourthSet: " + fourthSet.getY());
    System.out.println();
  }
}

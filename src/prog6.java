// Java Code to demonstrate Object class

/**
 In Java, primitive data types are not objects due to their fundamental nature and the way they are handled in memory. Primitive types directly store values, such as integers, floating-point numbers, characters, and booleans, and are designed for efficiency and performance. They do not have methods or properties associated with them, unlike objects, which are instances of classes and can encapsulate data and behavior.
 The eight primitive data types in Java are byte, short, int, long, float, double, char, and boolean.
 These types are treated specially by the Java Virtual Machine (JVM) and are stored directly in memory, allowing for fast access and manipulation.
 Objects, on the other hand,
 are instances of classes and are stored in the heap memory.
 They are accessed through references and can have methods and properties. The distinction between primitive types and objects is crucial for performance reasons. If primitive types were objects, it would introduce overhead due to the object creation and management process, impacting the performance of many common operations, such as loops and calculations.
 To bridge the gap between primitive types and objects,
 Java provides wrapper classes for each primitive type, such as Integer for int, Double for double, and so on. These wrapper classes allow primitive types to be treated as objects when needed, for example, when using collections or other object-oriented features. However, using wrapper classes comes with a performance cost, so primitive types are preferred in situations where performance is critical.
 */
class Person {
    String n;  //name

    // Constructor
    public Person(String n) {
        this.n = n;
    }

    // Override toString() for a
    // custom string representation
    @Override
    public String toString() {
        return "Person{name:'" + n + "'}";
    }

    public static void main(String[] args) {

        Person p = new Person("Geek");
        Person p1 = new Person("Geek");
        Person p3;
        p3 = p;
        boolean exp2 = p3.equals(p);
        boolean exp = p1.equals(p);
        System.out.println(exp2);
        System.out.println(exp);

        // Custom string representation
        System.out.println(p.toString());
        System.out.println(p.getClass());


        // Default hash code value
        System.out.println(p.hashCode());
    }
}
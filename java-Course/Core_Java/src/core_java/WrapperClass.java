/*
	
    🔹 What is Wrapper Class in Java?
        Wrapper classes are used to wrap primitive data types (like int, char, boolean) into objects.
	
	For example:
        | primitive type | wrapper class |
        | -------------- | ------------- |
        | int            | Integer       |
        | char           | Character     |
        | boolean        | Boolean       |
        | double         | Double        |
        | byte           | Byte          |
        | float          | Float         |
        | short          | Short         |
        | long           | Long          |


    Why Wrapper Classes?
        Needed when working with collections (ArrayList, etc.)
        Provide utility methods (like parseInt())
        Used in serialization, synchronization, etc.

	
        Integer oldVersion = new Integer(5);       //  old version
        System.out.println(oldVersion);

        Integer newVersion = Integer.valueOf(1);       //  new version
        System.out.println(newVersion);


    ✅ Auto-boxing and Unboxing
        🟩 Auto-boxing:
            Automatic conversion of primitive → Wrapper object.

            int a = 10;
            Integer obj = a;   // auto-boxing


        🟥 Unboxing:
            Automatic conversion of Wrapper object → primitive.

            Integer newVersion = Integer.valueOf(1);
            int b = newVersion;


    ✅ Summary
        | Term       | Meaning                                      |
        | ---------- | -------------------------------------------- |
        | Wrapper    | Object version of a primitive type           |
        | Boxing     | Primitive → Wrapper (manual or auto)         |
        | Autoboxing | Automatically converting primitive to object |
        | Unboxing   | Wrapper → Primitive                          |


    🔔 Small interview type points:
        Wrapper classes are found in java.lang package.
        Java 5 introduced autoboxing and unboxing.
        Prior to Java 5, you had to manually do: Integer i = new Integer(10); and int x = i.intValue();
        Useful methods: Integer.parseInt("123"), Double.parseDouble("4.5")


        package my_java_package_name;
 */
package core_java;

public class WrapperClass {
    public static void main(String[] args) {

        int i = 5; // primitive data type

        // boxing(primitive to object)
        Integer i1 = i; // Same as Integer.valueOf(20) -> auto-boxing
        System.out.println("auto-boxing : " + i1);

        Integer i2 = Integer.valueOf(i); // Boxing or Wrapping
        System.out.println("boxing : " + i2);

        // unboxing (object to primitive)
        int i4 = i2; // auto-unboxing
        System.out.println("auto-unboxing : " + i4);

        int i3 = i1.intValue(); // unboxing
        System.out.println("unboxing : " + i3);


        String s = "123"; // string to int
        System.out.println("Str to int : " + Integer.parseInt(s));
    }
}

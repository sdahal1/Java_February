package fundamentals.PMLecture_Strings_methods_modularization;


public class Strings{
    public static void main(String[] args){
        System.out.println("Hello strings!");

        String coolQuote = "It is not the Mountains ahead that will wear you out, it is the pebble in your shoe - ";
        
        String author = "Muhammad Ali";

        String result = coolQuote.concat(author);

        System.out.println(result);


        Integer wherePebbleAt = coolQuote.indexOf("pebble");
        System.out.println(wherePebbleAt);
        

        //EQUALITY COMPARISON FOR STRINGS, watch out for this one!
        // Normal string assignment
        // String a = "same string";
        // String b = "same string";
        // System.out.println(a == b); // true
        // Creating new strings as separate objects (another way to create a String)
        String a = new String("same letters");
        String b = new String("same letters");
        // System.out.println(a == b); // false. Not the same object in memory.
        System.out.println(a.equals(b)); // true. same exact characters.

       
        generateFullName("Kelvin", "Eseneyder", "Arauz");
        generateFullName("Rob", "Dahal");
    }

    //method overloading is when you have multiple methods that are same in thir return type and name but they differ in their parameters.
    //method signature for this generateFullName is: public static void generateFullName(String firstName, String lastName)
    public static void generateFullName(String firstName, String lastName){

        System.out.println(String.format("Hello, %s %s",firstName, lastName));
    }

    //method signature for this generateFullName is: public static void generateFullName(String firstName, String middleName, String lastName)

    public static void generateFullName(String firstName, String middleName, String lastName){
        System.out.println(String.format("Hello, %s %s %s",firstName, middleName, lastName));
    }


}
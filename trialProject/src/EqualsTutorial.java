public class EqualsTutorial {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        String string2 = new String("Hello");
        if (string1.equals(string2)) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are not equal");
        }
    }
}   /*
    can use == for primitive types
    use public boolean equals (Object obj) {
    defining how the object is equal to itself
    }
    when you are creating complex, or non-primitive objects, you can take off the parenthesis to be able to use ==, such as if you
    were going to remove the parenthesis from hello, above
    */

import java.util.ArrayList;

public class Student{
    private String name;
    private int age;
    public Student(String n, int a){
        name = n;
        age = a;
    }
    public String toString(){
        return name + " is " + age + " years old";
    }


    public static void main(String[] args)
    {
        ArrayList<Student> rayList = new ArrayList<Student>();

        rayList.add(new Student("Samuel", 16));
        rayList.add(new Student("Sam", 15));
        rayList.add(new Student("Bob", 13));
        rayList.add(new Student("Susan", 14));
        rayList.add(new Student("Joe", 17));
        System.out.println(rayList.get(0)); // LINE 1
        System.out.println(rayList.get(1)); // LINE 2
        System.out.println(rayList.get(2)); // LINE 3
        System.out.println(rayList.size()); // LINE 4
        System.out.println(rayList.remove(0)); // LINE 5
        System.out.println(rayList); // LINE 6
        System.out.println(rayList.remove(1)); // LINE 7
        System.out.println(rayList); // LINE 8





    }}


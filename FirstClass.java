import java.util.Scanner;
 class Student{
    String name;
    int age;
     Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class FirstClass {




    public static void main (String[] args) {
      Student first=new Student("Harshit",22),second=new Student("amit",26);


      System.out.println(first.name);
      System.out.println(first.age);
        System.out.println(second.name);
        System.out.println(second.age);

    }
}

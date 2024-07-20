class Dog{
    void bark(){
        System.out.println("Bark");
    }
}
class Cat extends Dog{
    void voice(){
        System.out.println("Voice");
    }
}


public class SingleInheritance {

    public static void main(String[] args) {
        Cat harry = new Cat();
        harry.bark();
        harry.voice();
    }
}

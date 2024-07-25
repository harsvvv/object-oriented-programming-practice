
class Animal{
    String name;
    Animal(){

    }
    Animal(String name){
        this.name = name;
        System.out.println("Animal name is "+name);
    }
}
class Dogo extends Animal{
    String name;
    Dogo(){
    super("Dog");
    }
    Dogo(String name){
        super(name);
    }

}
class Kitty extends Animal{
    String name;
    Kitty(){
        super("Cat");
    }
    Kitty(String name){
        super(name);
    }


}
public class HeirarichalInheritance {
    public static void main(String[] args){
        Dogo d=new Dogo("Dog");
        Dogo d2=new Dogo();
        Kitty k=new Kitty("lucy");


    }
}

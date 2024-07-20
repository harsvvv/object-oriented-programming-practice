
class Student1{
    String name;
    int id;
    Student1(String name,int id){
        this.name=name;
        this.id=id;
    }
    void getNameAndId(){
        System.out.println(name);
        System.out.println(id);
    }
    void setName(String name){
        this.name=name;
    }
    void setId(int id){
        this.id=id;
    }

}
public class Custructor {
    public static void main(String args[]){

        Student1 s1=new Student1("John",1);
        s1.getNameAndId();
    }
}

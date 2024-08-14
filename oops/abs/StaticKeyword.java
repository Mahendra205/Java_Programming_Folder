



public class StaticKeyword {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="mahendra";
        System.out.println(s1.getName());
        s1.schoolName="NA";
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
    }

}
class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
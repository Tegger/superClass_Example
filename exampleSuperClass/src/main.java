//Person parent class
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

//Mother class is Person, feeds kids
class Mother extends Person{
    Mother(String n){
        super(n);
        name = "Mother: " + n;
    }
    void FeedKids(){
        System.out.println(name + " has fed the kids.");
    }
}

//Wife class calls husband
class Wife extends Person{
    Wife(String n){
        super(n);
        name = "Wife: " + n;
    }
    void CallHusband(){
        System.out.println(name + " is calling - RUN!");
    }
}

public class main {
    public static void main(String args[]){
        Person p = new Person("Julie");
        Wife w = new Wife("Angelica");
        Mother m = new Mother("Jill");

        System.out.println("p is - " + p.name);
        System.out.println("w is - " + w.name);
        System.out.println("m is - " + m.name);
        m.FeedKids();
        w.CallHusband();

    }

}

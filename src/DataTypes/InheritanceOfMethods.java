package DataTypes;

public class InheritanceOfMethods {
}

class Entity {
    public void move(){
        System.out.println("Я передвигаюсь.");
    }

    public void eat(){
        System.out.println("Я ем.");
    }
}
class Humann extends Entity{


    public void speak(){
        System.out.println("Я умею общаться.");
    }
}

class JavaDeveloper extends Human {


    public void code(){
        System.out.println("Я умею общаться на Java.");
    }
}
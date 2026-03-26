class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        sound();       
        super.sound(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}
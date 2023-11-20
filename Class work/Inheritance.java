public class Inheritance {
    public static void main(String[] args) {
        cat cat = new cat("kitty", 4, "black", "meow", "small");
        // System.out.println(cat);
        cat.printAnimalia();
        cat.sound();
    }
    
}


class Animal {
    String name;
    int legs;

    Animal (String name, int legs, String color, String size) {
        this.name = name;
        this.legs = legs;
    }

    public void printAnimalia() {
        System.out.println(name);
    }
}

class cat extends Animal {
    String color;
    String catSound;
    String size;

    cat (String name, int legs, String color, String catSound, String size) {
        super(name, legs, color, size);
        this.catSound = catSound;
    }

    public void sound () {
        System.out.println(catSound);
    }
}

class dog extends Animal {
    String color;
    String size;

    dog (String name, int legs, String color, String size) {
        super(name, legs, color, size);
    }
}
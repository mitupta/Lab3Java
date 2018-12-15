public class Zoo {

    public static void main(String[] args) {

        Animal[] animals = new Animal[7];
        animals[0] = new Dog("Leszek");
        animals[1] = new Dog("Azor");
        animals[2] = new Cat("Filemon");
        animals[3] = new Pig("Prosiaczek");
        animals[4] = new Animal();
        animals[5] = new Snake("Wonsz");
        animals[6] = new Cow("Mućka");

        for (Animal animal : animals) {
            animal.introduce();
        }
    }
}

class Animal{
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę " + name;
    }

    String makeSound(){
        return "???";
    }

    void introduce(){
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}

class Dog extends Animal{
    public Dog(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return " hau hau";
    }
}

class Cat extends Animal{
    public Cat(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "kot " + name;
    }

    @Override
    String makeSound() {
        return "miau miau";
    }
}

class Pig extends Animal {
    public Pig(String name) {
        this.name = name;
    }
}

class Snake extends Animal{
    public Snake(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Wąż " + name;
    }

    @Override
    String makeSound() {
        return "syczę";
    }
}

class Cow extends Animal{
    public Cow(String name) {
        this.name = name;
    }

    @Override
    String showName() {
        return "Krowa " + name;
    }

    @Override
    String makeSound() {
        return "Muuuuu";
    }
}





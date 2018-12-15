public class Sample {
    public static void main(String[] args) {

        new C();
        /*new A(1);
        new A("raz dwa trzy");*/
    }
}

class A {
    A() {
        System.out.println("Działa konstruktor bezargumentowy A");
    }

   /* A(int i){
        System.out.println("Działa konstruktor z int = " + i);
    }

    A(String str){
        System.out.println("Działa konstruktor z string = " + str );
    }*/
}

class B extends A{
    public B() {
        System.out.println("Działa konstruktor bezargumentowy B");
    }
}

class C extends B{
    public C() {
        System.out.println("Działa konstruktor bezargumentowy C");
    }
}

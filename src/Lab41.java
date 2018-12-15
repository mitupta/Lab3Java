public class Lab41 {
    public static void main(String[] args) {

        //new CC();
        new BB(false);
        //new A(1);
        //new A("raz dwa trzy");*/
    }
}

class AA {
    AA() {
        System.out.println("Wywołano konstruktor A");
    }
    public AA(boolean condition){

        if ( condition == false){
            System.out.println("Wywołano konstruktor A");
        }

    }

}

class BB extends AA{
    public BB() {
        System.out.println("Wywołano konstruktor B");
    }
    public BB(boolean condition){
        super(true);
        if ( condition == false){
            System.out.println("Wywołano konstruktor B");
        }

    }
}

class CC extends BB{

    public CC() {
        System.out.println("Wywołano konstruktor C");
    }

    public CC(boolean condition){
        super(true);
        if ( condition == false){
            System.out.println("Wywołano konstruktor C");
        }

    }
}


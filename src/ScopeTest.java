public class ScopeTest {

    private String name;
    int test = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printTest(){
        int test = 20;
        System.out.println("test: " + test);

    }
    public static void main(String[] args) {

        ScopeTest scopeTest = new ScopeTest();
        System.out.println("--- " + scopeTest.test);
        scopeTest.printTest();
    }


}

import MyTest.TestHandler;
//
public class Main {
    public static void main(String[] args) {

        ClassForTesting classForTesting = new ClassForTesting();
        TestHandler.start(classForTesting.getClass());
        System.out.println();
        ClassExplorer.outClassInfo(String.class);
    }
}
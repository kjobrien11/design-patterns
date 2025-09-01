package CreationalPatterns.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        file1 f1 = new file1();
        file2 f2 = new file2();

        f1.printFile1();
        f2.printFile1();
    }
}

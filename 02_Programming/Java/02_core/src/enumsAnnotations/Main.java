package enumsAnnotations;

public class Main {
    @Buggy(priority = 1,severity = 1)
    public static void runBuggy() {
        System.out.println("blablabla");
    }
    public static void main(String[] args) {

    }
}
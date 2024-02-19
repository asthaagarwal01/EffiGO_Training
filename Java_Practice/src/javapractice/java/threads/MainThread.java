package javapractice.java.threads;


public class MainThread {

    public static void main(String[] args) {
        // Printing the default thread name
        System.out.println(Thread.currentThread().getName() + " thread");
        count();

    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}

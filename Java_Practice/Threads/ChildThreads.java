public class ChildThreads {

    public static class ChildThreadTask implements Runnable {
        @Override
        public void run() {
            count(); // Child thread performs count()
        }
    }

    public static void main(String[] args) {
        Thread childThread = new Thread(new ChildThreadTask());
        childThread.start();
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

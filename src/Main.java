class MyThread extends Thread {
    @Override
    public void run() {
        // 실행할 작업 작성
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread: " + i);
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}

public class Main {

    public static void main(String[] args) {
        MyThread thread = new MyThread();

        thread.start();

        thread.run();
        System.out.println("나를 막지마");


    }
}
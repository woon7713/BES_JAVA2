class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Runndable 실행중");
    }

}

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());

        thread.start();

    }
}
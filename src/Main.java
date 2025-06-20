class SumRunnable implements Runnable{
    private final int[] numbers;

    public SumRunnable(int[] numbers){
        this.numbers = numbers;
    }

    @Override
    public void run(){
        int sum = 0;
        for(int n : numbers){
            sum+= n;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " - Sum: " + sum);


    }

}

public class Main {
    public static void main(String[] args) {
        int[][] dataSets = {
                {1, 2, 3, 4, 5},
                {10, 20, 30},
                {7, 14, 21, 28},
                {100, 200, 300, 400}
        };

        for (int i = 0; i < dataSets.length; i++) {
            Thread thread = new Thread((new SumRunnable(dataSets[i])), "Thread-" + i);
            thread.start();

        }

        // 결과 : 별도로 돌아가니깐 갯수가 적은 순으로 완료되서 출력(cpu 계산 로직대로) -> 순서를 지정할 수 없음.




    }
}
public class threads extends Thread{
    public void run(){
        try{
        System.out.println("Thread started ID:"+Thread.currentThread().getId());
        Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        threads thread1 = new threads();
        thread1.start();
        threads thread2 = new threads();
        thread2.start();
    }
}
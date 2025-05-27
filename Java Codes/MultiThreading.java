class MyThread extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 1 is Running ");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Exception occured");
                e.printStackTrace();
            }
        }
    }
}
class MyRunnable implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread 2 is Running ");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Exception occured");
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreading
{
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
	    Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
		System.out.println("Execution Completed");
	}
}
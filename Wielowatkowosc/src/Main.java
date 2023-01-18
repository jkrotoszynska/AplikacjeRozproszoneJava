class MyThread extends Thread
{
    public MyThread()
    {
        super();
    }

    public void run()
    {
        System.out.println("Thread: MyThread");
    }
}

public class Main
{
    public static void main(String args[])
    {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Thread: Main");
    }
}
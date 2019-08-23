package run;

class RunnableDemo implements Runnable
{
    private  Thread t;
    private  String threadName;
    RunnableDemo(String threadName)
    {
        this.threadName=threadName;
        System.out.println("Creating"+threadName);
    }
    public void run()
    {
        System.out.println("Runing"+threadName);
        try{
            for(int i=0;i<4;i++)
            {
                System.out.println("Thread:"+threadName+","+i);
                Thread.sleep(50);
            }

        }catch (InterruptedException e)
        {
            System.out.println("Thread is interrupte.");
        }
        System.out.println("Thread"+threadName+" is exiting.");
    }
    public void start()
    {
        System.out.println("Starting "+threadName);
        if(t==null)
        {
            t=new Thread(this,threadName);
            t.start();
        }

    }
    public void stop()
    {
        try{
            t.join();

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}

public class TestThreadone {

    public static void main(String []args)
    {
        RunnableDemo runone=new RunnableDemo("Thread1");
        runone.start();
        RunnableDemo runtwo=new RunnableDemo("Thread2");
        runtwo.start();
        runone.stop();
        runtwo.stop();
    }

}

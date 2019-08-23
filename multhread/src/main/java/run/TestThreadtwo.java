package run;
class ThreadDemo extends Thread
{
    private Thread t;
    private String threadName;
    ThreadDemo( String threadName)
    {
        this.threadName=threadName;
    }
    public void run()
    {
        System.out.println("Running"+threadName);
        try{
            for(int i=0;i<4;i++)
            {
                Thread.sleep(50);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Thread"+threadName+"interrrupte");
        }
       System.out.println("Thread"+threadName+"exiting");
    }
    public void start()
    {
        System.out.println("Starting"+threadName);
        if(t==null)
        {
            t=new Thread(threadName);
            t.start();
        }
    }


}

public class TestThreadtwo {
      public static void main(String args[])
      {
          ThreadDemo t1=new ThreadDemo("Thread-1");
          t1.start();
          ThreadDemo t2=new ThreadDemo("Thread-2");
          t2.start();
      }
}

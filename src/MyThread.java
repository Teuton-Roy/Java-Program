class thread implements Runnable
{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"Hello");
        }
    }
}

public class MyThread {
    public static void main(String[] args){

        thread m = new thread();
        Thread t = new Thread(m);
        t.start();

        for (int j = 0; j <5; j++) {
            System.out.println(j+"Fucker!");
        }
    }
}

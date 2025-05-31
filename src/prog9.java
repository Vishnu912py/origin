class t1 extends Thread{
    public void run(){
        try {
            for(int i=0;i<4;i++){
                System.out.printf("%s",Thread.currentThread().getName());
                System.out.println();
                Thread.sleep(100);
            }

        }
        catch (InterruptedException ie){
            System.out.println("Error");
        }

    }
}

class t2 extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("%s",Thread.currentThread().getName());
                System.out.println();
                Thread.sleep(100);
            }

        }
        catch(InterruptedException ie){
            System.out.println("Error");
        }
    }

}

class t3 extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 8; i++) {
                System.out.printf("%s",Thread.currentThread().getName());
                System.out.println();
                Thread.sleep(100);
            }

        }
        catch(InterruptedException ie){
            System.out.println("Error");
        }
    }
}




public class prog9 {
    public static void main(String[] args){
        try{
            System.out.println("Main Thread starts execution");
            Thread.sleep(10000);
            t1 tr1 = new t1();
            t2 tr2 = new t2();
            t3 tr3 = new t3();
            tr1.start();
            tr2.start();
            tr3.start();

        }
        catch (InterruptedException ie){
            System.out.println("An error has occured");
        }


    }
}
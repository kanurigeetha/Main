// public class Main5 {

//     public static class Test extends Thread{
//         public void run(){
//             System.out.println("my thread is running");
//         }
//     }
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.start();
//     }
// }



class ThreadDemo implements Runnable{
    public void run(){
        System.out.println("my current thread is"+Thread.currentThread().getId());

    }
}
class Main{
    public static void main(String[] args){
        for(int i=0;i<5;i++){

        
        Thread obj=new Thread(new ThreadDemo());
        obj.start();
    }
        for(int j=0;j<5;j++){
            System.out.println(j);
        }
    }
}


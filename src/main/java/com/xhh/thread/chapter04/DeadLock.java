package com.xhh.thread.chapter04;

public class DeadLock {

    private static final Object MUTEX_READ = new Object();
    private static final Object MUTEX_WRITE = new Object();

    public void read(){
        synchronized (MUTEX_READ){
            System.out.println(Thread.currentThread().getName() +" GET READ-LOCK.");
            synchronized (MUTEX_WRITE){
                System.out.println(Thread.currentThread().getName() +" GET WRITE-LOCK.");
            }
            System.out.println(Thread.currentThread().getName() +" RELEASE WRITE-LOCK.");
        }
        System.out.println(Thread.currentThread().getName() +" RELEASE READ-LOCK.");
    }


    public void write(){
        synchronized (MUTEX_WRITE){
            System.out.println(Thread.currentThread().getName() +" GET WRITE-LOCK.");
            synchronized (MUTEX_READ){
                System.out.println(Thread.currentThread().getName() +" GET READ-LOCK.");
            }
            System.out.println(Thread.currentThread().getName() +" RELEASE READ-LOCK.");
        }
        System.out.println(Thread.currentThread().getName() +" RELEASE WRITE-LOCK.");
    }

    public static void main(String[] args) {
       final DeadLock deadLock = new DeadLock();
       new Thread(() -> {
           while (true){
               deadLock.read();
           }
       },"READ-THREAD").start();

        new Thread(() -> {
            while (true){
                deadLock.write();
            }
        },"READ-WRITE").start();
    }

    /**
     * TODO 监测到死锁程序
     *
     * 名称: READ-WRITE
     * 状态: java.lang.Object@102f0875上的BLOCKED, 拥有者: READ-THREAD
     * 总阻止数: 2, 总等待数: 0
     *
     * 堆栈跟踪:
     * com.xhh.thread.chapter04.DeadLock.write(DeadLock.java:24)
     *    - 已锁定 java.lang.Object@394300d5
     * com.xhh.thread.chapter04.DeadLock.lambda$main$1(DeadLock.java:41)
     * com.xhh.thread.chapter04.DeadLock$$Lambda$2/990368553.run(Unknown Source)
     * java.lang.Thread.run(Thread.java:748)
     *
     * =====================================================================
     * 名称: READ-THREAD
     * 状态: java.lang.Object@394300d5上的BLOCKED, 拥有者: READ-WRITE
     * 总阻止数: 1, 总等待数: 0
     *
     * 堆栈跟踪:
     * com.xhh.thread.chapter04.DeadLock.read(DeadLock.java:12)
     *    - 已锁定 java.lang.Object@102f0875
     * com.xhh.thread.chapter04.DeadLock.lambda$main$0(DeadLock.java:35)
     * com.xhh.thread.chapter04.DeadLock$$Lambda$1/2003749087.run(Unknown Source)
     * java.lang.Thread.run(Thread.java:748)
     */
}


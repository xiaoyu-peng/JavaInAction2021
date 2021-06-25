package com.xhh.thread.chapter14;

import java.net.Socket;
import java.sql.Connection;

/**
 * final 不允许被继承
 *
 * @author PengHui
 */
public final class Singleton {

    private byte[] data = new byte[1024];

    private volatile static Singleton instance = null;

    Connection conn;

    Socket socket;

    private Singleton(){
       /* this.conn;
        this.socket;*/
    }

    public static Singleton getInstance() {
        // 当instance为null时，进入同步代码块，同时该判断避免了每次都要进入同步代码块，提升效率
        if (null == instance) {
            // 只有一个线程能获得Singleton.class管理的monitor
            synchronized (Singleton.class) {
                // 判断如果instance为null，则创建
                if(null == instance){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }


}

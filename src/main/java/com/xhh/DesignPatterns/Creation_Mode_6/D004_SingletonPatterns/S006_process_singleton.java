package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns;

import sun.security.jca.GetInstance;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 集群唯一： 需要把单例对象序列化存储到外部共享存储区（比如文件）。
 *          进程在使用这个单例对象的时候，需要先从外部共享存储区中读取它到内存，并反序列化成对象，然后再使用，使用完成后还需要再存储回外部共享存储区。
 *
 *          TODO 1）为了保证任何时刻，在进程间都只有一份对象存在，一个进程在获取到对象之后，需要对对象加锁，避免其他进程再将其获取。
 *               2）在进程使用完成这个对象之后，还需要显式地将对象从内存中删除，并且释放对对象的加锁。
 */
public class S006_process_singleton {
    
}

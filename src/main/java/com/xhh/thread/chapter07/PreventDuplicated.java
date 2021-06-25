package com.xhh.thread.chapter07;

import com.sun.media.sound.SoftTuning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PreventDuplicated {

    private final static String LOCK_PATH = "D:\\work";
    private final static String LOCK_FILE = ".lock";
    private final static String PERMISSIONS = "rw-----";

    public static void main(String[] args) throws IOException {

        // 1. 注入hook线程，在程序退出时删除lock文件
        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("The program received kill SIGNAL.");
            getLockFile().toFile().delete();
        }));

        // 2. 检查是否存在 .lock文件
        checkRunning();

        // 3. 模拟程序正在运行
        for(;;){
            try {
                TimeUnit.MILLISECONDS.sleep(2);
                System.out.println("program is running.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void checkRunning() throws IOException {
        Path lockFile = getLockFile();
        if(lockFile.toFile().exists()){
            throw new RuntimeException("The program already running.");
        }

        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString(PERMISSIONS);
        Files.createFile(lockFile, PosixFilePermissions.asFileAttribute(posixFilePermissions));

    }

    private static Path getLockFile(){
        return Paths.get(LOCK_PATH, LOCK_FILE);
    }
}

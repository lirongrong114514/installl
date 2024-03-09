package lrr.java;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.*;
public class log extends Thread {
    public static void log() {
        String $croute = date();
        String[] $arr = $croute.split(" ");
        File log = new File("../lrr/log/", $arr[0] + "log.log");
        if (log.exists()) {
        } else {
            String Error = "[BUG!]";
            String error = "[ERROR]";
            String warn = "[WARN]";
            String info = "[INFO]";
            String debug = "[DERBUG]";
            try {
                log.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String date() {
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        return sd;
    }

    public static void GetBroadcasts() {
        int port = 54188;
        try {
            ServerSocket serverSocket = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public static void temp(){
        String $c=;
        File log=new File("../lrr/temp/",);
        if(log.exists()){

        }
    }*/
    public static void main(String[] args) {
        lrr.java.log.log();
    }
}


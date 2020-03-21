package com.dahl.myapp;


import android.content.Context;
import android.os.Environment;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class tool {
      public static void print(String text, Context ccc){
          Toast ts = Toast.makeText(ccc,text,Toast.LENGTH_LONG);
          ts.show();
      }
    public static void writeExternal(String filePathName, String content) throws IOException {
        String storageState = Environment.getExternalStorageState();
        if (storageState.equals(Environment.MEDIA_MOUNTED)) {
            FileOutputStream fileOutputStream = new FileOutputStream(filePathName);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.close();

        }
    }
    public static void 关闭IO流(Closeable... closeables) {
        if (null == closeables || closeables.length <= 0) {
            return;
        }
        for (Closeable cb : closeables) {
            try {
                if (null == cb) {
                    continue;
                }
                cb.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static String readw(String filename) {
        File file = new File(filename);
        BufferedReader bufferedReader = null;
        String str = null;
        try {
            if (file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(filename));
                str = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            关闭IO流(bufferedReader);
        }
        return str;
    }
}

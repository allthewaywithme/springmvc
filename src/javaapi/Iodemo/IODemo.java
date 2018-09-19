package javaapi.Iodemo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/15 16:49
 */
public class IODemo {

    //IO流输入输出是操作硬盘的
    // IO流  input output stream
    //绝对路径 \代表根目录
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hp\\Desktop\\2018辽宁\\2.txt");
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String x = scanner.nextLine();
                System.out.println(x);
            }

        }

//        io();

    }

    public static void io() throws IOException {
        //C:\Users\hp\Desktop\2018辽宁
        File file = new File("C:\\Users\\hp\\Desktop\\2018辽宁\\2.txt");
//        if (file.isDirectory()){
//            System.out.println("是个文件夹");
////            String[] list = file.list();
//            File[] files=file.listFiles();
//            System.out.println("d");
//
//        }else if (file.isFile()){
//            System.out.println("是个文件");
//        }
        if (!file.exists()) {
            System.out.println("dddd");
            PrintWriter p=null;
            try {
                file.createNewFile();
                p=new PrintWriter(file);//写操作
                p.println("这个是传概念的文件，字符串类型的");
                p.println("这个是传概念的文件，字符串类型的");
                p.println("这个是传概念的文件，字符串类型的");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (p!=null)
                    p.close();//关闭资源
            }
        }


    }

}






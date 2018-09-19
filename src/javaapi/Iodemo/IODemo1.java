package javaapi.Iodemo;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/9/15 17:44
 */
public class IODemo1 {
    public static void main(String[] args) throws IOException {

        String str="";
        try(
                InputStream in=new FileInputStream(new File("C:\\Users\\hp\\Desktop\\图片\\1.txt"));
                OutputStream out=new FileOutputStream(new File("C:\\Users\\hp\\Desktop\\图片\\2.txt"));
        ){
            int ch;
            byte [] buff=new byte[512];//定义一个数组当缓冲区，读出来的字节放到这个缓冲区
            while((ch=in.read(buff))!=-1){
//                System.out.println((char)ch);
//                out.write(ch);
                str=str+new String(buff,0,ch);
                buff=new byte[512];//清空buff
            }
            System.out.println(str);//全部读完再输出



        }catch (Exception e){
            e.printStackTrace();
        }




    }
}

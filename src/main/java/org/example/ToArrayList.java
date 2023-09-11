package org.example;


import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ToArrayList {

    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
       // PrintStream printStream = new PrintStream(outputStream);
        //System.setOut(printStream);
        ArrayList<String> al = new ArrayList<String>();

        al.add("i");

        al.add("am");

        al.add("Zilatan");

        String[] strArr = al.toArray(new String[al.size()]);

        for (String str : strArr) {

            System.out.println(str);
            //Scanner in =new Scanner(System.in);
            //int a =in.nextInt();
        }
        String codeResult = outputStream.toString();

        // 创建一个JFrame对象
        JFrame frame = new JFrame("Code Result");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null); // 将窗口位置设置为屏幕中央
        frame.setVisible(true);
        // 显示代码结果的消息框
        //JOptionPane.showMessageDialog(frame, codeResult);

        // 设置窗口大小和位置

    }

}

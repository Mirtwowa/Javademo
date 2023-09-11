package org.example;
import java.io.PrintStream;
import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.ByteArrayOutputStream;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.AttributedCharacterIterator;
import java.util.Scanner;
import java.awt.*;

public class Win1 extends JFrame {
    public static void main(String[] args) throws SQLException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
       PrintStream printStream = new PrintStream(outputStream);

        Connection con = null;
        Statement sql;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            //与数据库取得链接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "123456");
        } catch (SQLException e) {
            System.out.println(e);
        }
        if (null != con) {//要在con非空的条件下运行，否则无法获取Statement对象
            //创建Statement对象，用于传输SQL语句
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //示例所示为查询功能即“SELECT”
            System.out.println("电话录入请输入1，修改输入2，删除输入3，姓名查询请输入4，号码查询请输入5，部门查询请输入6，显示所有电话信息请输入7，打印请输入8");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            while (num != -1) {
                switch (num) {

                    case 1 -> {
                        System.out.println("请输入联系人，部门和号码：");
                        String changename = in.next();
                        String changedep = in.next();
                        String changenum = in.next();
                        String insertSql = "INSERT INTO phonenumber (NAME,DEPARTMENT,NUMBER) VALUES (?,?,?)";
                        PreparedStatement insertPst = con.prepareStatement(insertSql);
                        insertPst.setString(1, changename);
                        insertPst.setString(2, changedep);
                        insertPst.setString(3, changenum);
                        insertPst.execute();

                    }
                    case 2 -> {
                        //有两种方法，下面是第一种
                   /* rs = sql.executeQuery("SELECT * FROM phonenumber");
                    System.out.println("请输入更改的电话：");
                    String changebefore = in.next();
                    String sql2 = "SELECT * FROM phonenumber WHERE NUMBER = ?";
                    PreparedStatement selectPst = null;
                    try {
                        selectPst = con.prepareStatement(sql2);
                        selectPst.setString(1, changebefore);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    try {
                        rs = selectPst.executeQuery();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    // 如果找到记录，删除原有记录并插入新记录；否则给出提示信息
                    if(rs.next()){
                        String name = rs.getString("NAME");
                        String department = rs.getString("DEPARTMENT");
                        // 删除原有记录
                        String deleteSql = "DELETE FROM phonenumber WHERE NUMBER = ?";
                        PreparedStatement deletePst = null;
                        try {
                            deletePst = con.prepareStatement(deleteSql);
                            deletePst.setString(1, changebefore);
                            deletePst.executeUpdate();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        // 输入新电话号码并插入新记录
                        System.out.println("请输入正确电话号码：");
                        String newNumber = in.next();
                        String insertSql = "INSERT INTO phonenumber (NAME, DEPARTMENT, NUMBER) VALUES (?, ?, ?)";
                        PreparedStatement insertPst = null;
                        try {
                            insertPst = con.prepareStatement(insertSql);
                            insertPst.setString(1, name);
                            insertPst.setString(2, department);
                            insertPst.setString(3, newNumber);
                            insertPst.executeUpdate();
                            System.out.println("已成功更改 " + name + " 的电话号码为：" + newNumber);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                    } else {
                        System.out.println("未找到要更改的电话号码");
                    }
                    try {
                        if (con != null) {
                            con.close();
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }*/
                        //第二种
                        rs = sql.executeQuery("SELECT * FROM phonenumber");
                        System.out.println("请输入更改的电话：");
                        String changebefore = in.next();
                        int searchnum;
                        while (rs.next()) {
                            if (changebefore.equals(rs.getString("NUMBER"))) {
                                String name2 = rs.getString("NAME");
                                String dep = rs.getString("DEPARTMENT");
                                System.out.println("请输入正确号码：");
                                String changeafter = in.next();
                                String deleteSql = "DELETE FROM phonenumber WHERE NUMBER = ?";
                                PreparedStatement deletePst = con.prepareStatement(deleteSql);
                                deletePst.setString(1, changebefore);
                                deletePst.executeUpdate();

                                String insertSql = "INSERT INTO phonenumber (NAME,DEPARTMENT,NUMBER) VALUES (?,?,?)";
                                PreparedStatement insertPst = con.prepareStatement(insertSql);
                                insertPst.setString(1, name2);
                                insertPst.setString(2, dep);
                                insertPst.setString(3, changeafter);
                                insertPst.execute();
                            } else {
                                System.out.println("查证失效，数据可能不存在");
                            }
                        }
                    }
                    case 3 -> {
                        System.out.println("请输入想要删除的号码：");
                        String changedel = in.next();
                        String deleteSql = "DELETE FROM phonenumber WHERE NUMBER = ?";
                        PreparedStatement deletePst = con.prepareStatement(deleteSql);
                        deletePst.setString(1, changedel);
                        deletePst.executeUpdate();
                        System.out.println("已经成功删除");
                    }
                    case 7 -> {
                        rs = sql.executeQuery("SELECT * FROM phonenumber");

                        while (rs.next()) {
                            System.out.print(rs.getString(1) + "\t");
                            System.out.print(rs.getString(2) + "\t");
                            System.out.print(rs.getString(3) + "\t");
                            System.out.println();
                        }
                    }
                    case 4 -> {
                        rs = sql.executeQuery("SELECT * FROM phonenumber");
                        System.out.println("请输入名字：");
                        String inputName = in.next();
                        String sql3 = "SELECT * FROM phonenumber WHERE NAME = ?";
                        PreparedStatement selectPst = null;
                        try {
                            selectPst = con.prepareStatement(sql3);
                            selectPst.setString(1, inputName);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }


                        try {
                            rs = selectPst.executeQuery();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                        // 输出符合条件的数据
                        try {
                            if (rs.next()) {
                                do {
                                    String name = rs.getString("NAME");
                                    String department = rs.getString("DEPARTMENT");
                                    String number = rs.getString("NUMBER");
                                    System.out.println(name + " " + department + " " + number);
                                } while (rs.next());
                            } else {
                                System.out.println("找不到数据");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    case 5 -> {
                        ResultSet rs3 = sql.executeQuery("SELECT * FROM phonenumber");
                        System.out.println("请输入电话：");
                        String inputPHONE = in.next();
                        String sql3 = "SELECT * FROM phonenumber WHERE NUMBER = ?";

                        PreparedStatement selectPst = null;
                        try {
                            selectPst = con.prepareStatement(sql3);
                            selectPst.setString(1, inputPHONE);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                        try {
                            rs3 = selectPst.executeQuery();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                        // 输出符合条件的数据
                        try {
                            if (rs3.next()) {
                                do {
                                    String name = rs3.getString("NAME");
                                    String department = rs3.getString("DEPARTMENT");
                                    String number = rs3.getString("NUMBER");
                                    System.out.println(name + " " + department + " " + number);
                                } while (rs3.next());
                            } else {
                                System.out.println("找不到数据");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }

                    case 6 -> {
                        ResultSet rs4 = sql.executeQuery("SELECT * FROM phonenumber");
                        System.out.println("请输入部门：");
                        String inputpar = in.next();
                        String sql3 = "SELECT * FROM phonenumber WHERE DEPARTMENT = ?";
                        PreparedStatement selectPst = null;
                        try {
                            selectPst = con.prepareStatement(sql3);
                            selectPst.setString(1, inputpar);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }


                        try {
                            rs4 = selectPst.executeQuery();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }

                        // 输出符合条件的数据

                        try {
                            if (rs4.next()) {
                                do {
                                    String name = rs4.getString("NAME");
                                    String department = rs4.getString("DEPARTMENT");
                                    String number = rs4.getString("NUMBER");
                                    System.out.println(name + " " + department + " " + number);
                                } while (rs4.next());
                            } else {
                                System.out.println("找不到数据");
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    case 8 -> {
                        ResultSet rs2 = sql.executeQuery("SELECT * FROM phonenumber");

                        while (rs2.next()) {
                            System.out.print(rs2.getString(1) + "\t");
                            System.out.print(rs2.getString(2) + "\t");
                            System.out.print(rs2.getString(3) + "\t");
                            System.out.println();
                        }
                    }
                }
                System.out.println("可以继续操作，想要退出请输入-1");
                num = in.nextInt();

            }


        }
        //System.setOut(printStream);

        // 获取调试台输出的结果
        String codeResult = outputStream.toString();

        // 创建一个JFrame对象
        JFrame frame = new JFrame("Code Result");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 显示代码结果的消息框
        JOptionPane.showMessageDialog(frame, codeResult);

        // 设置窗口大小和位置
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // 将窗口位置设置为屏幕中央
        frame.setVisible(true);
    }
}





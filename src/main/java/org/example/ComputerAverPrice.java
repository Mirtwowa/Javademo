package org.example;

import java.sql.*;
public class ComputerAverPrice {
    public static void main(String[] args)  {
        Connection con = null;
        Statement sql ;
        ResultSet rs;
        float price;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //加载注册数据库驱动程序
        }
        catch(Exception e){ }
        try{
            //与数据库取得链接
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","123456");}
        catch (SQLException e) {
            System.out.println(e);
            }
        try{
            if (null != con) {//要在con非空的条件下运行，否则无法获取Statement对象
                //创建Statement对象，用于传输SQL语句
                sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
           //示例所示为查询功能即“SELECT”
            rs = sql.executeQuery("SELECT * FROM book");
            rs.last();
            int max = rs.getRow();
            System.out.println("表共有" +max+ "条记录,随机抽取10条记录:");
            int [] a = GetRandomNumber.getRandomNumber(max,10);//创建a数组记录产生的随机数
            float sum = 0;
            for(int i = 0,j=0; i <a.length; i++){
                j=a[i];
                rs.absolute(j);//将结果集中的游标移到指定参数ROW的行
                price = rs.getFloat(3);//获取第三列的浮点数
                sum = sum + price;
            }
                con.close();
            System.out.println("平均价格:"+sum/a.length);
            }
        }
        catch(SQLException e){}
    }
    }

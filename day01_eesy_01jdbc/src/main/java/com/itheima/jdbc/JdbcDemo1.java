package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","root");
        //3.获取操作数据库的预处理对象
        PreparedStatement ps = conn.prepareStatement("select * from account");
        //4执行sql
        ResultSet rs = ps.executeQuery();
        //遍历结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //释放资源
        rs.close();
        ps.close();
        conn.close();
    }

}

package ls.hdgl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import ls.hdgl.entity.THd;


/**
 * Servlet implementation class HdService
 */
public class HdService{

 //获取数据库连接
	public static Connection getConnect() {
		//注册驱动
		try {
		Class.forName("com.db03.jdbc.Driver");
		//建立连接
		String url="JDBC:db03://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
		
		Connection conn = DriverManager.getConnection(url,"ankyou","19991214");
		
		return conn;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.print("未连接到数据库");
		}
		return null;
	}
	//获取所有学院列表
	public static List<Yy> getAllYy(){
		//获取数据库连接
				Connection conn = HdService.getConnect();
				
				//生成核心类
				QueryRunner runner = new QueryRunner();
				
				String sql1 = "select*from user1 ";
				
				List<Yy> users = new ArrayList<>();
				
				try {
					
					users = runner.query(conn, sql1,new BeanListHandler<Yy>(Yy.class));
					
					DbUtils.close(conn);

					}catch(SQLException e) {
						e.printStackTrace();
					}
				return users;
	}
	//获取活动
	public static List<THd> getAllTHd(){
		//获取数据库连接
				Connection conn = HdService.getConnect();
				
				//生成核心类
				QueryRunner runner = new QueryRunner();
				
				String sql1 = "select*from t_hd ";
		
				List<THd> users = new ArrayList<>();
				
				try {
					
					users = runner.query(conn, sql1,new BeanListHandler<THd>(THd.class));
					
					DbUtils.close(conn);

					}catch(SQLException e) {
						e.printStackTrace();
					}
				return hdList;
	}
	//改变活动状态
	public static void updateHdzt(int zt,int id) {
		String sql = "updata t_hd set "
	}
	//新增一项活动
	public static void newBmb(int hdid,int hyid, Date bmsj)throws SQLException{
		
	}

}

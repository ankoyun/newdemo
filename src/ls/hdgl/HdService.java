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

 //��ȡ���ݿ�����
	public static Connection getConnect() {
		//ע������
		try {
		Class.forName("com.db03.jdbc.Driver");
		//��������
		String url="JDBC:db03://localhost:3306/test?useUnicode=true&characterEncoding=UTF-8";
		
		Connection conn = DriverManager.getConnection(url,"ankyou","19991214");
		
		return conn;
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.print("δ���ӵ����ݿ�");
		}
		return null;
	}
	//��ȡ����ѧԺ�б�
	public static List<Yy> getAllYy(){
		//��ȡ���ݿ�����
				Connection conn = HdService.getConnect();
				
				//���ɺ�����
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
	//��ȡ�
	public static List<THd> getAllTHd(){
		//��ȡ���ݿ�����
				Connection conn = HdService.getConnect();
				
				//���ɺ�����
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
	//�ı�״̬
	public static void updateHdzt(int zt,int id) {
		String sql = "updata t_hd set "
	}
	//����һ��
	public static void newBmb(int hdid,int hyid, Date bmsj)throws SQLException{
		
	}

}

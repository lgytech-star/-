package asd.one;

import java.sql.Connection;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}
}
class Loginform{
	   UserDAO dao=new UserDAO();
	public void init()
	   {
		   System.out.println("此方法被执行了");
	   }
	   public void display()
	   {
		   System.out.println("此方法被执行了");
	   }
	   public void validate()
	   {
		   System.out.println("此方法被执行了");
	   }
}
class UserDAO{
	DBUtill db=new DBUtill();
	   public boolean findUser(String username,String userPassword)
	   {
		   return true;
	   }
}
class DBUtill{
	 public Connection getConnection()
	   {
		   System.out.println("此方法被执行了");
		return null;
	   }
}
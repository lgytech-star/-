package asd.one;

import java.sql.Connection;

public class Login {
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
   public Connection getConnection()
   {
	   System.out.println("此方法被执行了");
	return null;
   }
   public boolean findUser(String username,String userPassword)
   {
	   return true;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Login();
	}

}

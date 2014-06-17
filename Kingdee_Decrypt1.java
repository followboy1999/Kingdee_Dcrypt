//import com.kingdee.bos.sql.*;
public class Kingdee_Decrypt1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kingdee_Decryptor");
		if (args.length != 2)
		{
			System.out.println("Usage:Kingdee_Decryptor url password");
			return;
		} else
		{
//			KSqlUtil util = new KSqlUtil();	
			String url = com.kingdee.bos.sql.KSqlUtil.decodeUrl(args[0]);
			String password = com.kingdee.bos.sql.KSqlUtil.decodePassword(args[1]);
			System.out.println((new StringBuilder("URL is:")).append(url).toString());
			System.out.println((new StringBuilder("PASSWORD is:")).append(password).toString());
			return;
		}

	}

}

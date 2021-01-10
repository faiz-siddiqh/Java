package internetConnection;

import java.net.URL;



public class CheckInternetConnection {

	public static void main(String[] args) {
		try {
			URL u=new URL("https://www.google.com");
			
			java.net.URLConnection conn=u.openConnection();
			conn.connect();
			System.out.println("Internet connection established");
			
		}catch(Exception e){
			System.out.println("No Internet Available");
		}

	}

}

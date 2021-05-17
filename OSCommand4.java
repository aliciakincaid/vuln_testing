import java.util.*;
import java.util.Scanner;
import java.io.*;


public class OSCommand4{
		public static void OSCommand_main(){
			/* TEST 1*/
			System.out.println("Enter OS Command: ");
			
			// get os command from user
			Scanner obj = new Scanner(System.in);
			String command = obj.nextLine();
			
			
			try{
				Process p = Runtime.getRuntime().exec("cmd /c " + command);
				BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));		
				String s = null;
				while((s = stdInput.readLine()) != null){
					System.out.println(s);
				}
			}
			catch (Exception ex){
					ex.printStackTrace();
			}
			// Runtime.getRunTime().exec(command);
			
			
			/* TEST 2 */
			// String password2 = "heyyo1234"
			
			
			String password = "yoyo1234";
			
	}
}

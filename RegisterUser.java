import java.util.Scanner;

public class RegisterUser extends admin
{

	public static void main(String[] args) throws Exception 
	{
		
		System.out.println("\r\n" + 
				"░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗  ████████╗░█████╗░\r\n" + 
				"░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝  ╚══██╔══╝██╔══██╗\r\n" + 
				"░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░  ░░░██║░░░██║░░██║\r\n" + 
				"░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░  ░░░██║░░░██║░░██║\r\n" + 
				"░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗  ░░░██║░░░╚█████╔╝\r\n" + 
				"░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝  ░░░╚═╝░░░░╚════╝░\r\n" + 
				"\r\n" + 
				"░██████╗░███╗░░░███╗░█████╗░██████╗░████████╗\r\n" + 
				"██╔═══██╗████╗░████║██╔══██╗██╔══██╗╚══██╔══╝\r\n" + 
				"██║██╗██║██╔████╔██║███████║██████╔╝░░░██║░░░\r\n" + 
				"╚██████╔╝██║╚██╔╝██║██╔══██║██╔══██╗░░░██║░░░\r\n" + 
				"░╚═██╔═╝░██║░╚═╝░██║██║░░██║██║░░██║░░░██║░░░\r\n" + 
				"░░░╚═╝░░░╚═╝░░░░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝░░░╚═╝░░░"
				);
		System.out.println("                                                             - © 𝑫𝒆𝒔𝒊𝒈𝒏 𝒃𝒚 𝑮𝒓𝒐𝒖𝒑 𝑸  𝑮𝒂𝒖𝒓𝒂𝒗, 𝑵𝒊𝒌𝒆𝒔𝒉, 𝒀𝒐𝒈𝒊𝒕𝒂 & 𝑳𝒆𝒆𝒏𝒂.");
		// Main Class in Register user
		System.out.println("\n"+"-*-*-*-*-*-*-* WELCOME TO Q-MART ONLINE PURCHASE PORTAL *-*-*-*-*-*-*-*-*-*-"+"\n");
		System.out.println("Press 1. for Admin");
		System.out.println("Press 2. for Existing user");
		System.out.println("Press 3. for New user");
		System.out.flush();
		Scanner sc=new Scanner(System.in);
		admin ad=new admin();
		NewUser nu= new NewUser();
		ExistingUser eu=new ExistingUser();
		int ip=sc.nextInt();
		switch(ip) 
		{
		case 1:	
				System.out.println("\u000C");
				System.out.flush();
				ad.adminLog();
			    break;
		case 2: 
					System.out.println("");
				eu.userLog();
			    break;
		case 3: 
				System.out.println("");
				nu.newUserRegistration();
			    break;
		default:
				System.out.println("");
				System.out.println("Invalid Input...! Please select among the given options only");
		        break;
		
		}
		

	}

}
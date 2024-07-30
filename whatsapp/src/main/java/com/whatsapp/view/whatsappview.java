package com.whatsapp.view;
import java.util.Scanner;

import com.whatsapp.controller.whatsappController;
import com.whatsapp.controller.whatsappControllerInterface;

public class whatsappview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("****************MAIN MENU***************");
        
		System.out.println("Press 1 to create profile");
		System.out.println("Press 2 to view profile");

		System.out.println("Press 3 to delete profile");

		System.out.println("Press 4 to edit profile");

		System.out.println("Press 5 to search profile");

		System.out.println("Press 6 to view all profile");

		System.out.println("Press 7 to login profile");

		

		Scanner sc=new Scanner(System.in);

		

		System.out.println("Enter your choice: ");

		int c=sc.nextInt();
		whatsappControllerInterface wu=new whatsappController(); 

		

		switch(c)

		{

		case 1:

			wu.createProfileController();

			break;

		case 2:

			wu.viewProfileController();

			break;

		case 3:

			wu.deleteProfileController();

			break;

		case 4:

			wu.editProfileController();

			break;

		case 5:

			wu.searchprofileController();

			break;

		case 6:

			wu.viewallProfileController();

			break;

		case 7:

			wu.loginProfileController();

			break;

		}



	}
	
}



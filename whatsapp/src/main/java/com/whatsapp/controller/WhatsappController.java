package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.service.WhatsappService;
import com.whatsapp.service.WhatsappServiceInterface;

public class WhatsappController implements WhatsappControllerInterface {
	


	@Override
	public void createProfileController() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter password");
		String password=sc.next();

		System.out.println("Enter Email");
		String email=sc.next();
		
		System.out.println("Enter Address");
		String address=sc.next();
       
		WhatsappUser we=new WhatsappUser();
		we.setName(name);
		we.setPassword(password);
		we.setEmail(email);
		we.setAddress(address);
        WhatsappServiceInterface wi=new WhatsappService();
        int i=wi.createProfileService(we);
        
        if(i>0)
        {
        	System.out.println("Profile Created");
        }
        else {
        	System.out.println("Profile Rejected");

        }

		// TODO Auto-generated method stub

	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub

	}

}

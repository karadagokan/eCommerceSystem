package eCommerceSystem;

import eCommerceSystem.business.concretes.JoinManager;
import eCommerceSystem.core.concretes.ControlUserWithMyService;
import eCommerceSystem.core.concretes.JoinWithGoogleAdapter;
import eCommerceSystem.core.concretes.JoinWithMail;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		
		//JoinManager joinManager=new JoinManager(new ControlUserWithMyService(), new JoinWithGoogleAdapter());
		JoinManager joinManager=new JoinManager(new ControlUserWithMyService(), new JoinWithMail());
		
		User user=new User(0,"Okan","Karadað","okan.kar@gmail.com","123456");
		joinManager.register(user);
		joinManager.acceptLinkClick(user); //user parametresi koy
		joinManager.login("okan.kar@gmail.com","123456");
		System.out.println();
		
		User user2=new User(1,"Adnan","Karadað","adnan@gmail.com","1234562w2");
		joinManager.register(user2);
		System.out.println();
		
		User user3=new User(2,"Adem","Soylu","adnan@gmail.com","12ddfa3456");//Sistemde ayný e posta var kayýt etmez
		joinManager.register(user3);
		joinManager.login("adnan@gmail.com","12ddfa3456");
		System.out.println();
		
		User user4=new User(3,"Alev","Alevli","alev@.gmail.com","12ddfa3456");//Mail kuralýna uymuyor kayýt olamaz
		joinManager.register(user4);
			
	}	

}

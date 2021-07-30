package eCommerceSystem.core.concretes;

import eCommerceSystem.business.abstracts.JoinService;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleMail.GoogleMail;

public class JoinWithGoogleAdapter implements JoinService{

	GoogleMail googleMail=new GoogleMail();
	
	@Override
	public void login(String email,String password) {
		System.out.println("Google : Sisteme giriþ yaptýnýz. "+email);
	}

	@Override
	public void register(User user) {
		googleMail.registerWithGmail(user.getEmail(), user.getPassword());
	}

	@Override
	public void sendVerificationLink(String email) {
		
	}

	@Override
	public void acceptLinkClick(User user) {
		
	}

}

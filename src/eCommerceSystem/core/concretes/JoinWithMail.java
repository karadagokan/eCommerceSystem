package eCommerceSystem.core.concretes;

import eCommerceSystem.business.abstracts.JoinService;
import eCommerceSystem.entities.concretes.User;

public class JoinWithMail implements JoinService {

	@Override
	public void login(String email,String password) {
		System.out.println("Sisteme giri� yapt�n�z. "+email);
	}

	@Override
	public void register(User user) {
		System.out.println("Sisteme ba�ar�l� bir �ekilde kay�t oldunuz");
	}

	@Override
	public void sendVerificationLink(String email) {
		System.out
				.println(email + " adresine do�rulama kodu g�nderildi. Kay�d� tamamlamak i�in onaylaman�z gerekmekte.");
	}

	@Override
	public void acceptLinkClick(User user) {
		System.out.println(user.getFirstName()+" Hesab�n�z onayland�. �imdi anasayfaya y�nlendiriliyorsunuz...");
	}

}

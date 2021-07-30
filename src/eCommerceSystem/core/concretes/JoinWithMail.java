package eCommerceSystem.core.concretes;

import eCommerceSystem.business.abstracts.JoinService;
import eCommerceSystem.entities.concretes.User;

public class JoinWithMail implements JoinService {

	@Override
	public void login(String email,String password) {
		System.out.println("Sisteme giriþ yaptýnýz. "+email);
	}

	@Override
	public void register(User user) {
		System.out.println("Sisteme baþarýlý bir þekilde kayýt oldunuz");
	}

	@Override
	public void sendVerificationLink(String email) {
		System.out
				.println(email + " adresine doðrulama kodu gönderildi. Kayýdý tamamlamak için onaylamanýz gerekmekte.");
	}

	@Override
	public void acceptLinkClick(User user) {
		System.out.println(user.getFirstName()+" Hesabýnýz onaylandý. Þimdi anasayfaya yönlendiriliyorsunuz...");
	}

}

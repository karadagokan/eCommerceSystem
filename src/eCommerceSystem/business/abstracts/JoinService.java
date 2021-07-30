package eCommerceSystem.business.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface JoinService {

	void login(String email,String password);
	void register(User user);
	void sendVerificationLink(String email);
	void acceptLinkClick(User User);
	
}

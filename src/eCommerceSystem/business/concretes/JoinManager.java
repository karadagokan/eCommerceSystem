package eCommerceSystem.business.concretes;

import java.util.HashMap;

import eCommerceSystem.business.abstracts.JoinService;
import eCommerceSystem.core.abstracts.CheckValidationService;
import eCommerceSystem.core.concretes.CheckMailAddressUsable;
import eCommerceSystem.entities.concretes.User;

public class JoinManager implements JoinService {

	CheckValidationService checkValidationService;
	JoinService joinService;

	HashMap<String, String> mailList = new HashMap<String, String>();

	public JoinManager(CheckValidationService checkValidationService, JoinService joinService) {
		this.checkValidationService = checkValidationService;
		this.joinService = joinService;
	}

	@Override
	public void login(String email, String password) {
		if (!mailList.isEmpty()) {
			if (mailList.get(email).equalsIgnoreCase(password)) {
				this.joinService.login(email, password);
			} else {
				System.out.println("Giriþ yapamadýnýz lütfen giriþ bilgilerinizi kontrol ediniz.");
			}
		}
	}

	@Override
	public void register(User user) {
		if (CheckMailAddressUsable.checkMailUsable(user.getEmail(), mailList)) {
			if (this.checkValidationService.ifCorrectUserControl(user)) {
				System.out.println("Sisteme baþarýlý bir þekilde kayýt oldunuz Sayýn " + user.getFirstName());
				mailList.put(user.getEmail(), user.getPassword());
				sendVerificationLink(user.getEmail());
			}
		}
	}

	@Override
	public void sendVerificationLink(String email) {
		this.joinService.sendVerificationLink(email);
	}

	@Override
	public void acceptLinkClick(User user) {
		this.joinService.acceptLinkClick(user);

	}

}

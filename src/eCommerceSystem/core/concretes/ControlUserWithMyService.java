package eCommerceSystem.core.concretes;

import eCommerceSystem.core.abstracts.CheckValidationService;
import eCommerceSystem.entities.concretes.User;

public class ControlUserWithMyService implements CheckValidationService {

	@Override
	public boolean ifCorrectUserControl(User user) {
		if (user.getPassword().length() >= 6 && CheckRegexMail.controlMail(user.getEmail())
				&& user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}
		System.out.println("Giriþ bilgilerinizi lütfen kontrol edin.");
		return false;
	}

}

package eCommerceSystem.core.abstracts;

import eCommerceSystem.entities.concretes.User;

public interface CheckValidationService {

	boolean ifCorrectUserControl(User user);

}

package eCommerceSystem.core.concretes;

import java.util.HashMap;

public class CheckMailAddressUsable {

	public static boolean checkMailUsable(String mail, HashMap<String, String> mailList) {
		if (!mailList.containsKey(mail)) {
			return true;
		}
		System.out.println("Bu mail adresi zaten sisteme kayýtlý. " + mail);
		return false;
	}

}

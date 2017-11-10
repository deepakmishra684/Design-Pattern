package com.deepak.objectCreationalPattern;

/**
 * @author deepak
 *
 */

interface MobilePhone {
	public String mobileBrand();
}

class Nokia implements MobilePhone {
	@Override
	public String mobileBrand() {

		return "Nokia";
	}

}

class Sumsung implements MobilePhone {

	@Override
	public String mobileBrand() {
		return "Sumsung";
	}
}

class MobilePhoneFactory {// Factory method pattern implementation that
							// instantiates objects based on logic.
	public MobilePhone getMobilePhone(String brandType) {
		MobilePhone phone = null;
		if ("Nokia".equals(brandType))
			phone = new Nokia();
		else if ("Sumsung".equals(brandType))
			phone = new Sumsung();
		return phone;

	}
}

public class FactoryDesignPattern {
	public static void main(String[] args) {
		MobilePhoneFactory mobileFactory = new MobilePhoneFactory();
		MobilePhone mobilePhone = mobileFactory.getMobilePhone("Nokia");
		System.out.println(mobilePhone.toString());
	}

}

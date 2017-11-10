package com.deepak.objectCreationalPattern;

/**
 * @author deepak
 *
 */

interface Mobile {
	public void mobileBrand();
}

interface MobileFactory {
	public Mobile createMobile();
}

class Nokia1 implements MobileFactory {

	@Override
	public Mobile createMobile() {

		return new NokiaAndroid();
	}

}

class Sumsung1 implements MobileFactory {

	@Override
	public Mobile createMobile() {

		return new SumsungAndroid();
	}
}

class NokiaAndroid implements Mobile {

	@Override
	public void mobileBrand() {
		System.out.println("I am Nokia brand with model NokiaAndroid");

	}
}

class SumsungAndroid implements Mobile {

	@Override
	public void mobileBrand() {
		System.out.println("I am Sumsung brand with model SumsungAndroid");

	}

}

class MobileType {
	public MobileType(MobileFactory factory) {
		Mobile mobile = factory.createMobile();
		mobile.mobileBrand();
	}

}

public class AbstractFactoryDesignPattern {
	public static void main(String[] args) {
		new MobileType(createMobileFactory("Sumsung"));
	}

	public static MobileFactory createMobileFactory(String type) {
		if ("Sumsung".equals(type))
			return new Sumsung1();
		else
			return new Nokia1();
	}
}

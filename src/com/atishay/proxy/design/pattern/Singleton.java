package com.atishay.proxy.design.pattern;

enum SingletonEnum {
	INSTANCE;
	private Singleton singleton;

	public Singleton getSingleton() {
		return singleton;
	}

	void setSingleton(Singleton singleton) {
		this.singleton = singleton;
	}

}

public class Singleton {

	static {
		SingletonEnum.INSTANCE.setSingleton(new Singleton());
	}

	// private constructor, no one can initialize the class.
	private Singleton() {

	}

	public static Singleton getSingleton() {
		return SingletonEnum.INSTANCE.getSingleton();
	}
}

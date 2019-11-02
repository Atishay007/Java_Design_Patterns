package com.atishay.proxy.design.pattern;

public class SingletonUse {
	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());
	}
}

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

// no one can extend this class.
final class Singleton {

	static {
		SingletonEnum.INSTANCE.setSingleton(new Singleton());
	}

	// private constructor, no one can initialize the class from outside.
	private Singleton() {
	}

	public static Singleton getSingleton() {
		return SingletonEnum.INSTANCE.getSingleton();
	}
}

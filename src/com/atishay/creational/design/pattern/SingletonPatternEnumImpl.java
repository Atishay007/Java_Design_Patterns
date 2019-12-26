package com.atishay.creational.design.pattern;

//This pattern is thread safe as we have used Enum.
// But if we want some parameter Singleton Pattern,
// then we can't use Singleton as Enum Singleton pattern
//as can't have parameter.
public class SingletonPatternEnumImpl {
	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());
		System.out.println(Singleton.getSingleton());
	}
}

enum SingletonEnum {
	INSTANCE;

	private SingletonEnum() {
	}

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

	// private constructor, no one can create object of this class.
	private Singleton() {
	}

	public static Singleton getSingleton() {
		return SingletonEnum.INSTANCE.getSingleton();
	}
}

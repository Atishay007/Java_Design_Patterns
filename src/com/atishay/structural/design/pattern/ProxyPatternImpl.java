package com.atishay.structural.design.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Proxy Pattern is a Structural Pattern. Structural patterns provide different
 * ways to create a class structure. ProxyPattern comes in between and handle
 * some operations or perform some actions.
 *
 */
public class ProxyPatternImpl {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("zzz.com");
	}
}

interface Internet {
	public void connectTo(String serverHost);
}

class ProxyInternet implements Internet {

	static List<String> bannedSites = new ArrayList<>();

	static {
		bannedSites.add("apac.com");
		bannedSites.add("zexx.com");
		bannedSites.add("zzz.com");
	}

	@Override
	public void connectTo(String serverHost) {
		if (bannedSites.contains(serverHost)) {
			System.out.println("Cnnection Terminated");
		} else {
			Internet realInternet = new RealInternet();
			realInternet.connectTo(serverHost);
		}
	}
}

class RealInternet implements Internet {
	@Override
	public void connectTo(String serverHost) {
		System.out.println("Connecting to: " + serverHost);
	}
}

package com.atishay.proxy.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

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

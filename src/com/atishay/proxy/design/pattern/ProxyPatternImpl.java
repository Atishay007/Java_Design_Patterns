package com.atishay.proxy.design.pattern;

/**
 * ProxyPattern comes in between and handle some operations or perform some
 * actions.
 *
 */
public class ProxyPatternImpl {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		internet.connectTo("zzz.com");
	}
}

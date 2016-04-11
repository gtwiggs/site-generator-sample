package com.glenntwiggs.hello;

/**
 * Goodbye class doc.
 */
public class Goodbye {
	/**
	 * Say goodbye when you call me, best to call me after {@link Hello#method()}
	 */
	public void method() {
		System.out.println("Goodbye");
	}

	/**
	 * Private method!
	 */
	private void privateMethod() {
		System.out.println("A private goodbye");
	}
	
	/**
	 * Default scope method!
	 */
	void defaultScopeMethod() {
		System.out.println("A not-quite-private goodbye");
	}
	
}
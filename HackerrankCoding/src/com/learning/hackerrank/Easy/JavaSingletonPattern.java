/**
 * 
 */
package com.learning.hackerrank.Easy;

/**
 * @author upendra
 *
 */
public class JavaSingletonPattern {
	private JavaSingletonPattern() {
	}
	public String	str;
	private static final JavaSingletonPattern instance = new JavaSingletonPattern();
	public static JavaSingletonPattern getSingleInstance() {
		return instance;
	}
}

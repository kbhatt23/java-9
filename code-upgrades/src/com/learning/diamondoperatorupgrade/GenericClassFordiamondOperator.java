package com.learning.diamondoperatorupgrade;

public class GenericClassFordiamondOperator<T> {

	private T t;
	
	public GenericClassFordiamondOperator(T t) {
		this.t = t;
	}
	
	public void method1() {
		System.out.println("jai shree ram says "+t);
	}
	
	public T getT() {
		return t;
	}
}

package com.example.coppia;

public class CoppiaP <T> {
	private T primo;
	private T secondo;
	
	public CoppiaP() {
		
	}
	
	public CoppiaP(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public T getPrimo() {
		return this.primo;
	}
	
	public T getSecondo() {
		return this.secondo;
	}
	
	public void setPrimo(T primo) {
		this.primo = primo;
	}
	
	public void setSecondo(T secondo) {
		this.secondo = secondo;
	}
}

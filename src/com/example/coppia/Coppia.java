package com.example.coppia;

public class Coppia {
	private Object primo;
	private Object secondo;
	
	public Coppia() {
		
	}
	
	public Coppia (Object primo, Object secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public Object getPrimo() {
		return this.primo;
	}
	
	public Object getSecondo() {
		return this.secondo;
	}
	
	public void setPrimo(Object primo) {
		this.primo = primo;
	}
	
	public void setSecondo(Object secondo) {
		this.secondo = secondo;
	}
}

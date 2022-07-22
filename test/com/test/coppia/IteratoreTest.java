package com.test.coppia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class IteratoreTest {
	private List<String> vuota;
	private List<String> singoletto;
	private String solitario;

	@Before
	public void setUp() throws Exception {
		this.vuota = new ArrayList<String>();
		this.singoletto = new ArrayList<String>();
		this.solitario = new String("solitario");
		this.singoletto.add(solitario); 
	}

	@Test
	public void testHasNext_ListaVuota() {
		Iterator<String>  it = this.vuota.iterator();
		assertNotNull(it);
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testHasNext_PrimaSiPoiNoSuSingoletto() {       
		Iterator<String> it = this.singoletto.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		it.next();
		assertFalse(it.hasNext());
	}
	
	@Test
	public void testNext_singoletto() {
		Iterator<String> it = this.singoletto.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		assertSame(this.solitario, it.next());
	}
	
	@Test
	public void testNext_suListaDiDueElementi() {
		List<String> doppietta = new ArrayList<>();
		doppietta.add(new String("primo"));
		doppietta.add(new String("secondo"));
		Iterator<String> it = doppietta.iterator();
		assertNotNull(it);
		assertTrue(it.hasNext());
		assertEquals("primo",it.next());
		assertTrue(it.hasNext());
		assertEquals("secondo",it.next());
		assertFalse(it.hasNext());
	}

}

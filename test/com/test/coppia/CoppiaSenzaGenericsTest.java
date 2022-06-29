package com.test.coppia;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.coppia.Coppia;
import com.example.persona.Persona;

public class CoppiaSenzaGenericsTest {

	@Test
	public void testCheCompilaEdEsegue() {
		Coppia coppia = new Coppia();
		String pippo = new String("pippo");
		String pluto = new String("pluto");
		Persona p1 = new Persona(pippo);
		coppia.setPrimo(p1);
		Persona p2 = new Persona(pluto);
		coppia.setSecondo(p2);
		Persona persona = (Persona)coppia.getPrimo();  //downcast da Object a Persona per poter utilizzare i metodi del primo oggetto persona
		assertSame(pippo,persona.getNome()); // verifica che abbiano lo stesso riferimento
	}
	
	@Test
	public void testCheNonCompila() {
		Coppia coppia = new Coppia();
		String pippo = new String("pippo");
		String pluto = new String("pluto");
		Persona p1 = new Persona(pippo);
		coppia.setPrimo(p1);
		Persona p2 = new Persona(pluto);
		coppia.setSecondo(p2);
		assertSame(pippo,coppia.getPrimo().getNome());  //visto che il tipo statico è object chiaramente non possiamo utilizzare il metodo getNome()		
	}
	
	@Test
	public void testCheCompilaMaNonEsegue() {
		Coppia coppia = new Coppia();
		String pippo = new String("pippo");
		String pluto = new String("pluto");
		Persona p1 = new Persona(pippo);
		coppia.setPrimo(pippo);                 //guardate cosa è stato messo qui come primo oggetto 
		Persona p2 = new Persona(pluto);
		coppia.setSecondo(p2);
		assertSame(pippo,((Persona)coppia.getPrimo()).getNome());  //classCastException a tempo di esecuzione, dovuto al fatto che stiamo castando una Stringa in Persona
	}

}

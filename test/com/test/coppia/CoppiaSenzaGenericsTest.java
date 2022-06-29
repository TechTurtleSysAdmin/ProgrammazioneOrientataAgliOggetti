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
		Persona persona = (Persona)coppia.getPrimo();  //downcast da Object a Persona per poter utilizzare i metodi di persona del primo oggetto persona
		assertSame(pippo,persona.getNome()); // verifica che abbiano lo stesso riferimento
	}

}

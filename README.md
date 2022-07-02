# ProgrammazioneOrientataAgliOggetti
<!--- GENERICS --->
# **GENERICS**
* Cosa sono i generics? :question:
	* Sono uno strumento per scrivere classi e metodi parametriche rispetto a un tipo. :white_check_mark:
* Costruire una classe coppia che deve offrire dei metodi per gestire una coppia di oggetti del medesimo tipo:   :wrench:
	* Metodi per poter ottenere/cambiare il primo/secondo elemento della coppia.
	* Un costruttore che riceve come parametri due riferimenti ad oggetti del medesimo tipo.
		* Guardare in [coppia](https://github.com/FabioR1995/ProgrammazioneOrientataAgliOggetti/blob/main/src/com/example/coppia/Coppia.java) per vedere come è stata realizzata la classe coppia :white_check_mark:	
* Leggere e comprendere i test che sono stati per la classe coppia [coppiaSenzaGenericsTest](https://github.com/FabioR1995/ProgrammazioneOrientataAgliOggetti/blob/main/test/com/test/coppia/CoppiaSenzaGenericsTest.java) :books: :eyes:
* Abbiamo veramente realizzato una classe coppia che permette di gestire coppie di oggetti del medesimo tipo? :question: [coppia](https://github.com/FabioR1995/ProgrammazioneOrientataAgliOggetti/blob/main/src/com/example/coppia/Coppia.java) :eyes:
	* Come risultato abbiamo ottenuto una classe che accetta una coppia di oggetti che **non** devono essere necessariamente dello stesso tipo. :white_check_mark:
* Come si definisce una classe generica? :question:
	* ```public class Coppia<T>{...}``` :white_check_mark:
* Cosa indica il simbolo T all' interno della definizione della classe Coppia?  :question:
	* Il tipo sulla base del quale la definizione di classe è parametrica. :white_check_mark:
* Refactor della classe Coppia resa parametrizzata. [CoppiaP](https://github.com/FabioR1995/ProgrammazioneOrientataAgliOggetti/blob/main/src/com/example/coppia/CoppiaP.java) :books: :eyes:
* Quando andiamo ad istanziare una classe generica, dobbiamo dobbiamo sostituire il tipo formale con il tipo attuale, dove il tipo attuale, andrà a sostituire tutti i tipi formali. Creare un metodo testCoppiaDiPersone che istanzi la classe coppiaP e che al posto del parametro formale T abbia come parametro attuale la classe persona e verificare se i riferimenti a due oggetti persona siano i medesimi. :wrench: 
	* Soluzione: [testCoppiaDiPersone](https://github.com/FabioR1995/ProgrammazioneOrientataAgliOggetti/blob/main/test/com/test/coppia/CoppiaGenericsTest.java) :white_check_mark:
* Precedentemente ci siamo chiesti se eravamo riusciti a realizzare una classe coppia che ci permettesse di gestire oggetti dello stesso tipo. Con i generics ci siamo riusciti? Se la risposta è si, implementate un test in cui abbiamo due oggetti string e due oggetti persona, ed istanziate una classe coppiaP con tipo attuale persona settando come primo oggetto la stringa.
	* Chiaramente il codice non compila, perchè stiamo mettendo una stringa quando invece ci viene richiesta una persona nel metodo set [testCheSmetteDiCompilare](https://github.com/FabioR1995/ProgrammazioneOrientataAgliOggetti/blob/main/test/com/test/coppia/CoppiaGenericsTest.java).

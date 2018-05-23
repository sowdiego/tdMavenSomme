package sn.eacy.jee.testCalcul;

import sn.eacy.jee.calcul.Calcul;

public class CalculTest {
	
	 Calcul c = new Calcul();
    int somme = c.somme(10, 4);
    int testSomme = 14;
    
    public void testSomme() {
    	System.out.println(somme=testSomme);
    }
    

}

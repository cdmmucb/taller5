import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;

import org.junit.rules.ExpectedException;

import org.junit.Test;

import org.junit.Before;



public class LiftTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void liftComienzaPrimerPiso() throws Exception{
        Lift lift = new Lift();
        assertEquals(1,lift.piso);
    }

    @Test
    public void pisoInicialDentroDeLimites() throws Exception{
        Person person = new Person();
        System.out.println("piso inicial: "+person.pisoInicial);
        assertTrue("Error, el piso mayor debe es 3", person.pisoInicial <= 3);
        assertTrue("Error, el piso menor debe es 1",  person.pisoInicial >= 1);
    }

    @Test
    public void pisoFinalDentroDeLimites() throws Exception{
        Person person = new Person();
        System.out.println("piso final: "+person.pisoFinal);
        assertTrue("Error, el piso mayor debe es 3", person.pisoFinal <= 3);
        assertTrue("Error, el piso menor debe es 1",  person.pisoFinal >= 1);
    }

    @Test
    public void pisoFinalNoIgualInicial() throws Exception{
        Person person = new Person();
        System.out.println("piso inicial: "+person.pisoInicial);
        System.out.println("piso final: "+person.pisoFinal);
        assertNotEquals(person.pisoFinal, person.pisoInicial);
    }

    @Test
    public void crearPersona() throws Exception{
        Person person = new Person();
        System.out.println("piso inicial: "+person.pisoInicial);
        System.out.println("piso final: "+person.pisoFinal);
        assertTrue("Error, el piso mayor debe es 3", person.pisoInicial <= 3);
        assertTrue("Error, el piso menor debe es 1",  person.pisoInicial >= 1);

        assertNotEquals(person.pisoFinal, person.pisoInicial);
    }

    @Test
    public void liftVaAPersona() throws Exception{
        Lift lift = new Lift();
        Person person = new Person();
        System.out.println("piso inicial persona: "+person.pisoInicial);
        lift.goPerson(person.pisoInicial);
        assertEquals(person.pisoInicial, lift.piso);
    }

    @Test
    public void personaEnLiftVaAPisoDestino() throws Exception{
        Lift lift = new Lift();
        Person person = new Person();
        System.out.println("piso inicial persona: "+person.pisoInicial);
        System.out.println("piso destino persona: "+person.pisoFinal);
        lift.goPerson(person.pisoInicial);
        lift.goPisoDestino(person.pisoFinal);
        assertEquals(person.pisoFinal, lift.piso);
    }
}

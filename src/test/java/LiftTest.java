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
    public void crearPersona() throws Exception{
        Person person = new Person();
        assertEquals(person,new Person());
    }

}

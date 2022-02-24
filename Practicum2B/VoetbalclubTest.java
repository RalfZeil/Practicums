package Practicum2B;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach; 

class VoetbalclubTest {

    Voetbalclub aj;
    
    @BeforeEach
    public void init(){
        aj = new Voetbalclub("");
    }

    @Test 
    public void geenNaamWordFC() { 
        //Checken of met geen input de naam FC word
        assertEquals("FC 0 0 0 0 0", aj.toString()); 
    } 

    @Test
    public void testGewonnen(){
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('w');
        assertEquals(3, aj.aantalPunten());
    }

    @Test
    public void testGelijk(){
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('g');
        assertEquals(1, aj.aantalPunten());
    }

    @Test
    public void testVerloren(){
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('v');
        assertEquals(0, aj.aantalPunten());
    }

    @Test
    public void testSlechteInput(){
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('h');
        assertEquals(0, aj.aantalPunten());
    }

    @Test
    public void meerdereRondesOptellen(){
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('w');
        aj.verwerkResultaat('g');
        aj.verwerkResultaat('v');
        assertEquals(4, aj.aantalPunten());
    }

    @Test
    public void aantalGespeeldTesten(){
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('w');
        aj.verwerkResultaat('g');
        aj.verwerkResultaat('v');
        assertEquals(3, aj.aantalGespeeld());
    }

    @Test
    public void toStringTesten(){
        Voetbalclub aj = new Voetbalclub("Ajax");
        aj.verwerkResultaat('w');
        aj.verwerkResultaat('g');
        aj.verwerkResultaat('v');
        assertEquals("Ajax 3 1 1 1 4", aj.toString()); 
    }
} 
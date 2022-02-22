package Practicum2B;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

class VoetbalclubTest {
    @Test 
    public void checkPuntenVoorVoetbalclub() { 
        //Checken of met geen input de naam FC word
        Voetbalclub aj = new Voetbalclub("");
        assertEquals("FC 0 0 0 0 0", aj.toString()); 

        aj.verwerkResultaat('w');
        aj.verwerkResultaat('w');
        aj.verwerkResultaat('g');
        assertEquals(7, aj.aantalPunten());
    } 
} 
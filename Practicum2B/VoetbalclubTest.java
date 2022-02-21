package Practicum2B;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

class VoetbalclubTest {
    @Test 
    public void checkPuntenVoorVoetbalclub() { 
        Voetbalclub aj = new Voetbalclub("");
        aj.verwerkResultaat('w');
        assertEquals(3, aj.aantalPunten()); 
    } 
} 
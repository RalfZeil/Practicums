package Practicum4B;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

class AutoHuurTest {

    @Test 
    public void TestAutoHuurEnKorting() { 
        //Checken of met geen input de naam FC word
        Klant k1 = new Klant("John Doe");
        Klant k2 = new Klant("Jane Doe");
        k2.setKorting(50.0);

        Auto a1 = new Auto("Audi", 50.0);
        a1.setPrijsPerDag(300.0);

        AutoHuur ah1 = new AutoHuur();
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(100);

        AutoHuur ah2 = new AutoHuur();
        ah2.setHuurder(k2);
        ah2.setGehuurdeAuto(a1);
        ah2.setAantalDagen(100);


        assertEquals(30000, ah1.totaalPrijs());
        assertEquals(15000, ah2.totaalPrijs());
    } 

    @Test
    public void TestNullInAutoHuur(){
        AutoHuur ah1 = new AutoHuur();

        assertEquals(0.0, ah1.totaalPrijs());
        assertEquals("er is geen auto bekend"+ "\n" + "er is geen huurder bekend" + "\n" + "aantal dagen: 0 en dat kost: 0.0", ah1.toString());
    }
} 
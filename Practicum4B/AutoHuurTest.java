package Practicum4B;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

class AutoHuurTest {

    @Test 
    public void KlantZonderKortingTest() { 
        Klant k1 = new Klant("John Doe");

        Auto a1 = new Auto("Audi", 300.0);

        AutoHuur ah1 = new AutoHuur();
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(100);

        assertEquals(30000, ah1.totaalPrijs());
    } 

    @Test 
    public void KlantMetKortingTest() { 
        Klant k1 = new Klant("John Doe");
        k1.setKorting(50.0);

        Auto a1 = new Auto("Audi", 300.0);

        AutoHuur ah1 = new AutoHuur();
        ah1.setHuurder(k1);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(100);

        assertEquals(15000, ah1.totaalPrijs());
    } 

    @Test
    public void TestToStingNullInAutoEnHuurder(){
        AutoHuur ah1 = new AutoHuur();

        assertEquals(0.0, ah1.totaalPrijs());
        assertEquals("er is geen auto bekend"+ "\n" + "er is geen huurder bekend" + "\n" + "aantal dagen: 0 en dat kost: 0.0", ah1.toString());
    }

    @Test
    public void TestToStringNullInAuto(){
        
        Klant k1 = new Klant("John Doe");
        AutoHuur ah1 = new AutoHuur();
        ah1.setHuurder(k1);

        assertEquals(0.0, ah1.totaalPrijs());
        assertEquals("er is geen auto bekend"+ "\n" + "op naam van: John Doe (korting: 0.0%)" + "\n" + "aantal dagen: 0 en dat kost: 0.0", ah1.toString());
    }

    @Test
    public void TestToStringNullInHuurder(){
        
        Auto a1 = new Auto("Audi A4", 50.0);
        AutoHuur ah1 = new AutoHuur();
        ah1.setGehuurdeAuto(a1);

        assertEquals(0.0, ah1.totaalPrijs());
        assertEquals("auto type: Audi A4 met prijs per dag: 50.0"+ "\n" + "er is geen huurder bekend" + "\n" + "aantal dagen: 0 en dat kost: 0.0", ah1.toString());
    }

    @Test
    public void TestToStringGeenNull(){
        
        Auto a1 = new Auto("Audi A4", 50.0);
        Klant k1 = new Klant("John Doe");
        AutoHuur ah1 = new AutoHuur();
        ah1.setGehuurdeAuto(a1);
        ah1.setHuurder(k1);

        assertEquals(0.0, ah1.totaalPrijs());
        assertEquals("auto type: Audi A4 met prijs per dag: 50.0"+ "\n" + "op naam van: John Doe (korting: 0.0%)" + "\n" + "aantal dagen: 0 en dat kost: 0.0", ah1.toString());
    }

} 
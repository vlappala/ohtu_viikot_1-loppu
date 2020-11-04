/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author T460
 */
public class StatisticsTest {
    
        Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
            }
        };
        
    Statistics stats;
    
    public StatisticsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        stats = new Statistics(readerStub);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void konstruktoriLuoStatistiikan() {
        assertNotNull(stats);
    }
    
    @Test
    public void hakuPalauttaaPelaajan() {
        assertNotNull(stats.search("Kurri"));
    }
    
    @Test
    public void hakuPalauttaaNullinKunPelaajaaEiLoydy() {
        assertNull(stats.search("Jutila"));
    }
    
    @Test
    public void hakuPalauttaaJoukkueenPelaajat() {
        assertNotNull(stats.team("EDM"));
    }
    
    @Test
    public void hakuPalauttaaPisteporssinTop3() {
        
        boolean b = false;
        
        List<Player> top3 = stats.topScorers(3);
        
        for (Player p : top3) {
            if (p.getName().contains("Gretzky")) b = true;
        }
        
        
        assertTrue(b);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

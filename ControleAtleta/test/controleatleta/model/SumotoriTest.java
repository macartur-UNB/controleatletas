package controleatleta.model;

import Util.CategoriaSumotori;
import controleatleta.model.Premiacao;
import controleatleta.model.Sumotori;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
public class SumotoriTest {    
    @Test
    public void testarConstrutor() {
         Sumotori sumotori = new Sumotori("Lutador1");
        String nomeLutador = "Lutador1";
        assertEquals(nomeLutador,sumotori.getNome());
    }
    @Test
    public void testarSetCategoria(){
        Sumotori sumotori = new Sumotori("Lutador1");
        sumotori.setCategoria(CategoriaSumotori.JURYOU);
        assertEquals(CategoriaSumotori.JURYOU, sumotori.getCategoria());
    }
    
   
    @Test
    public void testarSetSalario(){
        Sumotori sumotori = new Sumotori("Lutador1");
        sumotori.setSalario(2000.25f);
        assertEquals(2000.25f, sumotori.getSalario(), 0);
    }
    @Test
    public void testarSetTotalDerrotas(){
        Sumotori sumotori = new Sumotori("Lutador1");
        sumotori.setTotalDerrotas(3);
        assertEquals(3, sumotori.getTotalDerrotas());
    }
    
    @Test
    public void testarSetTotalDesistencias(){
        Sumotori sumotori = new Sumotori("Lutador1");
        sumotori.setTotalDesistencias(1);
        assertEquals(1, sumotori.getTotalDesistencias());
    }
    
    @Test
    public void testarSetTotalLutas(){
        Sumotori sumotori = new Sumotori("Lutador1");
        sumotori.setTotalLutas(25);
        assertEquals(25, sumotori.getTotalLutas());
    }
    @Test
    public void testarSetTotalVitorias(){
        Sumotori sumotori = new Sumotori("Lutador1");
        sumotori.setTotalVitorias(50);
        assertEquals(50, sumotori.getTotalVitorias());
    }
    
    @Test
    public void testarSetPremiacao(){
        Sumotori sumotori = new Sumotori("Lutador1");
        
        ArrayList<Premiacao> premiacoes = new ArrayList();
        Premiacao premiacao1 = new Premiacao("Campeonato Mundial", 2011);
        Premiacao premiacao2 = new Premiacao("Campeonato InterEstadual", 2005);
        Premiacao premiacao3 = new Premiacao("Campeonato Municipal", 2000);
        Premiacao premiacao4 = new Premiacao("Campeonato Estadual", 1990);
       
        premiacoes.add(premiacao1);
        premiacoes.add(premiacao2);
        premiacoes.add(premiacao3);
        premiacoes.add(premiacao4);
        
        sumotori.setPremiacoes(premiacoes);
        
        assertEquals(premiacoes,sumotori.getPremiacoes());
        
        
    }
}
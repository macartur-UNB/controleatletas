package controleatleta.control;

import controleatleta.model.Sumotori;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControleSumotoriTest {
    
    @Test
    public void testarAdicionarSumotori() {
        Sumotori sumotori1 = new Sumotori("NomeLutador1");
        Sumotori sumotori2 = new Sumotori("NomeLutador2");
        Sumotori sumotori3 = new Sumotori("NomeLutador3");
        
        ArrayList<Sumotori> arrayListEsperado = new ArrayList<Sumotori>();
        arrayListEsperado.add(sumotori1);
        arrayListEsperado.add(sumotori2);
        arrayListEsperado.add(sumotori3);
        
        ControleSumotori controleSumotori = new ControleSumotori();
        controleSumotori.adicionar(sumotori1);
        controleSumotori.adicionar(sumotori2);
        controleSumotori.adicionar(sumotori3);
        
        assertEquals(arrayListEsperado, controleSumotori.getListaSumotori());        
    }
    
    @Test
    public void testarRemoverSumotori(){
        Sumotori sumotori1 = new Sumotori("NomeLutador1");
        Sumotori sumotori2 = new Sumotori("NomeLutador2");
        Sumotori sumotori3 = new Sumotori("NomeLutador3");
        
        ArrayList<Sumotori> arrayListEsperado = new ArrayList<Sumotori>();
        arrayListEsperado.add(sumotori1);
        arrayListEsperado.add(sumotori3);
        
        
        ControleSumotori controleSumotori = new ControleSumotori();
        controleSumotori.adicionar(sumotori1);
        controleSumotori.adicionar(sumotori2);
        controleSumotori.adicionar(sumotori3);
        
        controleSumotori.remover(sumotori2);
        
        assertEquals(arrayListEsperado, controleSumotori.getListaSumotori());
    }
    
    @Test
    public void testarPesquisar(){
        Sumotori sumotori1 = new Sumotori("NomeLutador1");
        Sumotori sumotori2 = new Sumotori("NomeLutador2");
        Sumotori sumotori3 = new Sumotori("NomeLutador3");
    
        ControleSumotori controleSumotori = new ControleSumotori();
        
        controleSumotori.adicionar(sumotori1);
        controleSumotori.adicionar(sumotori2);
        controleSumotori.adicionar(sumotori3);
        
        Sumotori resultadoPesquisa = controleSumotori.pesquisar("NomeLutador1");
        
        assertEquals(sumotori1, resultadoPesquisa);
    }
    
    
    
}
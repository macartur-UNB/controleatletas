package controleatleta.control;

import controleatleta.model.Sumotori;
import java.util.ArrayList;

public class ControleSumotori {

    private ArrayList<Sumotori> listaSumotori;

    public ControleSumotori() {
        this.listaSumotori = new ArrayList<Sumotori>();
    }
    public ArrayList<Sumotori> getListaSumotori(){
        return this.listaSumotori;
    }
    
    public void adicionar(Sumotori sumotori){
        listaSumotori.add(sumotori);
    }
    
    public void remover(Sumotori sumotori){
        listaSumotori.remove(sumotori);
    }
    
    public Sumotori pesquisar(String nome){
        for(Sumotori sumotori:listaSumotori){
            if(sumotori.getNome().equalsIgnoreCase(nome))
                     return sumotori;
        }
        return null;
    }
}

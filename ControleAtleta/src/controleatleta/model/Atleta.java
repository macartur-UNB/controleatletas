package controleatleta.model;

import java.util.ArrayList;

public class Atleta extends Pessoa {
    
    ArrayList <String> telefones;
    private Endereco endereco;
    
    public Atleta(String nome) {
        super(nome);
        this.endereco = new Endereco();
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<String> telefones) {
        this.telefones = telefones;
    }
    
}
package controleatleta;

import java.util.ArrayList;

public class Sumotori extends Atleta {
    //caracteristicas
    private String categoria;//mador vai até 5 dan e profissional vai ate 10 dan
    private double salario; //sumor da 5 categoria em diante recebe salario
    private ArrayList<Premiacao> premiacoes;
    private int totalLutas; 
    private int totalVitorias;
    private int totalDerrotas;
    private int totalDesistencias;

    public Sumotori(String nome) {
        super(nome);
    }

    public String getCategoria() {
        return categoria;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int derrotas) {
        this.totalDerrotas = derrotas;
    }

    public int getTotalDesistencias() {
        return totalDesistencias;
    }

    public void setTotalDesistencias(int desistencias) {
        this.totalDesistencias = desistencias;
    }

    public int getTotalLutas() {
        return totalLutas;
    }

    public void setTotalLutas(int numLutas) {
        this.totalLutas = numLutas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int vitorias) {
        this.totalVitorias = vitorias;
    }    
}
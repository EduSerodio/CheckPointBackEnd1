package com.check.model;

public class Filial {

    //ATRIBUTOS
    private int id;
    private String nomeFilial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String is5Estrelas;

    //CONSTRUTOR
    public Filial(int id, String nomeFilial, String rua, String numero, String cidade, String estado, String is5Estrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.is5Estrelas = is5Estrelas;
    }



    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIs5Estrelas() {
        return is5Estrelas;
    }

    public void setIs5Estrelas(String is5Estrelas) {
        this.is5Estrelas = is5Estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", is5Estrelas='" + is5Estrelas + '\'' +
                '}';
    }
}

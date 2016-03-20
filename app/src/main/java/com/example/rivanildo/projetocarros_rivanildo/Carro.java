package com.example.rivanildo.projetocarros_rivanildo;

/**
 * Created by Rivanildo on 19/03/16.
 */
public class Carro {

    public String carro;
    public int idImagemCarro;

    public Carro(String carro, int idImagemCarro) {
        this.carro = carro;
        this.idImagemCarro = idImagemCarro;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public int getIdImagemCarro() {
        return idImagemCarro;
    }

    public void setIdImagemCarro(int idImagemCarro) {
        this.idImagemCarro = idImagemCarro;
    }
}

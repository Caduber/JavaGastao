package com.gastao.javagastao.models;

public class Gasto {
    private String tipo;
    private String forma;
    private String data;
    private float valor;
    private String observacao;

    public Gasto(){
        tipo = "";
        forma= "";
        data= "";
        valor = 0;
        observacao = "";
    }

    public String getTipo(){
        return tipo;
    }

    public String getForma(){
        return forma;
    }

    public String getData(){
        return data;
    }

    public float getValor(){
        return valor;
    }

    public String getObservacao(){
        return observacao;
    }


    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setForma(String forma){
        this.forma = forma;
    }

    public void setData(String data){
        this.data = data;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public void setObservaovao(String observacao){
        this.observacao = observacao;
    }
}

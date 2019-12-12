/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedido;

/**
 *
 * @author Asgard
 */
public class ItensPedido {
    private String modeloBicicleta;
    private String corBicicleta;
    private int qntBicicleta;

    public String getModeloBicicleta() {
        return modeloBicicleta;
    }

    public void setModeloBicicleta(String modeloBicicleta) {
        this.modeloBicicleta = modeloBicicleta;
    }

    public String getCorBicicleta() {
        return corBicicleta;
    }

    public void setCorBicicleta(String corBicicleta) {
        this.corBicicleta = corBicicleta;
    }

    public int getQntBicicleta() {
        return qntBicicleta;
    }

    public void setQntBicicleta(int qntBicicleta) {
        this.qntBicicleta = qntBicicleta;
    }

    @Override
    public String toString() {
        return "No pedido consta as bicicletas do modelo:" + this.modeloBicicleta + ". De cor: " + this.corBicicleta + ". Sendo para entrega a quantidade de:" + this.qntBicicleta + '.';
    }

  
}

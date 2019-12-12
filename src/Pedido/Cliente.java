/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pedido;
import java.util.Scanner;
/**
 *
 * @author Asgard
 */
public class Cliente {
    private String nome;
    private String CPF;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cpf) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome:" + nome + "; CPF:" + CPF + "; endereco:" + endereco + '}';
    }
    
    
}

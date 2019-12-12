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
public class Pedido {
    private int idPedido;
    private ItensPedido listaPedido;
    private Cliente cliente;
    
    
    //gerando dados de cliente, para inserir no pedido 
    public Cliente gerarNovoCliente(){
        System.out.println("");
        System.out.println("### Cadastrar um novo cliente ###");
        Scanner teclado = new Scanner(System.in);
        Cliente novoCliente = new Cliente();
        
        System.out.println("Nome do Cliente:");
        String entradaDado1 = teclado.nextLine();
        novoCliente.setNome(entradaDado1);
        
        System.out.println("CPF do Cliente:");
        String entradaDado2 = teclado.nextLine();
        novoCliente.setCPF(entradaDado2);
        
        System.out.println("Endereco:");
        String entradaDado3 = teclado.nextLine();
        novoCliente.setEndereco(entradaDado3);
        
        return novoCliente;
    }
    
    //gerando dados de item, para inserir no Pedido
    public ItensPedido inserirItens(){
        System.out.println(" ");
        System.out.println("### Insira os itens do Pedido ###");
        Scanner teclado = new Scanner(System.in);
        ItensPedido novosItens = new ItensPedido();
        
        System.out.println("Digite o modelo das bicicletas que voce deseja que sejam produzidas !");
        String entradaDado1 = teclado.nextLine();
        novosItens.setModeloBicicleta(entradaDado1);
        
        System.out.println("Digite a cor de todas as bicicleta que voce deseja que sejam produzidas !");
        String entradaDado2 = teclado.nextLine();
        novosItens.setCorBicicleta(entradaDado2);
        
        System.out.println("Digite quantas bicicletas que vc quer que sejam produzidas !");
        int entradaDado3 = teclado.nextInt();
        novosItens.setQntBicicleta(entradaDado3);
        
        return novosItens;
    }
    
    
    //gerando o Pedido
    public Pedido gerarNovoPedido(){
        System.out.println(" ");
        Scanner teclado = new Scanner(System.in);
        this.idPedido ++;
        Pedido pedido = new Pedido(idPedido,gerarNovoCliente(),inserirItens());
        
        System.out.println(pedido);

        System.out.println(" ");
        
        return pedido;
    }

    public ItensPedido passaItens(){
        ItensPedido itens= new ItensPedido();
        return itens;
    }

    public Pedido(int idPedido, Cliente cliente, ItensPedido listaPedido) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.listaPedido = listaPedido;
    }
    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public ItensPedido getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ItensPedido listaPedido) {
        this.listaPedido = listaPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItensPedido getItensPedido() {
        return listaPedido;
    }

    public void setItensPedido(ItensPedido listaPedido) {
        this.listaPedido = listaPedido;
    }

    
    @Override
    public String toString() {
        return "Dados do pedido{" + "idPedido=" + idPedido + ", listaPedido=" + listaPedido + ", cliente=" + cliente + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricabicicletas;
import Pedido.Cliente;
import Pedido.ItensPedido;
import Pedido.Pedido;
import java.util.Scanner;

/**
 *
 * @author Asgard
 */
public class FabricaBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("## TESTANDO ETAPA PEDIDO ##");
        
        Cliente cliente = new Cliente();
        ItensPedido itens = new ItensPedido();
        Pedido pedido = new Pedido(0,cliente,itens);
        boolean condicao = true;
        
        while (condicao == true){
            int comando = 1;
            System.out.println(" Digite 1 para efetuar um pedido e 0 para sair do sistema:");
            Scanner teclado = new Scanner(System.in);
            comando = teclado.nextInt();
            
            switch (comando){
                case 1:
                    
                    System.out.println(" ABRINDO PEDIDO\n ");
                    pedido.gerarNovoPedido();
                    
                    // Print dos dados armazenados
                    
                    pedido.toString();
                    System.out.println("");  
                    pedido.getCliente().toString();
                    
                    System.out.println(" ");
                    System.out.println("## PEDIDO REGISTRADO COM SUCESSO ##");
                    
                    break;
                case 0:
                    condicao = false;
            break;
            default:
                System.out.println("OPCAO INVALIDA \n");
            }
        
        }
    
    }
}

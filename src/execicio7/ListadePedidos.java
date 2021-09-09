/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio7;

import java.util.ArrayList;

/**
 *
 * @author Caio
 */
public class ListadePedidos {
        private ArrayList<Pedidos> pedido;
        
 //-----------------------------------------------------------------------------

    public ListadePedidos() {
        pedido = new ArrayList<>();
    }
 //-----------------------------------------------------------------------------

    public void setPedido(Pedidos pedido) {
        this.pedido.add(pedido);
    }

    public ArrayList<Pedidos> getPedido() {
        return pedido;
    }
    

    
 //-----------------------------------------------------------------------------


  public void realizarPedido(Pedidos p){
      this.pedido.add(p);
    
  }
  public void removerPedido(Pedidos p ){
      this.pedido.remove(p);
  
  }

   
        
        
        
}

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
public class Pedidos{
    private Cliente cliente;
    private Funcionarios funcionario;
    private int numPedido;
    private Locacao locacao;
    private ListadeVeiculos veiculo;
    private int numLugares;
    private int placa;
//---------------------------------------------------------------------------------------------------------------------
    public Pedidos(Cliente cliente, Funcionarios funcionario, Locacao locacao, ListadeVeiculos listadeveiculo) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        
        this.locacao = locacao;
        this.veiculo = listadeveiculo;
        this.numLugares = 0;
    }
//---------------------------------------------------------------------------------------------------------------------
    public Cliente getCliente() {
        return cliente;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public ListadeVeiculos getVeiculo() {
        return veiculo;
    }

    public int getPlaca() {
        return placa;
    }

    public int getNumLugares() {
        return numLugares;
    }
//--------------------------------------------------------------------------------------------------------------------- 

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public void setNumPedido(int num) {
       if(num==0){
           this.numPedido=1;
       }
       else if(num!=0) this.numPedido = num + 1;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public void setVeiculo(ListadeVeiculos veiculo) {
        this.veiculo = veiculo;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

  

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }
//---------------------------------------------------------------------------------------------------------------------

    @Override
    public String toString(){
        return "Pedido{"+this.getNumPedido()+"\nCliente:"+this.getCliente()+"\nFuncionário:"+this.getFuncionario()+"\nVALOR da Locação: "+this.getLocacao().getValorTotal()+"\nPlaca do veiculo:"+this.getPlaca()+"}";
    }

}

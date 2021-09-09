/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio7;

/**
 *
 * @author Caio
 */
public interface InterfacePedido {
    public abstract void realizaPedido();
    public abstract void realizaPagamentoEntrada();
    
    public abstract void realizaLocacao();
    public abstract void defineVeiculo(int numerodelugares);
}

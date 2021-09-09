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
public class Carro extends Veiculos {
    public Carro(int placa, String fabricante){
        setNumero_pneus(4);
        setNumero_lugares(5);
        setPlaca(placa);
        setFabricante(fabricante);
        setValor_diaria(50);
    }
    @Override
    public String toString(){
        return "Carro{ "+this.getFabricante()+" Placa: "+this.getPlaca()+" Status: "+this.getStatus()+" }";
    }
    
}

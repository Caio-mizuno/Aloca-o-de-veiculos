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
public class Motocicleta extends Veiculos{
    public Motocicleta(int placa, String fabricante){
        setNumero_pneus(2);
        setNumero_lugares(2);
        setPlaca(placa);
        setFabricante(fabricante);
        setValor_diaria(20);
    }
     @Override
    public String toString(){
        return "Motocicleta{ "+this.getFabricante()+" Placa: "+this.getPlaca()+" Status: "+this.getStatus()+" }";
    }
}

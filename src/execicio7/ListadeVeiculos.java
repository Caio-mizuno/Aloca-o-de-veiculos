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
public class ListadeVeiculos {
    private ArrayList<Carro> carrolista;
    private  ArrayList<Camionete> camionetelista;
    private ArrayList<Motocicleta> motolista;
    private ArrayList<Veiculos> veiculo;
//---------------------------------------------------------------------------------
    public ListadeVeiculos() {
        carrolista = new ArrayList<>();
        camionetelista = new ArrayList<>();
        motolista = new ArrayList<>();
        veiculo = new ArrayList<>();
        
    }

//-----------------------------------------------------------------------------------   
    
    public ArrayList<Carro> getCarrolista() {
        return carrolista;
    }

    public ArrayList<Camionete> getCamionetelista() {
        return camionetelista;
    }

    public ArrayList<Motocicleta> getMotolista() {
        return motolista;
    }

    public ArrayList<Veiculos> getVeiculo() {
        return veiculo;
    }
    
    public void setCarrolista(Carro carrolista) {
        this.carrolista.add(carrolista);
        this.veiculo.add(carrolista);
    }

    public void setCamionetelista(Camionete camionetelista) {
        this.camionetelista.add(camionetelista);
        this.veiculo.add(camionetelista);
    }

    public void setMotolista(Motocicleta motolista) {
        this.motolista.add(motolista);
        this.veiculo.add(motolista);
    }
   
    public void mostrarCarro(){
        carrolista.forEach(c -> {
            System.out.println(c.toString());
        });
    }
    public void mostrarCamionete(){
        camionetelista.forEach(c -> {
            System.out.println(c.toString());
        });
    }
    public void mostrarMotocicleta(){
        motolista.forEach(m -> {
            System.out.println(m.toString());
        });
    }
    
    
}

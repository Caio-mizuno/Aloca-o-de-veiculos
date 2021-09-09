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
public abstract class  Veiculos implements InterfaceVeiculos{
    private int numero_pneus;
    private int numero_lugares;
    private int placa;
    private String fabricante;
    private float valor_diaria;
    private boolean estado,status;//LIGADO OU DESLIGADO
//-------------------------------------------------------------------------
    public Veiculos() {
        status = true;
    }
//-------------------------------------------------------------------------
    
//-------------------------------------------------------------------------
    public int getNumero_pneus() {
        return numero_pneus;
    }

    public int getNumero_lugares() {
        return numero_lugares;
    }

    public int getPlaca() {
        return placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public float getValor_diaria() {
        return valor_diaria;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean getStatus() {
        return status;
    }
    
 //-------------------------------------------------------------------------   

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setNumero_pneus(int numero_pneus) {
        this.numero_pneus = numero_pneus;
    }

    public void setNumero_lugares(int numero_lugares) {
        this.numero_lugares = numero_lugares;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setValor_diaria(float valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
//------------------------------------------------------------------------------
    @Override
    public void ligar() {
        this.setEstado(true);
        System.out.println("---LIGADO---");
    }

    @Override
    public void desligar() {
        this.setEstado(false);
        System.out.println("---LIGADO---");
    }

    @Override
    public void virar() {
        System.out.println("Está virando");
    }

    @Override
    public void acelerar() {
        System.out.println("ESTÁ ACELERANDO");
    }

    @Override
    public void frear() {
        System.out.println("ESTÁ FREANDO");
    }

    @Override
    public void trocarMarcha(int marcha) {
        System.out.println("TROCANDO PARA MARCHA " + marcha);
    }
    
    @Override
    public void abrirMenu(){
        System.out.println("Numero de Pneus: " + this.getNumero_pneus());
        System.out.println("Numero de lugares : " + this.getNumero_lugares());
        System.out.println("Numero da placa: " + this.getPlaca());
        System.out.println("Nome do fabricante: " + this.getFabricante());
        System.out.println("Valor da diaria: " + this.getValor_diaria());
    }
}

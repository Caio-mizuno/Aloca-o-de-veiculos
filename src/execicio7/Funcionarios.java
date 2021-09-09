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
public class Funcionarios extends Pessoas{
    private int codigodetrabalho;
    private String cargo;

    public int getCodigodetrabalho() {
        return codigodetrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCodigodetrabalho(int codigodetrabalho) {
        this.codigodetrabalho = codigodetrabalho;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String toString(){
        return "Funcionário{"+" Nome: " + this.getNome()+" Código de trabalho: "+this.getCodigodetrabalho() +" Cargo: "+this.getCargo()+" CPF: " + this.getCpf()+ " Idade: " + this.getIdade() + " Data de nascimento: " + this.getData_de_nasc()+"}";
    }

    
}

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
public class Cliente extends Pessoas{
//ATRIBUTOS---------------------------------------------------------------------
    private float saldo;
    private String telefone;
    private String endereco;
    private int tipo;
    
//------------------------------------------------------------------------------
    public Cliente(float saldo, String telefone, String endereco) {
        this.saldo = saldo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.tipo = 0;
    } 
//------------------------------------------------------------------------------
     public float getSaldo() {
        return saldo;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTipo() {
        return tipo;
    }

    
//------------------------------------------------------------------------------    

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

   
//------------------------------------------------------------------------------   

    
    
    
    @Override
    public String toString(){
        return "Cliente{"+" Nome: " + this.getNome() + " CPF: " + this.getCpf()+ " Idade: " + this.getIdade() + " Telefone: " + this.getTelefone() + " Endereco: "+ this.getEndereco() + " Data de nascimento: " + this.getData_de_nasc() + " Saldo: " + this.getSaldo() + " Tipo: " + this.getTipo()+"}";
    }
}

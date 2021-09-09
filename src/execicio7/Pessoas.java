package execicio7;
import java.util.Calendar;
public abstract class  Pessoas implements InterfacePessoa {
//ATRIBUTOS ---------------------------------------------------------------
    private String nome;
    private int cpf;
    private int altura, idade;
    private String sexo;
    private Calendar data_de_nasc;
    
//------------------------------------------------------------------------------

    
//-------------------------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public Calendar getData_de_nasc() {
        return data_de_nasc;
    }

    public int getAltura() {
        return altura;
    }

    public String getSexo() {
        return sexo;
    }


//------------------------------------------------------------------------------


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setData_de_nasc(Calendar data_de_nasc) {
        this.data_de_nasc = data_de_nasc;
    }
//------------------------------------------------------------------------------
    @Override   //verifica se hj é aniversário da pessoa
    public void fazerAniversario(Calendar c) { 
        if((data_de_nasc.get(Calendar.MONTH) == c.get(Calendar.MONTH)) && (data_de_nasc.get(Calendar.DAY_OF_MONTH) == c.get(Calendar.DAY_OF_MONTH))){
            System.out.println("PARABÉNS, HOJE É SEU ANIVERSÁRIO!!!");
        }
    }

    @Override
    public void definirAltura() {
        if(this.getAltura()<150){
            System.out.println("Não pode dirigir motos, pois são muito grandes.");
        }else System.out.println("Pode dirigir qualquer veículo.");
        
    }


}


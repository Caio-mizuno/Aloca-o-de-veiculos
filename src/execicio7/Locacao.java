package execicio7;
public class Locacao {
    //ATRIBUTO
    //--------------------------------------------------------------------------
    
    private String data_do_pedido;  
    private String data_de_devolucao;
    private float valorTotal;
//------------------------------------------------------------------------------
    public Locacao(String data_do_pedido, String data_de_devolucao) {
        this.valorTotal=0;
        this.data_do_pedido = data_do_pedido;
        this.data_de_devolucao = data_de_devolucao;
        
    }
//------------------------------------------------------------------------------    



    public String getData_do_pedido() {
        return data_do_pedido;
    }

    public String getData_de_devolucao() {
        return data_de_devolucao;
    }

    public float getValorTotal() {
        return valorTotal;
    }



    public void setData_do_pedido(String data_do_pedido) {
        this.data_do_pedido = data_do_pedido;
    }

    public void setData_de_devolucao(String data_de_devolucao) {
        this.data_de_devolucao = data_de_devolucao;
    }

    public void setValorTotal(float dias,int tipo) {
        if(tipo==1){this.valorTotal = dias * 20;}
        else if(tipo==2){this.valorTotal = dias * 50;}
        else this.valorTotal = dias * 100;
    }
    
    public void estenderValorTotal(float dias,int tipo){
            if(tipo==1){this.valorTotal = this.valorTotal + (dias * 20);}
        else if(tipo==2){this.valorTotal += (dias * 50);}
        else this.valorTotal += (dias * 100);
    }
    
    
    
}

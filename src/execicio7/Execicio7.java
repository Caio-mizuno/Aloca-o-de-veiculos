/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicio7;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Caio
 */
public class Execicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calendar c = Calendar.getInstance();
		System.out.println("Data/Hora atual: "+c.getTime());
       ListadePessoas ldp = new ListadePessoas();
       ListadePedidos listaP = new ListadePedidos();
       ListadeVeiculos listaV = new ListadeVeiculos();
       Scanner teclado = new Scanner(System.in);
       float saldo;
       String telefone;
       String endereco;
       String fabricante;
       int pessoas, placa;
       int controle=0,CPF,verific;
       int op,op2=0,op3;
       int tipo = 0,dias;
       
       Cliente c1 = new Cliente(1000,"908987467","r. Tuiwher");
        c1.setAltura(180);
        c1.setCpf(1008870785);
        c1.setSexo("M");
        c1.setIdade(21);
        c1.setNome("Vudode Amdixiu Farsulie");
        ldp.setClientes(c1);

        Cliente c2 = new Cliente(1000,"8923895","r. wehieog");
        c2.setAltura(170);
        c2.setCpf(89978);
        c2.setSexo("F");
        c2.setIdade(79);
        c2.setNome("Wifua Loiol Winu Diuol");
        ldp.setClientes(c2);
        
        Cliente c3 = new Cliente(6000,"32435675","r. Bleva");
        c3.setAltura(148);
        c3.setCpf(78756578);
        c3.setSexo("M");
        c3.setIdade(10);
        c3.setNome("Olsoi Duon Karuy Bovor");
        ldp.setClientes(c3);
        
        Funcionarios f = new Funcionarios();
        f.setNome("Fous Fewae Tianl");
        f.setCodigodetrabalho(12515);
        f.setCargo("Gerente");
        f.setAltura(170);
        f.setCpf(23467);
        f.setSexo("M");
        f.setIdade(45);
        ldp.setFuncionarios(f);
        
        Funcionarios f2 = new Funcionarios();
        f2.setNome("Zuvai Luoal Haca Ceobyos");
        f2.setCodigodetrabalho(56362);
        f2.setCargo("Atendente");
        f2.setAltura(170);
        f2.setCpf(23467);
        f2.setSexo("M");
        f2.setIdade(45);
        ldp.setFuncionarios(f2);

        Carro carro1 = new Carro(1,"CARRO1");
        listaV.setCarrolista(carro1);
        Carro carro2 = new Carro(2,"CARRO2");
        listaV.setCarrolista(carro2);
        Carro carro3 = new Carro(3,"CARRO3");
        listaV.setCarrolista(carro3);
        
        Motocicleta moto1 = new Motocicleta(4,"MOTO1");
        listaV.setMotolista(moto1);
        Motocicleta moto2 = new Motocicleta(5,"MOTO2");
        listaV.setMotolista(moto2);
        Motocicleta moto3 = new Motocicleta(6,"MOTO3");
        listaV.setMotolista(moto3);
        
        Camionete ca1 = new Camionete(7,"CAMIONETE1");
        listaV.setCamionetelista(ca1);
        Camionete ca2 = new Camionete(8,"CAMIONETE2");
        listaV.setCamionetelista(ca2);
        Camionete ca3 = new Camionete(9,"CAMIONETE3");
        listaV.setCamionetelista(ca3);









//-------------------------------------------------------------------------
    
       do{
        System.out.println("----------MENU----------");
        System.out.println("1 - Add CLIENTE");
        System.out.println("2 - Add FUNCIONÁRIO");
        System.out.println("3 - MOSTRAR PESSOAS");
        System.out.println("4 - FAZER PEDIDOS");
        System.out.println("5 - MOSTRAR PEDIDOS");
        System.out.println("6 - MOSTRAR VEÍCULOS");
        System.out.println("7 - ESTENDER LOCACAO");
        System.out.println("8 - CADASTRAR VEICULOS NA LOJA");
        System.out.println("9 - FINALIZAR PEDIDO");

        System.out.println("------------------------");
        
       
        op = teclado.nextInt();
        switch(op){
            case 1:                                                             // CADASTRA CLIENTES
                System.out.println("Inserir:");
                System.out.println("SALDO");
                saldo = teclado.nextFloat();
                System.out.println("TELEFONE");
                telefone = teclado.next();
                System.out.println("ENDERECO");
                endereco = teclado.next();
                 
                Cliente client = new Cliente(saldo,telefone,endereco);
                System.out.println("ALTURA");
                client.setAltura(teclado.nextInt());
                System.out.println("CPF");
                client.setCpf(teclado.nextInt());
                System.out.println("SEXO -  (M) (F)");
                client.setSexo(teclado.next());
                System.out.println("IDADE");
                client.setIdade(teclado.nextInt());
                System.out.println("NOME");
                client.setNome(teclado.next());
                ldp.setClientes(client);
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 2:                                                             //CADASTRA FUNCIONÁRIO
                Funcionarios funcionario = new Funcionarios();
                System.out.println("NOME");
                funcionario.setNome(teclado.next());
                System.out.println("CODIGO DE TRABALHO");
                funcionario.setCodigodetrabalho(teclado.nextInt());
                System.out.println("CARGO");
                funcionario.setCargo(teclado.next());
                System.out.println("ALTURA");
                funcionario.setAltura(teclado.nextInt());
                System.out.println("CPF");
                funcionario.setCpf(teclado.nextInt());
                System.out.println("SEXO -  (M) (F)");
                funcionario.setSexo(teclado.next());
                System.out.println("IDADE");
                funcionario.setIdade(teclado.nextInt());
                ldp.setFuncionarios(funcionario);
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 3:                                                             //IMPRIME PESSOAS
                System.out.println("Clientes:");
                for(Cliente cl : ldp.getClientes()){
                    System.out.println(cl.toString());
                }
                System.out.println("Funcionários:");
                for(Funcionarios f3 : ldp.getFuncionarios()){
                    System.out.println(f3.toString());
                }
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 4:
                verific=0;
                int i=0;
                for(Veiculos v : listaV.getVeiculo()){                              //VERIFICA SE TEM VEICULOS CADASTRADOS
                    verific++;
                }
                for(Cliente cliente : ldp.getClientes()){                       //VERFICA SE TEM CLIENTES
                    i++;
                }
                
                if(verific==0){System.out.println("NÃO HÁ NENHUM VEÍCULO CADASTRADO, CADASTRE ALGUM VEICULO");}
                
                else if(i==0){System.out.println("NÃO HÁ CLIENTES REALIZANDO PEDIDOS!");}
                
                else{
                    i=0;
                    Cliente cp = new Cliente(2354,"","");
                    for(Cliente cl : ldp.getClientes()){  //PEGAR O CLIENTE MAIS RECENTE DA LISTA
                        i++;
                        if (i==1){ cp = cl;}
                    }
                    System.out.println("O CLIENTE MAIS RECENTE É:"); //INFORMA O CLIENTE MAIS RECENTE
                    System.out.println(cp.toString());
                                                        //REMOVE DA LISTA CLIENTE E ENVIA PARA LISTA PEDIDOS.
                //----------------================------------------------------
                    System.out.println("============================================");
                    System.out.println("");
                    Funcionarios fun = new Funcionarios();
                do{
                    op2=1;                                                      //VERIFICO QUAIS SÃO OS FUNCIONARIOS
                                                                                //QUAL FUNCIONÁRIO ESTÁ ATENDENDO DETERMINADO CLIENTE
                    for(Funcionarios funci : ldp.getFuncionarios()){
                        System.out.println(funci.toString());
                    }
                    System.out.println("COD. DO FUNCIONÁRIO:");                 //INSERE O COD DE TRABALHO    
                    controle= teclado.nextInt();
                    for(Funcionarios funci : ldp.getFuncionarios()){            //SE O CODICO DE TRABALHO EXISTIR SAI DO LAÇO
                        if(controle == funci.getCodigodetrabalho()){
                            fun = funci;
                            op2=0;
                        }
                    }
                    if(op2==1){System.out.println("ENTRADA INVALIDA");}         //SE NÃO, PERMANECE NO LAÇO
                }while(op2!=0); 
                //----------------================------------------------------
                    String dataPedido, dataDevolucao;
                    
                
                    System.out.println("insira:");
                    System.out.println("Data do pedido:");                      //ENTRA COM A DATA DO PEDIDO
                    dataPedido = teclado.next();
                    System.out.println("Data de Devolução:");                   //ENTRA COM A DATA DA DEVOLUÇÃO
                    dataDevolucao = teclado.next();
                Locacao l = new Locacao(dataPedido,dataDevolucao);              //INICIA O OBJETO LOCACAO
                do{
                    op3=0;
                
                System.out.println("1 - MOTO = 20,00");
                System.out.println("2 - CAROO = 50,00");
                System.out.println("3 - CAMIONETE = 100,00");
                tipo = teclado.nextInt();                                       //ENTRA COM O TIPO DE VEICULO QUE O CLIENTE QUER
                
                if(tipo==1){op3=1;} 
                else if (tipo==2){op3=1;}
                else if(tipo==3){op3=1;}
                else System.out.println("Tente novamente...");                      
                
                }while(op3==0);
                //----------------================------------------------------
                System.out.println("QUANTOS DIAS DE LOCAÇÃO?");                 //PERGUNTA QUANTOS DIAS O CLIENTE VAI UTILIZAR O VEICULO
                    dias = teclado.nextInt();
                l.setValorTotal(dias, tipo);                                    //SETA O VALOR TOTAL 
                //------------------------------------------------------
                
                
                Pedidos p = new Pedidos(cp,fun,l,listaV);                       //INICIALIZA O OBJETO PEDIDO
                //----------------================------------------------------
                                                                                
                cp.setTipo(tipo);                                               //CHAMA A FUNÇÃO PARA DETERMINAR QUAL O TIPO DE VEICULO A PARTIR DA QUANTIDADE DE PESSOAS
                if(tipo==1){
                        do{
                        op2=1;
                            for(Motocicleta m : listaV.getMotolista()){         //IMPRIMIR AS MOTOCICLETAS                         
                                System.out.println("Placa: " + m.getPlaca() + " Status: " + m.getStatus());
                            }
                            System.out.println("SELECIONE UMA MOTO(placa):");   //SELECIONAR QUAL QUER ALUGAR
                            controle = teclado.nextInt();
                            for(Motocicleta m : listaV.getMotolista()){         
                                if((controle == m.getPlaca()) &&(m.getStatus() == true) ){//VERIFICA SE A ENTRADA É VERDADEIRA E EXISTENTE / E SE A MOTO ESTÁ LIVRE, SE FOR FALSE QUER DIZER QUE JA ESTA ALUGADA
                                    m.setStatus(false);
                                    p.setPlaca(m.getPlaca());
                                    System.out.println("Esta MOTO: "+m.getPlaca()+" FOI ALUGADA. STATUS: "+m.getStatus());
                                    op2=0;
                                }
                            }
                            if(op2==1){System.out.println("Veiculo INDISPONIVEL");}
                        }while(op2!=0);
                    }
                //================================================================================================
                else if(tipo==2){
                    do{
                        op2=1;
                    for(Carro car : listaV.getCarrolista()){
                        System.out.println("Placa: " + car.getPlaca() + " Status: " + car.getStatus());
                    }
                    System.out.println("SELECIONE UM CARRO(placa):");
                    controle = teclado.nextInt();
                    for(Carro car : listaV.getCarrolista()){
                        if(controle == car.getPlaca() &&(car.getStatus()==true)){
                            car.setStatus(false);
                            p.setPlaca(car.getPlaca());
                            System.out.println("Este CARRO: "+car.getPlaca()+" FOI ALUGADA. STATUS: "+car.getStatus());
                            op2=0;
                        }
                    }
                    if(op2==1){System.out.println("Veiculo INDISPONIVEL");}
                    }while(op2!=0);
                }
                //==============================================================================================
                else{
                    do{
                        op2=1;
                    for(Camionete car : listaV.getCamionetelista()){
                        System.out.println("Placa: " + car.getPlaca() + " Status: " + car.getStatus());
                    }
                    System.out.println("SELECIONE UMA CAMIONETE(placa):");
                    controle = teclado.nextInt();
                    for(Camionete car : listaV.getCamionetelista()){
                        if(controle == car.getPlaca()&&(car.getStatus()==true)){
                            car.setStatus(false);
                            p.setPlaca(car.getPlaca());
                            System.out.println("Esta CAMIONETE: "+car.getPlaca()+" FOI ALUGADA. STATUS: "+car.getStatus());
                            op2=0;    
                        }
                    }
                    if(op2==1){System.out.println("Veiculo INDISPONIVEL");}
                    }while(op2!=0);
                }
                //===========================================================================
                op3=0;
                for(Pedidos pedidos:listaP.getPedido()){        // REALIZAR O NUMERO DO PEDIDO
                    if(pedidos.getNumPedido()!= 0 ){
                        op3++;
                    }
                }
                if(op3==0){                                     // SE ZERO INICIA COM 1
                    p.setNumPedido(0);
                }
                if(op3!=0){
                    p.setNumPedido(op3);                        //SE NÃO SOMA MAIS 1
                }
                //---------------------------------------------------
                
                
                
                
                listaP.realizarPedido(p);                       // REALIZA O PEDIDO
                ldp.removerClientes(cp);                        // DELETA O NOME DO CLIENTE DA LISTA
                }  
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 5:
                for(Pedidos pedidos : listaP.getPedido()){
                    System.out.println(pedidos.toString());
                    System.out.println("--------------------------------------------");
                }
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 6:
                for(Motocicleta m : listaV.getMotolista()){
                    System.out.println(m.toString());
                    System.out.println("----------------------");
                }
                for(Carro m : listaV.getCarrolista()){
                    System.out.println(m.toString());
                    System.out.println("----------------------");
                }
                for(Camionete m : listaV.getCamionetelista()){
                    System.out.println(m.toString());
                    System.out.println("----------------------");
                }
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 7:
                
                do{
                    tipo=0;
                    op2=1;
                for(Pedidos pe : listaP.getPedido()){
                    System.out.println(pe.toString());
                }
                System.out.println("ENTRE COM O CPF DO CLIENTE:");
                controle = teclado.nextInt();
                    for(Pedidos pe : listaP.getPedido()){
                        
                            if(pe.getCliente().getCpf()==controle){
                                
                                
                                System.out.println("DIGITE QUANTO DIAS QUER ESTENDER");
                                dias = teclado.nextInt();
                                pe.getLocacao().estenderValorTotal(dias, pe.getCliente().getTipo());
                                System.out.println("VALOT TOTAL:"+pe.getLocacao().getValorTotal());
                                op2=0;
                            }
                        if(op2==1){
                            System.out.println("Entrada INVALIDA!!!");
                        }
                    }
                }while(op2!=0);        
                break;
 //=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
            case 8:
                //================================================================
                do{
                System.out.println("---- ADICIONAR ----");
                System.out.println("1 - MOTOCICLETA  --");
                System.out.println("2 - CARRO        --");
                System.out.println("3 - CAMIONETE    --");
                op2 = teclado.nextInt();
                switch (op2){
                    case 1:
                    do{
                            op3=1;
                        for(Veiculos veiculo : listaV.getVeiculo()){            //IMPRIME OS DADOS DE TODOS OS VEICULOS
                            System.out.println(veiculo.toString());
                        }
                        System.out.println("insira a placa:");
                        placa = teclado.nextInt();                              //INSERE A PLACA DO VEICULO
                        for(Veiculos veiculo : listaV.getVeiculo()){
                            if(placa == veiculo.getPlaca()){                    //VERIFICA SE EXISTE UMA PLACA QUE FOI INSERIDA
                                op3=2;
                            }
                        }
                        if(op3==1){
                            System.out.println("Insira o nome do fabricante:");
                            fabricante = teclado.next();                        //SE A PLACA NAO EXISTIR, INSERE O FABRICANTE E SEGUE...
                            op3=0;
                            listaV.setMotolista(new Motocicleta(placa,fabricante));     //ADICIONA O VEICULO NA LISTA
                            
                        }else{
                            System.out.println("Tente novamente!");
                        }
                    }while(op3!=0);
                        break;
                //================================================================        
                    case 2:
                    do{                                                         // REPETE OS COMENTÁRIOS DO "CASE" ANTERIOR
                            op3=1;
                        for(Veiculos veiculo : listaV.getVeiculo()){
                            System.out.println(veiculo.toString());
                        }
                        System.out.println("insira a placa:");
                        placa = teclado.nextInt();
                        for(Veiculos veiculo : listaV.getVeiculo()){
                            if(placa == veiculo.getPlaca()){
                                op3=2;
                            }
                        }
                        if(op3==1){
                            System.out.println("Insira o nome do fabricante:");
                            fabricante = teclado.next();
                            op3=0;
                            listaV.setCarrolista(new Carro(placa,fabricante));                            
                        }else{
                            System.out.println("Tente novamente!");
                        }
                    }while(op3!=0);
                        break;
                //================================================================
                    case 3:
                    do{
                            op3=1;
                        for(Veiculos veiculo : listaV.getVeiculo()){
                            System.out.println(veiculo.toString());
                        }
                        System.out.println("insira a placa:");
                        placa = teclado.nextInt();
                        for(Veiculos veiculo : listaV.getVeiculo()){
                            if(placa == veiculo.getPlaca()){
                                op3=2;
                                break;
                            }
                        }
                        if(op3==1){
                            System.out.println("Insira o nome do fabricante:");
                            fabricante = teclado.next();
                            op3=0;
                                listaV.setCamionetelista(new Camionete(placa,fabricante));
                        }else{
                            System.out.println("Tente novamente!");
                        }
                    }while(op3!=0);
                        break;
                    default:
                        System.out.println("TENTE NOVAMENTE!!!");

                        break;
                }
                }while(op2!=0);
                break;
            //===================================================================    
            case 9:
                 for(Pedidos pedidos : listaP.getPedido()){                     //IMPRIME OS PEDIDOS
                    System.out.println(pedidos.toString());
                }
                 System.out.println("--------------------------------------------");
                 System.out.println("Insira o NUMERO do pedido que quer APAGAR:");
                 controle = teclado.nextInt();                                  //INSERE O NUMERO DO PEDIDO QUE QUER APAGAR
                 for(Pedidos pedidos : listaP.getPedido()){
                    if(pedidos.getNumPedido()==controle){
                        listaP.removerPedido(pedidos);                          //REMOVE O PEDIDO
                    }
                }
                 for(Pedidos pedidos : listaP.getPedido()){                     //IMPRIME NOVAMENTE OS PEDIDOS
                    System.out.println(pedidos.toString());
                }
                break;
//=====-=-=-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=   =-=-=-=-=-=-=-=-=-=                
           
            default:
                System.out.println("TENTE NOVAMENTE!!!");
                break;
        }
       
       }while(op != 0); 
    }
    
}

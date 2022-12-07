package application;
import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import entities.Sistema;
import java.util.stream.IntStream;

public class cadastroFuncionarios {
    public static void main(String[] args) throws InterruptedException{
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        List<Sistema> sistemaList = new ArrayList<>();

        String nomeAdmin;
        String senhaAdmin;


        do{
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Nome : ");
            nomeAdmin = scan.nextLine();
            System.out.print("Senha : ");
            senhaAdmin = scan.nextLine();
            if(senhaAdmin.equals("admin12")){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Seja bem-vindo "+nomeAdmin);

                int choice = 0;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ");
                System.out.print("\n\nQuantos registros voce quer fazer ? ");
                int numeroCadastro = scan.nextInt(); 
        
                for(int i=0; i<numeroCadastro; i++){                    
                    System.out.printf("\n\n\n%d REGISTRO", i+1);
                    System.out.print("\nInsira o ID do funcionario : ");
                    int funcionarioID = scan.nextInt();
                    System.out.print("\nInsira o cargo do funcionario : ");
                    scan.nextLine();
                    String funcionarioCargo = scan.nextLine();
                    System.out.print("\nInsira o nome do funcionario : ");
                    String funcionarioNome = scan.nextLine();
                    System.out.print("\nInsira o salario atual do funcionario R$ ");
                    double funcionarioSalario = scan.nextDouble();
        
                    Sistema dadosCadastro = new Sistema(funcionarioID, funcionarioCargo, funcionarioNome, funcionarioSalario);
        
                    sistemaList.add(dadosCadastro);
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.print("Registros realizados com sucesso !\n\n\n");
        
                do{

                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.print("\n\n O que você quer fazer agora ? ");
                    System.out.print("\n\n 1) - VER REGISTROS REALIZADOS\n 2) - FAZER NOVO REGISTRO\n 3) - MUDAR CARGO DO FUNCIONARIO\n 4) - MUDAR NOME DO FUNCIONARIO\n 5) - PROCURAR FUNCIONARIO PELO ID\n 6) - AUMENTAR SALARIO DO FUNCIONARIO\n 7) - DELETAR REGISTRO\n 8) - SAIR\n\nOPÇÃO SELECIONADA : ");
                    choice = scan.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                       
                            System.out.print("\n\nVER REGISTROS REALIZADOS\n\n");
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print(sistemaList);
                            System.out.print("\n\nApresentação realizada com sucesso !!!");
                            Thread.sleep(6000);
                            break;
                       
                        case 2:
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("\n\nQuantos registros voce quer fazer ? ");
                            numeroCadastro = scan.nextInt(); 
                    
                            for(int i=0; i<numeroCadastro; i++){                    
                                System.out.printf("\n\n\n%d REGISTRO", i+1);
                                System.out.print("\nInsira o ID do funcionario : ");
                                int funcionarioID = scan.nextInt();
                                System.out.print("\nInsira o cargo do funcionario : ");
                                scan.nextLine();
                                String funcionarioCargo = scan.nextLine();
                                System.out.print("\nInsira o nome do funcionario : ");
                                String funcionarioNome = scan.nextLine();
                                System.out.print("\nInsira o salario atual do funcionario R$ ");
                                double funcionarioSalario = scan.nextDouble();
                    
                                Sistema dadosCadastro = new Sistema(funcionarioID, funcionarioCargo, funcionarioNome, funcionarioSalario);
                    
                                sistemaList.add(dadosCadastro);
                            }
                            break;

                        case 3:
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("\n\nMUDAR CARGO DO FUNCIONARIO");
                            System.out.print("\nInsira o ID do funcionario que voce quer mudar o cargo : ");
                            int mudarCargoFuncionario = scan.nextInt();
                            Sistema mudarCargooFuncionario = sistemaList.stream().filter(x -> x.getFuncionarioID() == mudarCargoFuncionario).findFirst().orElse(null);
                            if(mudarCargooFuncionario== null){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.print("\nO ID inserido não corresponde a nenhum funcionario do sistema");
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.print("Insira o novo cargo do funcionario : ");
                                scan.nextLine();
                                String novoCargoFuncionario = scan.nextLine();
                                mudarCargooFuncionario.setFuncionarioCargo(novoCargoFuncionario);
                                System.out.print("\nCargo modificado com sucesso !");
                            }
                            Thread.sleep(3000);
                            break;
        
        
                        case 4:
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("\n\nMUDAR NOME DO FUNCIONARIO");
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("\n\nInsira o ID do funcionario que voce quer mudar o nome : ");
                            int mudarNomeFuncionario = scan.nextInt();
                            Sistema mudarNomeeFuncionario = sistemaList.stream().filter(x -> x.getFuncionarioID() == mudarNomeFuncionario).findFirst().orElse(null);
                            if(mudarNomeeFuncionario== null){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.print("\nO ID inserido não corresponde a nenhum funcionario do sistema");
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.print("Insira o novo nome do funcionario : ");
                                scan.nextLine();
                                String novoNomeFuncionario = scan.nextLine();
                                mudarNomeeFuncionario.setFuncionarioNome(novoNomeFuncionario);
                                System.out.print("\nNome modificado com sucesso !");
                            }
                            Thread.sleep(3000);
                            break;
        
                        case 5:
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("\n\nPROCURAR FUNCIONARIO PELO ID");
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                            
                            System.out.print("\n\nInsira o ID do funcionario para procura-lo : ");
                            int procurarFuncionarioID = scan.nextInt();
                            Sistema procurarFuncionarioPeloID = sistemaList.stream().filter(x -> x.getFuncionarioID() == procurarFuncionarioID).findFirst().orElse(null);
                            if(procurarFuncionarioPeloID== null){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.print("\nO ID inserido não corresponde a nenhum funcionario do sistema");
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.printf("O funcionario de ID %d foi encontrado com sucesso no sistema", procurarFuncionarioID);
                            }
                            Thread.sleep(3000);
                            break;
            
                        case 6:
                           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                          
                            System.out.print("\n\nAUMENTAR SALARIO DO FUNCINARIO");    
                            System.out.print("\n\nInsira o ID do funcionario para aumentar o seu salario : "); 
                            int procurarID = scan.nextInt();
                            Sistema aumentarSalario =  sistemaList.stream().filter(x -> x.getFuncionarioID() == procurarID).findFirst().orElse(null);
                            if(aumentarSalario == null){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                                
                                System.out.print("\nErro, o funcionario não existe");
                            }                
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                                
                                System.out.print("Insira a porcentagem para aumentar o salario do funcionario : ");
                                double valorPorcentagem = scan.nextDouble();
                                aumentarSalario.percentageCalc(valorPorcentagem);
                                System.out.printf("Salario do funcionario ID %d aumentado com sucesso !", procurarID);
                            }
                            break;

        
                        case 7:
                           System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");                        
                            System.out.println("\n\nDELETAR REGISTRO");
                            System.out.print("\n\nINSIRA A POSIÇÃO QUE VOCE GOSTARIA DE REMOVER : ");
                            int posicaoRegistro = scan.nextInt();
                            int conversor = (posicaoRegistro-1);
                            sistemaList.remove(conversor);
                            System.out.print("\nRemovido com sucesso !!!");
                            break;    
                        
                        case 8:
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.print("\n\nObrigado por utilizar nosso sistema");
                            System.out.print("\n\n");    
                            break;
                        }
        
                }while(choice != 8);
            }

            else {
                System.out.print("Opa, senha errada. Tente novamente amigão");
            }
            
        }while(!senhaAdmin.equals("admin12"));
    }       
 
}
package entities;

public class Sistema{
    private String nomeAdmin; //Nome de quem está acessando
    private String senhaAdmin; //Senha correspondente
    private String funcionarioCargo; //Cargo do funcionario
    private String funcionarioNome; //Nome do funcionario
    private Integer funcionarioID; //ID do funcionario
    private Double funcionarioSalario; //Salario do funcionario

    public Sistema(int funcionarioID, String funcionarioCargo, String funcionarioNome, double funcionarioSalario){
        this.funcionarioID = funcionarioID;
        this.funcionarioCargo = funcionarioCargo;
        this.funcionarioNome = funcionarioNome;
        this.funcionarioSalario = funcionarioSalario;
    }

    public String getFuncionarioCargo(){
        return funcionarioCargo;    
    }

    public void setFuncionarioCargo(String funcionarioCargo){
        this.funcionarioCargo = funcionarioCargo;
    }


    public String getFuncionarioNome(){
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome){
        this.funcionarioNome = funcionarioNome;
    }


    public int getFuncionarioID(){
        return funcionarioID;
    }

    public void percentageCalc(double percentage){
        funcionarioSalario += funcionarioSalario*(percentage/100);
    }

    @Override
    public String toString(){
        return "  ID FUNCIONARIO : " + funcionarioID + "/ CARGO FUNCIONARIO : " + funcionarioCargo+ "/ NOME FUNCIONARIO : " + funcionarioNome+ "/ SALARIO ATUAL DO FUNCIONARIO : " + String.format("R$ %.2f ", funcionarioSalario) + "\n\n";
    }
}
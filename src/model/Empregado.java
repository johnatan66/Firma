package model;
public class Empregado {
	private String  nome;
	private String  cargo;
    private double  salario;
    private double  aumento;

    public Empregado(String nome, String cargo, double salario){
    this.nome      = nome;
    this.cargo     = cargo;
    this.salario   = salario;
    
    }

    public String getnome(){
        return nome;
    }
    public void setnome(String novonome){
        nome = novonome;
    }
    
    public String getcargo() {
    	return cargo;
    }
    
    public void setcargo(String novocargo) {
    	cargo = novocargo;
    }
    public Double getsalario(){
        return salario;
    }
    public void setsalario(Double novosalario){
                salario = novosalario;
    }

    public void aumentarSalario(Double percentual){
            salario = salario + salario*percentual/100;
    }

    public String exibirDado() {
    	return "| o | Funcionario: "+nome+ "\n"+
    		   "| o | cargo      : "+cargo+"\n"+
    		   "| o | salario R$ : "+salario+ "\n"+
    		   "| o | ---------------------------";
    		   
    }

}

import model.Empregado;
import java.util.ArrayList;

public class Folhadepagamento{
    public static void main(String args[]){
        // declarei uma lista de tamanho dinamico
    	
    	ArrayList <Empregado> lista;
    	
    	// como crio a lista?
    	
    	lista = new ArrayList<Empregado>();
    	
    	// para adicionar, uso o metodo ADD
    	lista.add(new Empregado("Isidro","Professor",3000.0));
    	lista.add(new Empregado("Jose","Diretor",4500.0));
    	lista.add(new Empregado("Pedro","Engenheiror",5000.0));
    	
    	// como eu eprcorro a lista?	
    	// neste caso eu defino quanto da lista eu vou percorrer, se do primeiro ao ultimo, se paro no meio, se só os 10 primeiros etc
    	
    	for(int i=0; i < lista.size(); i++) {
    		Empregado e = lista.get(i);
    		System.out.println(e.exibirDado());
    		} 
    	
    	System.out.println(">>> CHEGOU O DICIDIO <<<<");
    	
    	// como eu percorro a lista parte 2
    	// aqui ele percorre a lista toda e só serve para listas
    	
    	for(Empregado e: lista) {
    		e.aumentarSalario(10.0);
    		System.out.println(e.exibirDado());
    	}
    	
    }
}
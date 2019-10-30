package uri1068;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String exp = new String();
		//int pe=0, pd=0;
		int contador=0;
		String resultado;
		int tamanho_da_pilha = 0;
		Queue<String> parenteses = new LinkedList<>();
		
		char pe = ")".charAt(0);
		char pd = "(".charAt(0);		
		
		do {
			exp = ler.nextLine();
			if(exp.length() > 999)
				break;
			else if(exp.length() == 0)
				break;
			else {
				for (int i=0; i<exp.length(); i++) {
					   if(exp.charAt(i) == pe) 
						   parenteses.add(")");
					   else if(exp.charAt(i) == pd)
						   parenteses.add("(");
					   
					}				
			}
			tamanho_da_pilha = parenteses.size();
			for(int s=0; s<tamanho_da_pilha; s++) {
				resultado = parenteses.remove();
				//System.out.println("Valor de s: " + s);
				//System.out.println(parenteses.size());
				
				
				if(contador == 0 && resultado == ")") {
					System.out.println("incorrect");
					contador--;
					//System.out.println(contador);
				}
				else if(resultado == "(") {
					contador++;
					//System.out.println(contador);
				}
				else if(resultado == ")")
					contador--;
			}
			//System.out.println(contador);
			if(contador == 0)
				System.out.println("correct");
			else
				System.out.println("incorrect");
			
		}while(!exp.isEmpty());
		
		ler.close();

	}

}

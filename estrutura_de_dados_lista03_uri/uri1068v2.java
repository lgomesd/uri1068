package estrutura_de_dados_lista03_uri;

import java.util.ArrayList;
import java.util.Scanner;


public class uri1068v2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String exp = new String();
		int contador=0;
		String resultado;
		int tamanho_da_lista = 0;
		ArrayList<String> parenteses = new ArrayList<String>();
		
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
			tamanho_da_lista = parenteses.size();
			for(int s=0; s<tamanho_da_lista; s++) {
				resultado = parenteses.get(s);
				if(s == 0 && resultado == ")") {
					contador = -123123123;
					break;
				}
				else if(resultado == "(") {
					contador++;
				}
				else if(resultado == ")")
					contador--;
			}
			if(contador == 0)
				System.out.print("correct");
			else if(contador == -123123123)
				System.out.print("incorrect");
			else
				System.out.print("incorrect");
			parenteses.clear();
			contador = 0;
			
		}while(!exp.isEmpty());
		
		ler.close();

	}

}

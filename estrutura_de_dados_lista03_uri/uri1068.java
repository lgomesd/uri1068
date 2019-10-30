package estrutura_de_dados_lista03_uri;

import java.util.Scanner;

public class uri1068 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String exp = new String();
		int pe=0, pd=0;
				
//		System.out.println("Entre com a expressão:");
		
		
		do {
			exp = ler.nextLine();
			if(exp.length() > 1000)
				break;
			else {
				if(exp.contains(")") == true)
					pe++;
				else if(exp.contains("("))
					pd++;
			}
			System.out.println("pe " + pe + " pd " + pd);
			
		}while(!ler.nextLine().isEmpty());
			
	}

}

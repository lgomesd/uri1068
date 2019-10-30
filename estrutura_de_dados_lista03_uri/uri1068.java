package estrutura_de_dados_lista03_uri;

import java.util.Scanner;

public class uri1068 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String exp = new String();
		int pe=0, pd=0;
		char pec = ")".charAt(0);
		char pdc = "(".charAt(0);		
		
		do {
			exp = ler.nextLine();
			if(exp.length() > 999)
				break;
			else if(exp.length() == 0)
				break;
			else {
				for (int i=0; i<exp.length(); i++) {
					   if(exp.charAt(i) == pec)
							pe++;
						else if(exp.charAt(i) == pdc)
							pd++;
					}
				
				
			}
			
			if(pd==pe)
				System.out.println("correct");
			else
				System.out.println("incorrect");
			pd = 0;
			pe = 0;
			
		}while(!exp.isEmpty());
		
		ler.close();	
	}

}

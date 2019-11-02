package estrutura_de_dados_lista03_uri;

import java.util.Scanner;
import java.util.Stack;


public class uri1068v2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String exp = new String();
		Stack<String> parentesesd = new Stack<String>();
		Stack<String> parentesese = new Stack<String>();
		Stack<String> parentesesesolto = new Stack<String>();
		char pe = ")".charAt(0);
		char pd = "(".charAt(0);	
		int while_count = 0;
		
		
		do {
			exp = ler.nextLine();
			if(exp.length() > 999)
				break;
			else if(exp.length() == 0)
				break;
			else {
				for (int i=0; i<exp.length(); i++) {
					   if(exp.charAt(i) == pd)
						   parentesesd.push("(");
					   else if(exp.charAt(i) == pe && parentesesd.size() > parentesese.size())
						   parentesese.push(")");
					   else if(exp.charAt(i) == pe && parentesesd.size() <= parentesese.size()) {
						   parentesesesolto.push(")");
					   }
			}
			if(parentesesd.size() != parentesese.size()) {
				System.out.println("incorrect");
				//break;
			}
			else if(parentesesd.size() == parentesese.size() && parentesesesolto.size() == 0)
				System.out.println("correct");
			else if(parentesesesolto.size() != 0)
				System.out.println("incorrect");
			}
			
				
			parentesesd.clear();
			parentesese.clear();
			parentesesesolto.clear();
			while_count++;
		}while(while_count <= 1000);
		ler.close();

	}

}

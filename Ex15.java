package Exercícios_11_12_13;
import java.util.Scanner;

public class Ex15 { 

	public static void main(String[] args) {
		/*5. Faça um Programa que pergunte quanto você ganha por hora e o 
		número de horas trabalhadas no mês. Calcule e mostre o total do seu 
		salário no referido mês, sabendo-se que são descontados 11% para o 
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um 
		programa que nos dê: 
		. 
		salário bruto. 
		a. quanto pagou ao INSS. 
		b. quanto pagou ao sindicato. 
		c. o salário líquido. 
		d. calcule os descontos e o salário líquido, conforme a tabela 
		abaixo: 
		+ Salário Bruto : R$ - IR (11%) : R$ - INSS 
		(8%) : R$ - Sindicato ( 5%) : R$ = Salário 
		Liquido : R$ 
		Obs.: Salário Bruto - Descontos = Salário Líquido.*/
		
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Para calcular o valor líquido do salário, digite: ");
			float valorSalario = scan.nextFloat();
			
			//PARA INSS
			if (valorSalario == 1621.00f ) { 
				//Desconto de 7,5%
				float descontoInss00 = valorSalario*(7.5f/100.00f);
			    float salarioFaixa00 = valorSalario - descontoInss00;
			    System.out.println("Descontado INSS 7,5% = "+ descontoInss00);
			    System.out.println("Valor do sálario = " + salarioFaixa00 );
			    System.out.println("valor iR = " + 0);
		
			    }
			    
			
			 
			
			//PARA INSS
			 if (valorSalario >=1621.01f && valorSalario <=2902.84f  ) {
				// Desconto de 9%
				float descontoInss01 = (1621.00f*7.5f/100.00f) + (valorSalario-1621.00f)*9.00f/100.00f;
				float salarioFaixa01 = valorSalario - descontoInss01;
			    System.out.println("Descontado INSS 9% = " + descontoInss01); 
			    System.out.println("Valor do sálario = " + salarioFaixa01 );
			    System.out.println("valor iR = " + 0);
			     } 
			
			//PARA INSS 
			 if (valorSalario >=2902.85f && valorSalario<=4354.27f) {
				//Desconto de 12%
				float descontoInss02 = (2902.84f-1621.00f)*9.00f/100.00f + (1621.00f*7.5f/100.00f) + (valorSalario-2902.84f)*12.00f/100.00f;
				float salarioFaixa02 = valorSalario - descontoInss02;
				System.out.println("Descontado INSS 12%  = "+ descontoInss02);
				 System.out.println("Valor do sálario = " + salarioFaixa02 );
				    System.out.println("valor iR = " + 0);
				 }
			
			
			 
			 
			 //PARA INSS
			 if (valorSalario >=4354.28f && valorSalario <=8475.55f) { 
				// Desconto de 14%
				float descontoInss03 = (4354.28f-2902.84f)*12.00f/100.00f + (2902.84f-1621.00f)*9.00f/100.00f + (1621.00f*7.5f/100.00f) + (valorSalario-4354.28f)*14.00f/100.00f;
				float salarioFaixa03 = valorSalario - descontoInss03;
				System.out.println("Descontado INSS 14% = " + descontoInss03);
				 System.out.println("Valor do sálario = " + salarioFaixa03 );
				    
	
				//Para IRRF SEM REDUÇÃO
				if(salarioFaixa03 > 7350.01f) {
					System.out.println("Sem redução Mensal");
					//Tabela IRRF
					if (salarioFaixa03 >= 2428.81f && salarioFaixa03 <= 2826.65f) { 
			    		float descontoIR01 =  182.16f;
			    		System.out.println("Desconto Parcela 7,5% = " + descontoIR01 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixa03 - descontoIR01) );
			    	} 
			    	else if (salarioFaixa03 >= 2826.66f && salarioFaixa03 <= 3751.05f ) {
			    		float descontoIR02 =  394.16f;
			    		System.out.println("Desconto Parcela 15% = " + descontoIR02 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixa03 - descontoIR02) );
			    	} 
			    	else if (salarioFaixa03 >= 3751.06f && salarioFaixa03 <=  4664.68f ) {
			    		float descontoIR03 =  675.49f;
			    		System.out.println("Desconto Parcela 22,5% = " + descontoIR03 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixa03 - descontoIR03) );
			    	}
			    	else if (salarioFaixa03 >=  4664.68f ) {
			    		float descontoIR04 =  908.73f;
			    		System.out.println("Desconto Parcela 27,5% = " + descontoIR04 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixa03 - descontoIR04) );
			    	}
				}
				
				//iRRF COM REDUÇÃO
			    if(salarioFaixa03>= 5000.00f && salarioFaixa03 <= 7350.00f) {
			    	float reducaoMensal = (0.133145f*salarioFaixa03)-978.62f;
			    	float salarioReducao = salarioFaixa03 - reducaoMensal;
			    	System.out.println("Valor da salario diminuído redução = " + salarioReducao);
			    	
			    	
			    	//Tabela do IR
			    	if (salarioReducao >= 2428.81f && salarioReducao <= 2826.65f) { 
			    		float descontoIR01 =  182.16f;
			    		System.out.println("Desconto Parcela 7,5% = " + descontoIR01 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioReducao - descontoIR01) );
			    	} 
			    	else if (salarioReducao >= 2826.66f && salarioReducao <= 3751.05f ) {
			    		float descontoIR02 =  394.16f;
			    		System.out.println("Desconto Parcela 15% = " + descontoIR02 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioReducao - descontoIR02) );
			    	} 
			    	else if (salarioReducao >= 3751.06f && salarioReducao <=  4664.68f ) {
			    		float descontoIR03 =  675.49f;
			    		System.out.println("Desconto Parcela 22,5% = " + descontoIR03 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioReducao - descontoIR03) );
			    	}
			    	else if (salarioReducao >=  4664.68f ) {
			    		float descontoIR04 =  908.73f;
			    		System.out.println("Desconto Parcela 27,5% = " + descontoIR04 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioReducao - descontoIR04) );
			    	}
			    	
			    	
			    	
			    } 
			    
			 }
			
			//PARA INSS
			 if (valorSalario > 8475.57) { 
				// Desconto Maximo INSS TETO
				float descontoTeto = (8475.55f-4354.28f)*14.00f/100.00f + (4354.28f-2902.84f)*12.00f/100.00f + (2902.84f-1621.00f)*9.00f/100.00f + (1621.00f*7.5f/100.00f);
				float salarioFaixaTeto = valorSalario - descontoTeto;
				System.out.println("Desconto INSS = " + descontoTeto);
				
				
				//Para IRRF SEM REDUÇÃO
				if(salarioFaixaTeto > 7350.01f) {
					System.out.println("Sem redução Mensal");
					
					// Tabela IR 
					if (salarioFaixaTeto >= 2428.81f && salarioFaixaTeto <= 2826.65f) { 
			    		float descontoIR01 =  182.16f;
			    		System.out.println("Desconto Parcela 7,5% = " + descontoIR01 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixaTeto - descontoIR01) );
			    	} 
			    	else if (salarioFaixaTeto >= 2826.66f && salarioFaixaTeto <= 3751.05f ) {
			    		float descontoIR02 =  394.16f;
			    		System.out.println("Desconto Parcela 15% = " + descontoIR02 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixaTeto - descontoIR02) );
			    	} 
			    	else if (salarioFaixaTeto >= 3751.06f && salarioFaixaTeto <=  4664.68f ) {
			    		float descontoIR03 =  675.49f;
			    		System.out.println("Desconto Parcela 22,5% = " + descontoIR03 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixaTeto - descontoIR03) );
			    	}
			    	else if (salarioFaixaTeto >=  4664.68f ) {
			    		float descontoIR04 =  908.73f;
			    		System.out.println("Desconto Parcela 27,5% = " + descontoIR04 );
			    		System.out.print("Valor do sálario Liquido = " + (salarioFaixaTeto - descontoIR04) );
			    	}
				}
				
				
				
			    	//iRRF COM REDUÇÃO
				    if(salarioFaixaTeto>= 5000.00f && salarioFaixaTeto <= 7350.00f) {
				    	float reducaoMensalTeto = (0.133145f*salarioFaixaTeto)-978.62f;
				    	float salarioReducaoTeto = salarioFaixaTeto - reducaoMensalTeto;
				    	System.out.println("Valor do salario diminuido redução Mensal = " +salarioReducaoTeto);
				    	
				    	//Tabela IR 2026
				    	if (salarioReducaoTeto >= 2428.81f && salarioReducaoTeto <= 2826.65f) { 
				    		float descontoIR01 =  182.16f;
				    		System.out.println("Desconto Parcela 7,5% = " + descontoIR01 );
				    		System.out.print("Valor do sálario Liquido = " + (salarioReducaoTeto - descontoIR01) );
				    		
				    	} 
				    	else if (salarioReducaoTeto>= 2826.66f && salarioReducaoTeto <= 3751.05f ) {
				    		float descontoIR02 =  394.16f;
				    		System.out.println("Desconto Parcela 15% = " + descontoIR02 );
				    		System.out.print("Valor do sálario Liquido = " + (salarioReducaoTeto - descontoIR02) );
				    	} 
				    	else if (salarioReducaoTeto >= 3751.06f && salarioReducaoTeto <=  4664.68f ) {
				    		float descontoIR03 =  675.49f;
				    		System.out.println("Desconto Parcela 22,5% = " + descontoIR03 );
				    		System.out.print("Valor do sálario Liquido = " + (salarioReducaoTeto - descontoIR03) );
				    	}
				    	else if (salarioReducaoTeto >=  4664.68f ) {
				    		float descontoIR04 =  908.73f;
				    		System.out.println("Desconto Parcela 27,5% = " + descontoIR04 );
				    		System.out.print("Valor do sálario Liquido = " + (salarioReducaoTeto - descontoIR04) );
				    	}
				    	
				    	
				    	
				    } 
			    	
			    	
			      }
			    
			    
			    }
			
		
		
			 
			}
		}
				
	
			 
			
	
		
		
		
		
			
			
				
				


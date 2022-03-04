package ExerciciosForWhile;

import java.util.Scanner;

public class Exercicio03 {

	public  static  void  main ( String [] args ) {
		Scanner leia =  new  Scanner ( System.in);

		int idade, contador =  2 , menoridade =  0 , maioridade =  0 ;

		System.out.println( " Digite a 1º Idade " );
		idade = leia.nextInt();

		while (idade !=  - 99 ) {
			System.out.println( " Digite a "  + contador +  " º Idade " );
			idade = leia.nextInt();
			contador ++ ;
			if (idade <  21  && idade >  0 ) {
				menoridade ++ ;
			} else  if (idade >  50 ) {
				maioridade ++ ;
			
				leia.close();
				System.out.println();
				System.out.println( " O numero de pessoas com menos de 21 anos é "  + menoridade);
				System.out.println( " O numero de pessoas com mais de 50 anos e "  + maioridade);

			}
		}
	}

}
programa
{
/*
  1. Escreva um programa para ler 3 valores e escrever o maior deles. Considere que
  o usuário não informará valores iguais
*/
	
	funcao inicio()
	{
		inteiro num1, num2, num3
		
		escreva("Entre com o primeiro valor:")
		leia(num1)
		escreva("Entre com o segundo valor:")
		leia(num2)
		escreva("Entre com o terceiro valor:")
		leia(num3)

		se(num1 > num2 & num1 > num3)
		{
			escreva(num1+" é o meior deles. ")
		} 
		senao se(num2 > num1 & num2 > num3)
		{
			escreva(num2+" é o maior deles.")
		}
		senao se (num3 > num1 & num3 > num2)
		{
			escreva(num3+" é o meior deles")
		}
		senao
		{
			escreva("Entre com valores diferentes")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
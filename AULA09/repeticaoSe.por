programa
{
	
	funcao inicio()
	{
	
	inteiro opcao
	
		escreva("Escolha uma opção")
		escreva("\n")
		leia(opcao)

		se(opcao == 1)
		{
			escreva("Bom dia!")	
		}
		senao se(opcao == 2) 
		{
			escreva("Boa tarde!")
		}
		senao se(opcao == 3)
		{
			escreva("Boa noite!") 
		}
		senao
		{
			escreva("Inválido")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 33; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
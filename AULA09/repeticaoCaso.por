programa
{
	
	funcao inicio()
	{
		inteiro opcao

		escreva("Escolha uma opção")
		escreva("\n")
		
		leia(opcao)

		limpa()

		escolha(opcao)
		{
			caso 1:
				escreva("Bom dia!")
				pare
			caso 2:
				escreva("Boa tarde!")
				pare
			caso 3:
				escreva("Boa noite!")
				pare
			caso contrario:
				escreva("Opção inválida!") 
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 130; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
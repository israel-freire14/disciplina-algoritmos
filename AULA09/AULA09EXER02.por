programa

{
	inclua biblioteca Matematica
	funcao inicio()
	{
		real salario, desconto, salarioReajustado

		escreva("Entre com salário para saber o desconto do IPR")
		leia(salario)

		se(salario <= 2299.00)
		{
			escreva("Não há descontos para esta faixa salarial")
		}
		senao se(salario >= 2300.00 & salario <=4999.00)
		{
			desconto = (salario * 0.075)
			escreva("O desconto do IPR é de: "+ desconto)
		}
		senao se(salario >=5000.00 & salario <= 6999.00)
		{
			desconto = (salario * 0.09)
			escreva("O desconto do IPR é de: "+ desconto)
		}
		senao se(salario >= 7000.00 & salario <= 8999.00)
		{
			desconto = (salario * 0.11)
			escreva("O desconto do IPR é de: "+ desconto)
		}
		senao se (salario >= 9000.00)
		{
			desconto = (salario * 0.14)
			escreva("O desconto do IPR é de: "+ desconto)
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
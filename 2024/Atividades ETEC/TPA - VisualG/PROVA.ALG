Algoritmo "semnome"
Var
km, precoKM, precoD, precoT: real
dias: inteiro
Inicio
escreval("Por quantos dias o carro foi alugado?")
leia(dias)
escreval("Quantos kilometros foram rodados durante esses", dias, " dias?")
leia(km)
precoD <- (dias * 90)
precoKM <- (km * 0.2)
precoT <- (precoD + precoKM)
escreval("O preço pelos dias alugados é R$",precoD,".")
escreval("O preço pelos kilometros rodados é R$",precoKM,".")
escreval("O preço total do aluguel é R$",precoT, ".")
Fimalgoritmo
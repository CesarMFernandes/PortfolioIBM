Algoritmo "exercicio1"
Var
r, h, a: real
Inicio
escreval("Digite o raio da base do seu tanque em metros")
leia(r)
escreval("Agora digite a altura do seu tanque em metros")
leia(h)
a<- 2*pi*r*(r+h)
escreva("Você usará ", a/15, " baldes de tinta, que irão lhe custar R$", a/0.15, ".")
Fimalgoritmo
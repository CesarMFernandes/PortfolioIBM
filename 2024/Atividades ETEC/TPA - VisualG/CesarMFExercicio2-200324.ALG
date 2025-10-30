Algoritmo "exercicio2"

Var
a1, a2, a3, a4, c1, c2, c3, c4, h1, h2, h3, h4, b1, b2, p1, p2: real
Inicio
escreval("Digite o comprimento e altura da primeira parede, nessa ordem")
leia(c1)
leia(h1)
escreval("Agora digite o comprimento e altura da segunda parede")
leia(c2)
leia(h2)
escreval("Agora digite o comprimento e altura da terceira parede")
leia(c3)
leia(h3)
escreval("Agora digite o comprimento e altura da quarta parede, ")
escreval("na qual você irá aplicar a tinta especial")
leia(c4)
leia(h4)
a1<- c1*h1
a2<- c2*h2
a3<- c3*h3
a4<- c4*h4
b1<- (a1+a2+a3)/25
b2<- (a4)/7.5
p1<- b1*80
p2<- b2*150
escreval("Você irá usar ", b1, " latas de tinta comum, que irão lhe custar R$", p1, ".")
escreval("Você irá usar ", b2, " latas de tinta especial, que irão lhe custar R$", p2, ".")
escreva("No total, você irá usar R$", p1+p2, " para pintar as paredes.")
Fimalgoritmo
int pino;
byte mat_num[16][7] = {
{ 1,1,1,1,1,1,0 }, //Digito 0
{ 0,1,1,0,0,0,0 }, //Digito 1
{ 1,1,0,1,1,0,1 }, //Digito 2
{ 1,1,1,1,0,0,1 }, //Digito 3
{ 0,1,1,0,0,1,1 }, //Digito 4
{ 1,0,1,1,0,1,1 }, //Digito 5
{ 1,0,1,1,1,1,1 }, //Digito 6
{ 1,1,1,0,0,0,0 }, //Digito 7
{ 1,1,1,1,1,1,1 }, //Digito 8
{ 1,1,1,0,0,1,1 }, //Digito 9
{ 0,0,0,0,0,0,0 }, //Digito Branco
};
void setup(){
pinMode(2, OUTPUT); //PINO 2 -> segmento A
pinMode(3, OUTPUT); //PINO 3 -> segmento B
pinMode(4, OUTPUT); //PINO 4 -> segmento C
pinMode(5, OUTPUT); //PINO 5 -> segmento D
pinMode(6, OUTPUT); //PINO 6 -> segmento E
pinMode(7, OUTPUT); //PINO 7 -> segmento F
pinMode(8, OUTPUT); //PINO 8 -> segmento G
pinMode(9, OUTPUT); //PINO 9 -> segmento PONTO
}
void loop() {
for(int num = 0; num <=9; num++){
digitalWrite(9,LOW);
mostra(num);
delay(1000);
digitalWrite(9,HIGH);
mostra(10); // apaga display
delay(1000);
}
}
void mostra(int numero){
pino = 2;
for (byte segmentos = 0; segmentos < 7; ++segmentos){
digitalWrite(pino, mat_num[numero][segmentos]);
++pino;
}
}
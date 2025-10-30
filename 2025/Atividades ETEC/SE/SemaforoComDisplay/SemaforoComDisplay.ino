int num;
int seg;
byte mat_num[10][7] = {
  {1, 1, 1, 1, 1, 1, 0},
  {0, 1, 1, 0, 0, 0, 0},
  {1, 1, 0, 1, 1, 0, 1},
  {1, 1, 1, 1, 0, 0, 1},
  {0, 1, 1, 0, 0, 1, 1},
  {1, 0, 1, 1, 0, 1, 1},
  {1, 0, 1, 1, 1, 1, 1},
  {1, 1, 1, 0, 0, 0, 0},
  {1, 1, 1, 1, 1, 1, 1},
  {1, 1, 1, 1, 0, 1, 1},
};
void setup()
{
  pinMode(A0, INPUT);
  pinMode(2, OUTPUT);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  Serial.begin(9600);
}

void loop()
{
  int valor = analogRead(A0);
  int valor100 = map(valor, 0, 1023, 0, 100);
  int num = map(valor, 0, 1023, 0, 9);
  Serial.println(valor100);
  mostrar(num);
  delay(200);
}

void mostrar(int n){
  int pin = 2;
  for(seg = 0; seg<=6; ++seg){
    digitalWrite(pin, mat_num[n][seg]);
    ++pin;
  }
}
boolean estado;
int pin;
void setup()
{
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(6, OUTPUT);
  pinMode(7, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(13, OUTPUT);
  pinMode(14, OUTPUT);
  pinMode(3, INPUT);// BOTÃO
  Serial.begin(9600);
}

void loop()
{
  estado = digitalRead(3);
  if(estado){
    Serial.println("Botao pressionado");
    for(int seq = 1; seq<=3; ++seq){
      for(pin = 4; pin<=14; ++pin){
        digitalWrite(pin, HIGH);
        delay(100);
        digitalWrite(pin, LOW);
      }
      for(pin = 14; pin>=4; --pin){
        digitalWrite(pin, HIGH);
        delay(100);
        digitalWrite(pin, LOW);
      }
    }
    for(int seq = 1; seq<=5; ++seq){
      for(pin = 4; pin<=14; ++pin){
        digitalWrite(pin, HIGH);
      }
      delay(600);
      for(pin = 4; pin<=14; ++pin){
        digitalWrite(pin, LOW);
      }
      delay(600);
    }
  }
}
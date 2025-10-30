#include <Servo.h>

Servo servo;
int pos;
int tom;

void setup (){
  servo.attach(2);
  servo.write(0);
  pinMode(3, OUTPUT);
  pinMode(4, OUTPUT);
  pinMode(5, OUTPUT);
  pinMode(A0, INPUT);
  digitalWrite(5, HIGH);
  delay(1000);
  Serial.begin(9600);
}

void loop(){
  pos = analogRead(A0);
  pos = map(pos, 0, 1023, 0, 180);
  servo.write(pos);
  Serial.println(pos);
  tom = map(pos, 0, 180, 0, 500);
  tone(5, tom);
  if(pos<=90){
    digitalWrite(3, LOW);
    digitalWrite(4, HIGH);
  }
  else{
    digitalWrite(3, HIGH);
    digitalWrite(4, LOW);
  }
}
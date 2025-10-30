#include <Servo.h>
Servo s1;
Servo s2;
const int led = 2;
const int b1 = 3;
const int b2 = 4;
const int b3 = 6;
const int b4 = 7;
const int b5 = 5;
void setup()
{
  pinMode(led, OUTPUT);
  pinMode(b1, INPUT);
  pinMode(b2, INPUT);
  pinMode(b3, INPUT);
  pinMode(b4, INPUT);
  pinMode(b5, INPUT);
  s1.attach(8);
  s2.attach(9);
  s1.write(0);
  s2.write(0);
}

void loop()
{
  digitalWrite(led, digitalRead(b5));
  if(digitalRead(b1)) s1.write(90);
  if(digitalRead(b2)) s1.write(0);
  if(digitalRead(b3)) s2.write(180);
  if(digitalRead(b4)) s2.write(0);
}
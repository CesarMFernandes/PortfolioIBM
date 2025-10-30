int led1 = 6, led2 = 5;
void setup(){
  pinMode(led1, OUTPUT);
  pinMode(led2, OUTPUT);
}
void loop(){
  digitalWrite(led, HIGH);
  delay(50); 
  digitalWrite(led, LOW);
  delay(50); 
  digitalWrite(led2, HIGH);
  delay(50); 
  digitalWrite(led2, LOW);
}
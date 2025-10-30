// C++ code
//
int led = 6, led2 = 4, led3 = 5; 
int ranNum;
void setup()
{
  pinMode(led, OUTPUT);
  pinMode(led2, OUTPUT);
  pinMode(led3, OUTPUT);
}

void loop()
{
ranNum=random(4,7);
 digitalWrite(ranNum, HIGH);
  delay(40);
digitalWrite(ranNum, LOW); 
}
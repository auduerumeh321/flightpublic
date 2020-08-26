

class AirPayment{
String name;
double amount;
long phoneNumber;


AirPayment(){
}

AirPayment(String name,double amount,long phoneNumber){
this.name=name;
this.amount=amount;
this.phoneNumber=phoneNumber;


}

void display(){
System.out.print(name);
System.out.print(amount);
System.out.print(phoneNumber);


}

}

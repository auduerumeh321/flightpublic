
class Application {


public static void main(String[]args){

AirPayment payment = new AirPayment();

payment. name ="john";

payment. amount= 3000.00;

payment. phoneNumber=123456677;

payment. display();


AirPayment payment1 = new AirPayment("john",3000.00,123456677);
payment1.display();

//System.out.print();

AirCustomer customer = new AirCustomer();
customer. name ="mark";

customer. age =28;

customer. display();


AirCustomer customer1 = new AirCustomer("mark",28,42366788);
customer1. display();

//System.out.print();

AirTeller teller1 = new AirTeller ();
teller1. name = "john";
teller1.dateOfBirth="19 july 1988";
teller1.age=30;
teller1.display();


AirTeller teller = new AirTeller("john","19 july 1988",30);
teller.display();

//System.out.print();
}

}







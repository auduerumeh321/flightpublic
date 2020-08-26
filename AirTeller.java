class AirTeller{
String name;
String dateOfBirth;
int age;

AirTeller(){}

AirTeller(String name,String dateOfBirth,int age){
this .name=name;

this.dateOfBirth=dateOfBirth;

this.age=age;

}

void display(){
System.out.print(name);
System.out.print(dateOfBirth);
System.out.print(age);

}

}

//	Scenario : Pay tuition
//	Description : A student wants to pay his tuition through myNEU account.
	Object : Student
		State : name, username, password
		Behavior : login(), viewbill(), payMoneyToWebsite()
	Object : myNEUwebsite
		State : collection of bills
		Behavior : displayBills(), acceptMoneyFromStudent()
	Object : Bill
		State : invoice date, due date, current due, NUID
		Behavior : getDue(), getNUID()
	Object : Money
	    State : amount
	    
class Student{
	String name, username, password;
	void login(inputusername us, inputpassword pw){}
	Bill viewbill(){}
	Money payMoneyToWebsite(myNEUwebsite sw){}
}
class myNEUwebsite{
	Bill[] bills; //array of Bill
	void displayBills(Student s){}
	void acceptMoneyFromStudent(Student s, Money m){}
}
class Bill{
	int invoice date, due date, current due, NUID;
	Int getDue(){}
	Int getNUID(){}
}
class Money{
	int amount;
}

class PayTuition{
	int us, pw;
	public static void main(String args[]){
	myNEUwebsite myneu = new myNEUwebsite();
	Student sang = new Student();
	student.name = "Sangsang";
	sang.login(us, pw);
	Bill bill = sang.viewbill();
	Money money = sang.payMoneyToWebsite(myneu)
	myneu.acceptMoneyFromStudent(sang, money);
	}
}
－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－
//	Scenario : Order for delivery
//	Description : A consumer is going to order a delivery through phone calls.
Object : Consumer
    State : name, address, itemfordelivery
    Behavior : call(), payForOrder()
Object : Deliverycompany
    State : phonenumber
    Behavior : pickup(), acceptMoneyFromConsumer()
Object : Money
    State : amount

class Consumer{
    	String name, address, itemfordelivery;
    	void call(Deliverycompany a){}
    	Money payForOrder(Deliverycompany a){}
    }
class Deliverycompany{
	int phonenumber;
    void pickup(Consumer c){};
    void acceptMoneyFromConsumer(Consumer c, Money money){}
}
class Money{
	float amount;
}

class OrderADelivery{
	public static void main(String args[]){
		Deliverycompany d = new Deliverycompany();
		Consumer sang = new Consumer();
		sang.itemfordelivery="book";
		sang.call(d);
		d.pickup(sang);
		Money money = sang.payForOrder(d)
		d.acceptMoneyFromConsumer(sang, money);
	}
}
－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－
//	Scenario : Booking an Airbnb
//	Description : A tourist wants to book a house on Airbnb app.
Object : Consumer
    State : name
    Behavior : bookAHouse(), payForOrder()
Object : House
    State : price, location
    Behavior : getPrice()
Object : Money
    State : amount

class Consumer{
	String name;
	void bookAHouse(House h){}
	Money payForOrder(House h){}
}
class House{
	int price;
	String location;
	Int getPrice(){}
}
class Money{
	float amount;
}

class BookingAirbnb{
	public static void main(String args[]){
	House h = new House();
	h.location = "seattle";
	Consumer sang = new Consumer();
	sang.name = "Sangsang He";
	sang.bookAHouse(h);
	Money money = sang.payForOrder(h)
}}
－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－
//	Scenario : Travelling to LA
//	Description : A tourist is trying to find the cheapest flight to LA.
Object : Consumer
    State : name
    Behavior : searchforflights(), payForOrder()
Object : Airline
    State : name, price
    Behavior : getPrice()
Object : Money
    State : amount
    
class Consumer{
    	String name;
    	void searchforflights(Airline a){}
    	Money payForOrder(Airline a){}
    }
class Airline{
	String name;
	int price;
	Int getprice(){}
	void acceptMoneyFromConsumer(Consumer c, Money m){}
}
class Money{
	float amount;
}

class TravellingtoLA{
	public static void main(String args[]){
	Consumer sang = new Consumer;
	sang.name = "Sangsang He";
	Airline a = new Airline();
	sang.searchforflights(a);
	Money m = sang.payForOrder(a)
	a.acceptMoneyFromConsumer(sang, m);
	}
}
－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－－
//	Scenario : Drive home
//	Description : A student is driving home from school.
Object : Student
    State : name, address
    Behavior : drive()
Object : Car
    State : brand
       
class Student{
	String name, address;
	void drive(Car car){}
}
class Car{
	String brand;
}

class DriveHome{
public static void main(String args[]){
	Student sang = new Student();
	sang.name = "Sangsang He";
	sang.address = "AMLI 535";
	Car mycar = new Car();
	mycar.brand = "BMW";
	sang.drive(mycar);
}
}
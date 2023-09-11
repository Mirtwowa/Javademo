package org.example;

public class MainClass {


	public static void main(String[] args) {
		FamilyPerson.surname="李";
		FamilyPerson father,sonOne,sonTwo;
		father=new FamilyPerson();
		sonOne=new FamilyPerson();
		sonTwo= new FamilyPerson();
		father.setName("向阳");
		sonOne.setName("抗日");
         sonTwo.setName("抗战");

		System.out.println("父亲："+ father.surname +father.name);
		System.out.println("大儿子："+sonOne.surname+sonOne.name);
		System.out.println("二儿子："+sonTwo.surname+sonTwo.name);
        father.surname="张";
		System.out.println("父亲："+ father.surname +father.name);
		System.out.println("大儿子："+sonOne.surname+sonOne.name);
		System.out.println("二儿子："+sonTwo.surname+sonTwo.name);
	}

}

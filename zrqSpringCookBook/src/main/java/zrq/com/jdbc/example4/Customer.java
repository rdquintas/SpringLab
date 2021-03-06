package zrq.com.jdbc.example4;

import java.sql.Timestamp;

import zrq.com.beans.injection.constructor.SpellChecker;

public class Customer {
	int custId;
	String name;
	int age;

	public Customer() {
	}

	public Customer(int custId, String name, int age) {
		this.custId = custId;
		this.name = name;
		this.age = age;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "ID: " + custId + ", Name: " + name + ", Age: " + age; 
	}

}
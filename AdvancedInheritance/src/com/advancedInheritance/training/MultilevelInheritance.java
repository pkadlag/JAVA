package com.advancedInheritance.training;

class SuperParent {
	public SuperParent() {
		System.out.println("This is CLASS A");
	}
}

class Parent extends SuperParent {
	public Parent() {
		System.out.println("This is Class B");
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("This is class C");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		Child classf = new Child();
	}
}

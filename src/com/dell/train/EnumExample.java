package com.dell.train;

class Container {
	enum sizeOfContainer {
		SMALL, MEDIUM, LARGE
	}

	sizeOfContainer size;
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container newContainer = new Container();
		newContainer.size = Container.sizeOfContainer.LARGE;
		System.out.println(newContainer.size);
	}

}

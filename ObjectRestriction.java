package com.app.corejava.interview;

public class ObjectRestriction {

	private static ObjectRestriction objInstance;
	public static int objCount = 0;

	private ObjectRestriction() {
		objCount++;
	}

	public static ObjectRestriction getInstance() {
		if (objCount < 3) {
			objInstance = new ObjectRestriction();
		}
		return objInstance;

	}

	public static void main(String[] args) {
		ObjectRestriction obj1 = ObjectRestriction.getInstance();
		System.out.println(obj1);

		ObjectRestriction obj2 = ObjectRestriction.getInstance();
		System.out.println(obj2);

		ObjectRestriction obj3 = ObjectRestriction.getInstance();
		System.out.println(obj3);
		
		ObjectRestriction obj4 = ObjectRestriction.getInstance();
		System.out.println(obj4);
	}

}

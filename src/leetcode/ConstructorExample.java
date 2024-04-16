package leetcode;

class College {
	College() {
		System.out.println("College constructor executed");
	}
}

class Department extends College {
	Department() {
		System.out.println("Department constructor executed");
	}
}

class Student extends Department {
	Student() {
		System.out.println("Student constructor executed");
	}
}

public class ConstructorExample {
	public static void main(String ar[]) {
		System.out.println("Order of constructor execution in Multilevel inheritance...");
        new Student();    

	}
}
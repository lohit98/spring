package spring;

import java.util.ArrayList;

public class hello {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(12,"name",40000,new Address("20","hyd","telangana")));
		list.add(new Employee(13,"lohit",70000,new Address("20","hyd","telangana")));
		list.add(new Employee(14,"naksd",60000,new Address("20","hyd","telangana")));
		list.add(new Employee(15,"ram",50000,new Address("20","hyd","telangana")));
		System.out.print(list);
	}
}

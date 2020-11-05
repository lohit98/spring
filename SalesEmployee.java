package spring;

public class SalesEmployee extends Employee {
	private Integer sales;
	private double netSalary;
	private double commision;
	public SalesEmployee(Integer sales,Integer empId, String name, double salary, Address address) {
		super();
		setEmpId(empId);
		setName(name);
		setSalary(salary);
		setAddress(address);
		this.sales = sales;
		calculateSalary();
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double commision) {
		this.commision = commision;
	}
	void calculateSalary()
	{
		
		if(sales<5000)
		{
			commision=getSalary()*(.02);
			netSalary=commision+getSalary();
		}
		else if(sales<10000)
		{
			commision=getSalary()*(.05);
			netSalary=commision+getSalary();
		}
		else if(sales<15000)
		{
			commision=getSalary()*(.07);
			netSalary=commision+getSalary();
		}
		else
		{
			commision=getSalary()*(.15);
			netSalary=commision+getSalary();
		}
	}
	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + ", netSalary=" + netSalary + ", commision=" + commision + "]";
	}
	public static void main(String[] args) {
		SalesEmployee emp=new SalesEmployee(1000,15,"ram",50000,new Address("20","hyd","telangana"));
		System.out.println(emp.getNetSalary());
		
	}
}

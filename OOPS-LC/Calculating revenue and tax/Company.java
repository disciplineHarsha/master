public class Company implements MenuDrivenEntity,TaxPayer {
	private String id;
	private Double expense;
	private Double profit;
	public Company(){
	}
	public Company(String values) {
		String[] val=values.split(",");
    	this.id=val[0];
		this.expense=Double.parseDouble(val[1]);
		this.profit=Double.parseDouble(val[2]);
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getExpense() {
		return expense;
	}
	public void setExpense(Double expense) {
		this.expense = expense;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	@Override
	public Double calculateRevenue() {
		Double revenue=this.getExpense()+this.getProfit();
    	
		
		return revenue;
	}
	@Override
	public Double calculateTax() {
		Double tax= ((this.getProfit()*8)/100);
    	
		
		return tax;
	}
	@Override
	public void displayMenu() {
		  System.out.println("Company menu\n1.Calculate company revenue\n2.Calculate company tax");
	}
	@Override
	public void choiceAction(int choice) {
		switch(choice){
    	case 1:
			System.out.println("Revenue for "+this.getId() +" is " +this.calculateRevenue());
			break;
		case 2:
			System.out.println("Tax for "+this.getId()+ " is " +this.calculateTax());		
		}
	}
}
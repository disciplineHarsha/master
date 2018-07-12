public class Agent implements MenuDrivenEntity,TaxPayer {
	private String id;
	private Double expense;
	private Double commision;
	public Agent(){
	}
	public Agent(String values) {
		String[] val=values.split(",");
    	this.id=val[0];
		this.expense=Double.parseDouble(val[1]);
		this.commision=Double.parseDouble(val[2]);
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
	public Double getCommision() {
		return commision;
	}
	public void setCommision(Double commision) {
		this.commision = commision;
	}
	@Override
	public Double calculateRevenue() {
		Double revenue= this.getExpense()+this.getCommision();
    	return revenue;
	}
	@Override
	public Double calculateTax() {
		Double tax=((this.getCommision()*5)/100);
    	return tax;
	}
	@Override
	public void displayMenu() {
		System.out.println("Agent menu\n1.Calculate agent revenue\n2.Calculate agent tax");
	}
	@Override
	public void choiceAction(int choice) {
		switch(choice){
    	case 1:
			System.out.println("Revenue for "+this.getId() +" is " +this.calculateRevenue());
			break;
		case 2:
			System.out.println("Tax for "+this.getId()+ " is " +this.calculateTax());
			break;
		
		}
	}
}
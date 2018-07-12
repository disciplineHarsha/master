import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of containers :");
		int n = Integer.parseInt(buff.readLine());
		
		Container[] container = new Container[n];

    	//Container c = new Container();
		//Cargo[] cargoDeatils = new Cargo[n];
		//Cargo cargo = new Cargo();
		for (int i = 0; i < n; i++) {
			container[i]=new Container();
			System.out.println("Enter the container " + (i + 1) + " details :");
			String containerDetails = buff.readLine();

			String[] cd = containerDetails.split(",");

			//c.setContainerNumber(cd[0]);
				container[i].setContainerNumber(cd[0]);
			  container[i].setLength(Float.parseFloat(cd[1]));
			  container[i].setWidth(Float.parseFloat(cd[2]));
			  container[i].setHeight(Float.parseFloat(cd[3]));
			  container[i].setWeight(Double.parseDouble(cd[4]));
			 
			/*cargo.setLength(Float.parseFloat(cd[1]));
			cargo.setWidth(Float.parseFloat(cd[2]));
			cargo.setHeight(Float.parseFloat(cd[3]));
			cargo.setWeight(Double.parseDouble(cd[4]));*/

			/*cargoDeatils[i] = cargo.createCargo(cargo.getLength(), cargo.getWidth(), cargo.getHeight(),
					cargo.getWeight());*/
			/*container[i] = new Container(c.getContainerNumber(),cargo.getLength(),cargo.getWidth(),
					cargo.getHeight(),cargo.getWeight());*/

		}

		System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n", "Container Number", "Length", "Width",
				"Height", "Weight");

		for (int i = 0; i < container.length; i++) {
			container[i].displayContainerDetails();

		}
	}
}
import java.sql.Connection;
import java.sql.*;

public class CalculateBill extends History
	{
		private float finalBill;
			
			public float getFinalBill() {
				return finalBill;
			}

			public void setFinalBill(float finalBill) {
				this.finalBill = finalBill;
			}

			public void calculateBill(int Pid, int Qty, String name) throws Exception 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
				Statement st= con.createStatement();
				ResultSet rs= st.executeQuery("SELECT price FROM data WHERE id="+ Pid);
				rs.next();
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
				Statement st3= con2.createStatement();
				ResultSet rs3= st3.executeQuery("SELECT quantity  FROM data WHERE id ="+ Pid);
				rs3.next();
				int stock = rs3.getInt(1);
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con3= DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
				Statement st1= con3.createStatement();
				ResultSet rs2= st1.executeQuery("SELECT name FROM data WHERE id ="+ Pid);
				rs2.next();
				String Product_Name=rs2.getString(1);
				if(Qty<=stock) 
				{
					int price=rs.getInt(1);
					setFinalBill((getFinalBill()+(price*Qty)));
					int uStock=stock-Qty;
					st.executeUpdate(" UPDATE data SET quantity ='"+uStock+"' WHERE id ='"+Pid+"'");
					System.out.println(name+"  your product is added to Cart Successfully");

		//Storing the data for purchase history in History table
					String nameP=rs2.getString(1);
					setPname(nameP);
					setQty(Qty);
					setHisName(name);
					setHistory();
				}
				else 
				{
					System.out.println("-x-x-x-x-x-x-x-x-x-x-x The Quantity you Ordered is not in Stock x-x-x-x-x-x-x-x-x-x-x"+"\n");
					System.out.println("Stock Available with us for "+Product_Name+" is: "+stock);
					System.out.println("Kindly Order Quantity less than or Equal to the Available Stock");
					Thread.sleep(4000);
					UserBuy ub1= new UserBuy();
					ub1.userInterface(name);
				}			}
}

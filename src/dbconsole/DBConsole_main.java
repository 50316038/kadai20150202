package dbconsole;

import java.awt.Label;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Year, Number;
		Label Year1, Number1;
		ResultSet rs;
		
		MySQL mysql = new MySQL();
		rs = mysql.selectAll();
		FrameSystemView frame = new FrameSystemView();
		frame.setBounds(5,5,555,455);
		frame.setVisible(true);

		try {
			while(rs.next()){
				Year = rs.getInt("Year");
				Number = rs.getInt("Number");
				System.out.println("yearÅF" + Year);
				System.out.println("numberÅF" + Number);
				Year1 = new Label(String.valueOf(Year));
				Number1 = new Label(String.valueOf(Number));
				frame.add(new Label("H"));
				frame.add(Year1);
				frame.add(new Label(":"));
				frame.add(Number1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

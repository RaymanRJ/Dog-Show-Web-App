package ca.sheridancollege.customtags;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import ca.sheridancollege.beans.DogBean;

public class BuildHandlerListTag extends SimpleTagSupport {
	
	private ArrayList<DogBean> dogBeans;
	private ArrayList<Integer> currentDogs;
	
	public BuildHandlerListTag() {}
	
	public void setDogBeans(ArrayList<DogBean> dogBeans) {
		this.dogBeans = dogBeans;
	}
	
	public void setCurrentDogs(ArrayList<Integer> currentDogs) {
		this.currentDogs = currentDogs;
	}
	
	public void doTag() throws JspException, IOException{
		JspWriter out = getJspContext().getOut();
		
		for(DogBean db : dogBeans) {
			String dogInfo = "";
			
			dogInfo += "<tr>";
			dogInfo += "<td><input type='checkbox' name='DogNumber' value='";
			dogInfo += db.getDogNumber() + "'";
			
			if (currentDogs.contains(db.getDogNumber())) {
				dogInfo += " checked disabled";
			}

			dogInfo += " /></td>";
			dogInfo += "<td>" + db.getDogNumber() + "</td>";
			dogInfo += "<td>" + db.getOwnerName() + "</td>";
			dogInfo += "<td>" + db.getDogName() + "</td>";
			dogInfo += "<td>" + db.getDogBreed() + "</td>";
			dogInfo += "<td>" + db.getDogGroup() + "</td>";
			dogInfo += "<td>" + db.getDogGender().toString() + "</td>";
			dogInfo += "<td>" + db.getDogSpeciality().toString() + "</td>";
			
			dogInfo += "<td>" + (db.getFriday() == true ? "YES" : "NO") + "</td>";
			dogInfo += "<td>" + (db.getSaturday() == true ? "YES" : "NO") + "</td>";
			dogInfo += "<td>" + (db.getSunday() == true ? "YES" : "NO") + "</td>";
			
			dogInfo += "</tr>";
			
			out.println(dogInfo);
		}
	}

}
/*<tr>
<th>Add?</th>
<th>ID</th>
<th>Owner Name</th>
<th>Dog Name</th>
<th>Breed</th>
<th>Group</th>
<th>Gender</th>
<th>Class/Specialty</th>
<th>Friday</th>
<th>Saturday</th>
<th>Sunday</th>
</tr>
*/
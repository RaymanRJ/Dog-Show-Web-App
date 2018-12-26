package ca.sheridancollege.customtags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import ca.sheridancollege.beans.DogBean;

public class DisplayHandlerDog extends SimpleTagSupport {
	
	private DogBean dogBean;
	
	public DisplayHandlerDog() {}
	
	public void setDogBean(DogBean dogBean) {
		this.dogBean = dogBean;
	}
	
	public void doTag() throws JspException, IOException{
		JspWriter out = getJspContext().getOut();

		String dogInfo = "<tr data-value=" + dogBean.getDogNumber() + ">";
		
		dogInfo += "<td>" + dogBean.getDogNumber() + "</td>";
		dogInfo += "<td>" + dogBean.getOwnerName() + "</td>";
		dogInfo += "<td>" + dogBean.getDogName() + "</td>";
		dogInfo += "<td>" + dogBean.getDogBreed() + "</td>";
		dogInfo += "<td>" + dogBean.getDogGroup() + "</td>";
		dogInfo += "<td>" + dogBean.getDogGender().toString() + "</td>";
		dogInfo += "<td>" + dogBean.getDogSpeciality().toString() + "</td>";
		
		dogInfo += "<td>" + (dogBean.getFriday() == true ? "YES" : "NO") + "</td>";
		dogInfo += "<td>" + (dogBean.getSaturday() == true ? "YES" : "NO") + "</td>";
		dogInfo += "<td>" + (dogBean.getSunday() == true ? "YES" : "NO") + "</td>";
		
		dogInfo += "</tr>";
		
		out.println(dogInfo);
	}

}


/*


<td>${dog.dogNumber }</td>
<td>${dog.ownerName }</td>
<td>${dog.dogName }</td>
<td>${dog.dogBreed }</td>
<td>${dog.dogGroup }</td>
<td>${dog.dogGender.toString() }</td>
<td>${dog.dogSpeciality.toString() }</td>

*/
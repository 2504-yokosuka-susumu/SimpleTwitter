package chapter6.beans;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {

	private int id;
	private int userId;
	private String text;
	private Date createdDate;
	private Date updatedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userid) {
		this.userId = userid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createddate) {
		this.createdDate = createddate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updateddate) {
		this.updatedDate = updateddate;
	}

}

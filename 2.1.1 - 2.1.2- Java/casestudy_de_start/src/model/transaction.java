package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.dbconnection_abstract;

public class transaction extends dbconnection_abstract{
	protected int day, month,tranId, year, ssn, branchCode, count, Value;
	
	protected String fname, lname, eml, t_date;
	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

	protected String cardNo, type, zip;


	//Customer Info
	
	public void setTdate(String t_date) {
		this.t_date=t_date;
	}
	
	public String getTdate() {
		return t_date;
	}
	
	public void setEmail(String eml) {
		this.eml=eml;
	}
	
	public String getEmail() {
		return eml;
	}
	
	
public void setFname(String fname) {
	this.fname=fname;
}

public String getFname() {
	return fname;
}

public void setLname(String lname) {
	this.lname=lname;
}

public String getLname() {
	return lname;
}





public void setTranId(int tranId) {
	this.tranId=tranId;
}

public int getTranId() {
	return tranId;
}




	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public void SetZip(String zip) {
		this.zip=zip;
	}
	
	public String getZip() {
		return zip;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public int getCount() {
		return count;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

public void setDay(int day) {
	this.day = day;
}

public int getDay()
{
	return day;
}

public void setCount(int count) {
	// TODO Auto-generated method stub
	this.count  =      count;
}

}

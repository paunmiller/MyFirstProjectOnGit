package com.db.ShopJPAAplication;
//kj;aljfl;ajfljalkfjal;kdfjlas
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class item {
	
	@Id
	public String itemNumber;
	
	public String Name;
	public double Price;
	public String Type;

}

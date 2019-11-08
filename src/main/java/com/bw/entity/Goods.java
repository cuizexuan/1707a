package com.bw.entity;

public class Goods {
private Integer gid;
private String gname;
private double price;
private Integer sales;
public Integer getGid() {
	return gid;
}
public void setGid(Integer gid) {
	this.gid = gid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Integer getSales() {
	return sales;
}
public void setSales(Integer sales) {
	this.sales = sales;
}
public Goods(Integer gid, String gname, double price, Integer sales) {
	super();
	this.gid = gid;
	this.gname = gname;
	this.price = price;
	this.sales = sales;
}
public Goods() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", sales=" + sales + "]";
}


}
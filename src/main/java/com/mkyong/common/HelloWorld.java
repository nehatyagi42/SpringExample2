package com.mkyong.common;

public class HelloWorld {
private  String Id;
private String Name;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String toString() {
	return "HelloWorld [Id=" + Id + ", Name=" + Name + "]";
}
public void printHello() {
	System.out.println("Display id and name >>>>>>>> Hello ! " + Id +" " + Name);
}
}

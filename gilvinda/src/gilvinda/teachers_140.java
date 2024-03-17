package gilvinda;

import java.util.Scanner;
public class teachers_140 {

	protected String type;
	public void Teaches() {
	System.out.println("The teacher is teaching.");
	}
	}
	class TeacherTeaches extends teachers_140 {
	String name;
	public void
	Subjects(String subject) {
	System.out.println("The teacher " + name + " is teaching " + subject + ".");
	}
	public void setName(String name)
	{
	this.name = name;
	}
	public String getName()
	{
	return name;
	}
	}


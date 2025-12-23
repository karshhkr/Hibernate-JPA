package com.lcwd.hibernate.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name ="student")

public class Student {

	
	//fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentsId;
	@Column(name="student_name",length=100, unique=true)
	private String name;
	@Column(name="Student_college",length=200, nullable=true)
	private String phone;
	private String fatherName;
	private String collegeName;
	private boolean active =true;
	
	@Lob
	private String about;
	
	

// ✅ No-arg constructor (IMPORTANT)
public Student() {
}

// ✅ Getters & Setters
public long getStudentsId() {
    return studentsId;
}

public void setStudentsId(long studentsId) {
    this.studentsId = studentsId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public String getFatherName() {
    return fatherName;
}

public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
}

public boolean isActive() {
    return active;
}

public void setActive(boolean active) {
    this.active = active;
}

public String getAbout() {
    return about;
}

public void setAbout(String about) {
    this.about = about;
}
public String getcollegeName() {
   return collegeName;
   }
   public void setcollegeName(String collegeName) {
	   this.collegeName=collegeName;
   }
}


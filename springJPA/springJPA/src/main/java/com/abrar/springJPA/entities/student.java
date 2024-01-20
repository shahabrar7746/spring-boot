package com.abrar.springJPA.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student",
 uniqueConstraints = @UniqueConstraint (// this sections defines unqiue constraints of table.
		 name = "emailid_unique"  //name would auto generated if none is passed.
		
 ,
 columnNames = "guardian_email"  // consumes a list of columnNames who are set to be unique.
 )
			
			
		
		)
public class student {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO )// used in auto increment
	@Column(name  = "student_id")

	private int id;
	
	
	
	@Column(name  = "student_email")
	public String studentEmail;
	@Column(name  = "student_number")
	public String studentNumber;
	@Column(name  = "student_name")
	public String name;
	@Column(name  = "student_age")
	public int age;
	
	@Embedded// used while defining a class whose data is embedded.
	public guardian Guardian;
	
	
	
	 public String toString() {
		 return studentEmail + " " + studentNumber + " " + name + " " + age + " " + Guardian;
	 }
	

}

package com.abrar.springJPA.entities;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable // used in declaring this class as Embeddable
@AttributeOverrides({ //prevents any changes in DB if column name already exists. in other words prevents conflicts while tables creation, updation, retrival. 
		// 'AttributeOverrides' Annotation consumes a list of 'AttributeOverride'. this 'AttributeOverride' contains requires a 'column' attribute whose column in table should not be affected and a name of declared varible
	
	@AttributeOverride(column = @Column(name = "guardian_name"), name = "name"
				
				),
		@AttributeOverride(column = @Column(name = "guardian_email"), name = "mail"
		
				),
	@AttributeOverride(column = @Column(name = "guardian_number"), name = "number"

				)
}	)
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class guardian {
	public String name;
	public String mail;
	public String number;
	
	public String toString() {
		return name + " " + mail + " " + number;
	}

}

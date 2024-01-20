package boot.spring.Entity;





import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.validation.constraints.*;


@Entity
@Data // defines getter and setter for variables
@Getter //defines Getter methods for each public varible
@NoArgsConstructor //defines No argument constructor 
@AllArgsConstructor //defines all argument constructor
@Builder
public class Department {
	@Id //<-- tells spring that below Variable is Unique Key. 
	@GeneratedValue(strategy = GenerationType.AUTO )// used in auto increment
public int id;
@NotBlank(message = "please add department name")//throws bad request error if the below feild is empty

	public String departmentName;
/*
 * Note:
 * while working with Lombok plugin of spring, make each necessary varible as public	
 */

public  String departmentCode;

}

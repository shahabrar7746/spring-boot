package boot.spring.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "consumerdetails")//defines table name. if no table is there with this name then sprinng will create a table with this name  
public class consumer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )// used in auto increment
@Column(name = "consumerid")
	public int id;
	@Column(name = "password")//<-- defines column properties such as column name, column type, Not null, Auto incrementive
	@GeneratedValue(strategy = GenerationType.AUTO )// used in auto increment
	public String password;
	@Column(name = "email")
	public String email;
	@Column(name = "registrationdate")
	public String date;
	@Column(name = "consumerlocation")
	public String location;
	@Column(name = "name")
	public String name;
	@Column(name = "pincode")
	public String pincode;





}

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
@Table(name = "consumerDetails")
public class consumer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )// used in auto increment
@Column(name = "consumerId")
	public int id;
	@Column(name = "password")

	public String password;
	@Column(name = "email")
	public String email;
	@Column(name = "registrationDate")
	public String date;
	@Column(name = "consumerLocation")
	public String location;
	@Column(name = "name")
	public String name;
	@Column(name = "pincode")
	public String pincode;





}

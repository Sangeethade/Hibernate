import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")

public class Emp1 {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="emp1_id")
	private Long id;
	@Column(name ="emp1_firstname", length=20, nullable = false)
	private String firstname;
	@Column (name ="emp1_lastname", length =20, nullable = false)
	private String lastname;
	@Column (name="emp1_salary")
	private double salary;
	@Column (name="emp1_phone", length=11, unique = true)
	private long phone;
	
    public Long getId(){
    	return id; 
    }
}



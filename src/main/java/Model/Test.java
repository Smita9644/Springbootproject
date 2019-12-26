package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tableone")
public class Test {
	@Id
	private int id;

	public Test() {

	}
}

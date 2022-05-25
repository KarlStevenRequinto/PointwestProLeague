package pointwestproleague.pointwestpowerhouse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// to make sure that this class will be mapped to a database = @Entity
@Entity
public class Employee implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer id;
	private Integer mmr;
	private String name;
	private String alias;
	private String imageUrl;
	private String specialSkill;

//	CONSTRUCTORS
	public Employee(Integer id, Integer mmr, String name, String alias, String imageUrl, String specialSkill) {
		super();
		this.id = id;
		this.mmr = mmr;
		this.name = name;
		this.alias = alias;
		this.imageUrl = imageUrl;
		this.specialSkill = specialSkill;
	}
	
	
//	GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMmr() {
		return mmr;
	}
	public void setMmr(Integer mmr) {
		this.mmr = mmr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getSpecialSkill() {
		return specialSkill;
	}
	public void setSpecialSkill(String specialSkill) {
		this.specialSkill = specialSkill;
	}
	
//	TOSTRING METHOD
	@Override
	public String toString() {
		return "Employee [id=" + id + ", mmr=" + mmr + ", name=" + name + ", alias=" + alias + ", imageUrl=" + imageUrl
				+ ", specialSkill=" + specialSkill + "]";
	}
	
}

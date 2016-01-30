package ehub.api.Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class Category {
	@Id
	private String id;
	private String name;
	private String superCategory;

	public String getSuperCategory() {
		return superCategory;
	}

	public void setSuperCategory(String superCategory) {
		this.superCategory = superCategory;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

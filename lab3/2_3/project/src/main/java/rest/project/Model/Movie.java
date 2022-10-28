package rest.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

	private long id;
	private String title;
	private String releaseYear; 
	
	public Movie() {
		
	}
	
	public Movie(String title, String releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear; 
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "title", nullable = false)
	public String getFirstName() {
		return title;
	}
	public void setFirstName(String title) {
		this.title = title;
	}
	
	@Column(name = "releaseYear", nullable = false)
	public String getLastName() {
		return releaseYear;
	}
	public void setLastName(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	
 

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", release Year=" + releaseYear + "]";
	}
	
}

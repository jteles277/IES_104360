package rest.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quotes")
public class Quote {

	private long id;
	private String content;
	private String movie_id; 
	
	public Quote() {
		
	}
	
	public Quote(String content, String movie_id) {
		this.content = content;
		this.movie_id = movie_id; 
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "content", nullable = false)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Column(name = "movie_id", nullable = false)
	public String getMovieId() {
		return movie_id;
	}
	public void setMovieId(String movie_id) {
		this.movie_id = movie_id;
	}
	 

	@Override
	public String toString() {
		return "Quote [id=" + id + ", content=" + content + ", movie id=" + movie_id + "]";
	}
	
}

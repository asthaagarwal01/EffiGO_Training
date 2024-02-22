package example.learningportal.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
//	@OneToMany(mappedBy = "author")
//	private List<CourseEntity> authoredCourses;

//	@OneToMany(mappedBy = "user_id")
//	private List<EnrollmentEntity> enrollments;

	
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "Created_On", nullable = false, updatable = false)
	private Timestamp createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "Updated_On", nullable = false)
	private Timestamp updatedOn;
	
	public String getPasswordHash() {
		return password;
	}

}

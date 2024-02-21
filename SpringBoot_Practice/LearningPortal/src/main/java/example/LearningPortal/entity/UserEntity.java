package example.LearningPortal.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_Entity", schema = "public")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private Long userId;

	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", nullable = false, updatable = false)
	//@CreationTimestamp
	private Timestamp createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", nullable = false)
	//@UpdateTimestamp
	private Timestamp updatedOn;

	@Enumerated(EnumType.STRING)
	private UserRole role;

	@OneToMany(mappedBy = "author")
	private List<CourseEntity> authoredCourses;

	@OneToMany(mappedBy = "learner")
	private List<EnrollmentEntity> enrollments;

	@OneToMany(mappedBy = "learner")
	private List<FavoriteEntity> favorites;

	public String getPasswordHash() {
		return password;
	}
}

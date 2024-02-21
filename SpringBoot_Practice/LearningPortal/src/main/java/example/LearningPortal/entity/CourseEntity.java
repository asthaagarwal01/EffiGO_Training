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
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course_Entity", schema = "public")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "courseId")
	private Long courseId;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_on", nullable = false, updatable = false)
	//@CreationTimestamp
	private Timestamp createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_on", nullable = false)
	//@UpdateTimestamp
	private Timestamp updatedOn;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private UserEntity author;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;

	@OneToMany(mappedBy = "course")
	private List<EnrollmentEntity> enrollments;

	@OneToMany(mappedBy = "course")
	private List<FavoriteEntity> favorites;
}

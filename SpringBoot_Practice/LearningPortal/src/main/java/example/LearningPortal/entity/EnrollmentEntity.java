package example.learningportal.entity;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "enrollments")
public class EnrollmentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="enrollmentId")
	private long enrollmentId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity learner;

	
	@ManyToOne
	@JoinColumn(name="course_id")
	private CourseEntity course;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="created_on", updatable=false, nullable=false)
	private LocalDateTime createdOn;
	
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name="updated_on",nullable=false)
	private LocalDateTime updatedOn;
}

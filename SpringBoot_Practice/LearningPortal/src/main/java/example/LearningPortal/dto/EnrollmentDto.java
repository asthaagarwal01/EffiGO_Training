package example.learningportal.dto;

import java.sql.Timestamp;

import example.learningportal.entity.CourseEntity;
import example.learningportal.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentDto {
	private Long enrollment_id;
	private UserEntity userId;
    private CourseEntity course_id;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}

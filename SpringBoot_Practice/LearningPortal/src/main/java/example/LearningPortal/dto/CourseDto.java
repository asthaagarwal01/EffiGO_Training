package example.learningportal.dto;

import java.sql.Timestamp;

import example.learningportal.entity.CategoryEntity;
import example.learningportal.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
	private Long course_id;
	private String title;
	private String description;
	private UserEntity userId;
	private CategoryEntity category;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}

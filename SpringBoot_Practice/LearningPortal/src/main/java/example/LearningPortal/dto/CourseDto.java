package example.LearningPortal.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseDto {
	private Long courseId;
	private String title;
	private String description;
	private Long authorId;
	private String category;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}

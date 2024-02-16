package example.LearningPortal.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDto {
	private Long courseId;
    private String title;
    private String description;
    private Long authorId;
    private String category;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}

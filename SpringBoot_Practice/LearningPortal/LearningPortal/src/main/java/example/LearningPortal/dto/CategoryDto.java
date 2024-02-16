package example.LearningPortal.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
	private Long categoryId;
	private String name;
	private LocalDateTime createdOn;
	private LocalDateTime updatedOn;
}

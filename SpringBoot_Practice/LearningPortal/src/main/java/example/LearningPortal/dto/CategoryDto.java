package example.LearningPortal.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto {
	private Long categoryId;
	private String name;
	private Timestamp createdOn;
	private Timestamp updatedOn;

}

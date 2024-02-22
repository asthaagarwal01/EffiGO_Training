package example.learningportal.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto {
	private String category_id;
	private String name;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}

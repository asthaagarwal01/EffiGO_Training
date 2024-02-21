package example.LearningPortal.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FavoriteDto {
	private long favoriteId;
	private long learnerId;
	private long courseId;
	private Timestamp createdOn;
	private Timestamp updatedOn;
}

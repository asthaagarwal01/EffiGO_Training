package example.LearningPortal.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteDto {
	private Long favoriteId;
    private Long learnerId;
    private Long courseId;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
}

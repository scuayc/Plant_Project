package Plant.PlantProject.dto;

import Plant.PlantProject.Entity.Notification;
import Plant.PlantProject.Entity.Status;
import Plant.PlantProject.Entity.TradeBoard;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class NotificationDto {
    private Long id;
    private String nTitle;
    private String nContents;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder
    public NotificationDto(Long id, String nTitle, String nContents, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.nTitle = nTitle;
        this.nContents = nContents;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Notification toEntity() {
        return Notification.builder()
                .id(id)
                .nTitle(nTitle)
                .nContents(nContents)
                .createdAt(createdAt)
                .updatedAt(updatedAt)
                .build();
    }
}



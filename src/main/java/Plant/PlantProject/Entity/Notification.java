package Plant.PlantProject.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String nTitle;

    @Column(name = "message")
    private String nContents;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Builder
    public Notification(Long id, String nTitle, String nContents, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.nTitle = nTitle;
        this.nContents = nContents;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

}

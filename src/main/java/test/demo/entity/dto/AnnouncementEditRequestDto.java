package test.demo.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnnouncementEditRequestDto {
    private Long id;
    private String title;
    private String description;
}

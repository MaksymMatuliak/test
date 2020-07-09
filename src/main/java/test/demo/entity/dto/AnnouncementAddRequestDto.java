package test.demo.entity.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnnouncementAddRequestDto {
    private String title;
    private String description;
}

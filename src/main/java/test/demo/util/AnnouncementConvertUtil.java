package test.demo.util;

import org.springframework.stereotype.Component;
import test.demo.entity.Announcement;
import test.demo.entity.dto.AnnouncementAddRequestDto;
import test.demo.entity.dto.AnnouncementEditRequestDto;

@Component
public class AnnouncementConvertUtil {
    public Announcement addRequestDtoToEntity(AnnouncementAddRequestDto announcementAddRequestDto) {
        Announcement announcement = new Announcement();
        announcement.setDescription(announcementAddRequestDto.getDescription());
        announcement.setTitle(announcementAddRequestDto.getTitle());
        return announcement;
    }

    public Announcement editRequestDtoToEntity(
            AnnouncementEditRequestDto announcementEditRequestDto) {
        Announcement announcement = new Announcement();
        announcement.setId(announcementEditRequestDto.getId());
        announcement.setDescription(announcementEditRequestDto.getDescription());
        announcement.setTitle(announcementEditRequestDto.getTitle());
        return announcement;
    }
}

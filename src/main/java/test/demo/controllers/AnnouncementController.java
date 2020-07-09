package test.demo.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import test.demo.entity.Announcement;
import test.demo.entity.dto.AnnouncementAddRequestDto;
import test.demo.entity.dto.AnnouncementEditRequestDto;
import test.demo.service.AnnouncementService;
import test.demo.util.AnnouncementConvertUtil;

@RestController
@RequestMapping("/announcement")
public class AnnouncementController {
    private final AnnouncementService announcementService;
    private final AnnouncementConvertUtil announcementConvertUtil;

    public AnnouncementController(AnnouncementService announcementService,
                                  AnnouncementConvertUtil announcementConvertUtil) {
        this.announcementService = announcementService;
        this.announcementConvertUtil = announcementConvertUtil;
    }

    @PostMapping
    public void addAnnouncement(@RequestBody AnnouncementAddRequestDto announcementAddRequestDto) {
        announcementService.add(
                announcementConvertUtil.addRequestDtoToEntity(announcementAddRequestDto));
    }

    @DeleteMapping("/{id}")
    public void deleteAnnouncement(@PathVariable Long id) {
        announcementService.delete(id);
    }

    @PatchMapping
    public void editAnnouncement(
            @RequestBody AnnouncementEditRequestDto announcementEditRequestDto) {
        announcementService.edit(
                announcementConvertUtil.editRequestDtoToEntity(announcementEditRequestDto));
    }

    @GetMapping
    public List<Announcement> getAllAnnouncement() {
        return announcementService.getAll();
    }
}

package test.demo.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import test.demo.entity.Announcement;
import test.demo.repository.AnnouncementRepository;
import test.demo.service.AnnouncementService;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    private final AnnouncementRepository announcementRepository;

    public AnnouncementServiceImpl(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    @Override
    public Announcement add(Announcement announcement) {
        announcement.setDate(LocalDateTime.now());
        return announcementRepository.save(announcement);
    }

    @Override
    public void edit(Announcement announcement) {
        announcementRepository.save(announcement);
    }

    @Override
    public void delete(Long id) {
        announcementRepository.deleteById(id);
    }

    @Override
    public List<Announcement> getAll() {
        return announcementRepository.findAll();
    }
}

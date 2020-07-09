package test.demo.service;

import java.util.List;
import test.demo.entity.Announcement;

public interface AnnouncementService {
    Announcement add(Announcement announcement);

    void edit(Announcement announcement);

    void delete(Long id);

    List<Announcement> getAll();
}

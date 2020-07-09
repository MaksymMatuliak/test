package test.demo.repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.demo.entity.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}

package kr.co.rland.boot3.repository;

import java.sql.SQLException;
import java.util.List;
import kr.co.rland.boot3.entity.Notice;

public interface NoticeRepository {
    List<Notice> findAll();
}

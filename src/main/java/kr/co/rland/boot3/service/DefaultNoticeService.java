package kr.co.rland.boot3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.rland.boot3.entity.Notice;
import kr.co.rland.boot3.repository.NoticeRepository;

@Service
public class DefaultNoticeService implements NoticeService{

    @Autowired
    private NoticeRepository repository;

    @Override
    public List<Notice> getList() {
        //List<Notice> notices = repository.findAll();
        return null;//notices; //repository.findAll();
    }
    
}

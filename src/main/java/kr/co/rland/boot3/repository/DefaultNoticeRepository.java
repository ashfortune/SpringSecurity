package kr.co.rland.boot3.repository;

import java.util.List;

import kr.co.rland.boot3.entity.Notice;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


// @Component
//@Repository
public class DefaultNoticeRepository implements NoticeRepository {

    @Override
    public List<Notice> findAll() {
        List<Notice> list = new ArrayList<>();

//        list.add(new Notice(1, "서블릿이란", ""));
//        list.add(new Notice(2, "jsp 란", ""));
//        list.add(new Notice(3, "스프링이란", ""));

        return list;
    }
    
}

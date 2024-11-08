package kr.co.rland.boot3.repository;

import kr.co.rland.boot3.entity.MenuImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuImageRepository {
    List<MenuImage> findAllByMenuId(Long id);

    void saveAll(List<MenuImage> images);
}

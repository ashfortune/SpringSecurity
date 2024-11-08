package kr.co.rland.boot3.repository;

import kr.co.rland.boot3.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryRepository {
    List<Category> findAll();
}

package kr.co.rland.boot3.repository;

import kr.co.rland.boot3.entity.Menu;
import kr.co.rland.boot3.entity.MenuView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuRepository {
    //@Select("SELECT * FROM MENU")
    List<MenuView> findAllByCategoryIdAndQuery(Integer offset, Integer size, List<Integer> categoryIds, String query);
//    List<MenuView> findAllWithImages(Integer categoryId, String query);

    void save(Menu menu);

    Menu findById(Long id);

    void deleteById(Long id);
}

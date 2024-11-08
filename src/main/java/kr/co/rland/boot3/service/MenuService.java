package kr.co.rland.boot3.service;

import kr.co.rland.boot3.dto.MenuRegDto;
import kr.co.rland.boot3.entity.Menu;
import kr.co.rland.boot3.entity.MenuView;
import kr.co.rland.boot3.model.MenuDetailModel;

import java.util.List;

public interface MenuService {
    List<MenuView> getList(Integer page);
    List<MenuView> getList(Integer page, List<Integer> categoryIds);
    List<MenuView> getList(Integer page, List<Integer> categoryIds, String query);
    List<MenuView> getListWithImages(Integer page, List<Integer> categoryIds, String query);

    void reg(MenuRegDto menuDto);

    Menu getById(Long id);

    MenuDetailModel getDetailById(Long id);

    void deleteById(Long id);
}

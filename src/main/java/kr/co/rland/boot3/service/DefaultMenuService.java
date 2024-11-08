package kr.co.rland.boot3.service;


import kr.co.rland.boot3.dto.MenuRegDto;
import kr.co.rland.boot3.entity.Menu;
import kr.co.rland.boot3.entity.MenuImage;
import kr.co.rland.boot3.entity.MenuView;
import kr.co.rland.boot3.entity.RcmdMenuView;
import kr.co.rland.boot3.model.MenuDetailModel;
import kr.co.rland.boot3.repository.MenuImageRepository;
import kr.co.rland.boot3.repository.MenuRepository;
import kr.co.rland.boot3.repository.RcmdMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DefaultMenuService implements MenuService{

    @Autowired
    private MenuRepository repository;
    @Autowired
    private MenuImageRepository menuImageRepository;
    @Autowired
    private RcmdMenuRepository rcmdMenuRepository;

    @Override
    public List<MenuView> getList(Integer page) {
        List<MenuView> menus = getList(1,null, null);
        return menus;
    }

    @Override
    public List<MenuView> getList(Integer page, List<Integer> categoryIds) {
        List<MenuView> menus = getList(1, categoryIds, null);
        return menus;
    }

    @Override
    public List<MenuView> getList(Integer page, List<Integer> categoryIds, String query) {

        // P:1->0, P:2->5, P:3->10, P:4->15, 20, ....
        int size = 5;
        int offset = (page - 1) * size;

        List<MenuView> menus = repository.findAllByCategoryIdAndQuery(offset, size, categoryIds, query);

        return menus;
    }

    @Transactional
    @Override
    public List<MenuView> getListWithImages(Integer page, List<Integer> categoryIds, String query) {

        int size = 5;
        int offset = (page - 1) * size;

        List<MenuView> menus = repository.findAllByCategoryIdAndQuery(offset, size, categoryIds, query);

        for(MenuView menu : menus)
            menu.setImages(menuImageRepository.findAllByMenuId(menu.getId()));

        return menus;
    }

    @Override
    public void reg(MenuRegDto menuDto) {
        Menu menu = menuDto.getMenu();
        List<MenuImage> images = menuDto.getImages();

        repository.save(menu); // xml : insert
//        for(MenuImage image : images)
//            menuImageRepository.save(image);

        menuImageRepository.saveAll(images);
    }

    @Override
    public Menu getById(Long id) {

        Menu menu = repository.findById(id);

        return menu;
    }

    @Override
    public MenuDetailModel getDetailById(Long id) {

        Menu menu = repository.findById(id);
        List<MenuImage> images = menuImageRepository.findAllByMenuId(id);
        List<RcmdMenuView> rcmdMenus = rcmdMenuRepository.findAllByMenuId(id);

        MenuDetailModel model = MenuDetailModel
                .builder()
                .menu(menu)
                .images(images)
                .rcmdMenus(rcmdMenus)
                .build();

        return model;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

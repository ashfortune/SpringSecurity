package kr.co.rland.boot3.service;

import kr.co.rland.boot3.entity.MenuImage;
import kr.co.rland.boot3.entity.MenuView;
import kr.co.rland.boot3.repository.MenuImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMenuImageService implements MenuImageService{

    @Autowired
    private MenuImageRepository repository;

    @Override
    public List<MenuImage> getListByMenuId(Long menuId) {
        return repository.findAllByMenuId(menuId);
    }
}

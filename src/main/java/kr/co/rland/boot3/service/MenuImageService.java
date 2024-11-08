package kr.co.rland.boot3.service;

import kr.co.rland.boot3.dto.MenuRegDto;
import kr.co.rland.boot3.entity.Menu;
import kr.co.rland.boot3.entity.MenuImage;
import kr.co.rland.boot3.entity.MenuView;
import kr.co.rland.boot3.model.MenuDetailModel;

import java.util.List;

public interface MenuImageService {
    List<MenuImage> getListByMenuId(Long menuId);
}

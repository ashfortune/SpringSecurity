package kr.co.rland.boot3.model;

import kr.co.rland.boot3.entity.Menu;
import kr.co.rland.boot3.entity.MenuImage;
import kr.co.rland.boot3.entity.RcmdMenuView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuDetailModel {
    private Menu menu;
    private List<MenuImage> images;
    private List<RcmdMenuView> rcmdMenus;
}
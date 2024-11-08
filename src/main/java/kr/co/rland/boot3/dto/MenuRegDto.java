package kr.co.rland.boot3.dto;

import kr.co.rland.boot3.entity.Menu;
import kr.co.rland.boot3.entity.MenuImage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuRegDto {
    private Menu menu;
    private List<MenuImage> images;

}

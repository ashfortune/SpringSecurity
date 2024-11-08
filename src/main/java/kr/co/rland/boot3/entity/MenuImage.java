package kr.co.rland.boot3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MenuImage {
    private Long id;
    private String src;
    private Long menuId;
    private Boolean isDefault;
}

package kr.co.rland.boot3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuView {
    private long id;
    private String korName;
    private String engName;
    private int price;
    private Date regDate;
    private long categoryId;
    private long regMemberId;
    private String categoryName;
    private String img;

    private List<MenuImage> images;
}

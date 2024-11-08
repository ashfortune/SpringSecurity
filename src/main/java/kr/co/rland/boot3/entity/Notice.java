package kr.co.rland.boot3.entity;

import lombok.*;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notice {
    private long id;
    private String title;
    private String content;
    private Date regDate;
    private Date updateDate;
    private int hitCount;
    private long regMemberId;

//    @Builder
//    public Notice(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }

}

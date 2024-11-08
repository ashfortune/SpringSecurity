package kr.co.rland.boot3.repository;//package com.newlecture.web.class8th.repository;
//
//import com.newlecture.web.class8th.entity.Menu;
//import com.newlecture.web.class8th.entity.Notice;
//import org.springframework.stereotype.Repository;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
////@Repository
//public class JdbcMenuRepository implements MenuRepository {
//
//    @Override
//    public List<Menu> findAll() {
//        List<Menu> menus = new ArrayList<Menu>();
//
//        String url = "jdbc:oracle:thin:@//hi.newlecture.com:1521/XEPDB1";
//        String sql = "SELECT * FROM MENU"; // 바뀌는 내용
//
//        try (
//                Connection conn = DriverManager.getConnection(url,"rland","0530");
//                Statement stmt = conn.createStatement();
//                ResultSet rs = stmt.executeQuery(sql);
//        ) {
//            while (rs.next()) {
//                long id = rs.getLong(1);
//                String korName = rs.getString("KOR_NAME");
//                String engName = rs.getString("ENG_NAME");
//                int price = rs.getInt("PRICE");
//                String img = rs.getString("IMG");
//                Date regDate = rs.getDate("REG_DATE");
//                int categoryId = rs.getInt("CATEGORY_ID");
//                int regMemberId = rs.getInt("REG_MEMBER_ID");
//
//
//                Menu menu = Menu.builder()
//                        .id(id)
//                        .korName(korName)
//                        .engName(engName)
//                        .price(price)
//                        .img(img)
//                        .regDate(regDate)
//                        .categoryId(categoryId)
//                        .regMemberId(regMemberId)
//                        .build();
//                menus.add(menu);
//
//
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        return menus;
//    }
//
//    @Override
//    public List<Menu> findAll(Integer categoryId) {
//        return List.of();
//    }
//}

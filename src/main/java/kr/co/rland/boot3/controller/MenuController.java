package kr.co.rland.boot3.controller;

import kr.co.rland.boot3.entity.Category;
import kr.co.rland.boot3.entity.MenuView;
import kr.co.rland.boot3.service.CategoryService;
import kr.co.rland.boot3.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("menu")
public class MenuController {

    @Autowired
    private MenuService service;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("list")
    public String list(

            @RequestParam(name="p", defaultValue = "1")
            Integer page,

            @RequestParam(name = "c", required = false)
            List<Integer> categoryIds,

            @RequestParam(name="q", required = false)
            String query,
            // Integer page,
            Model model) {

        List<Category> categories  = categoryService.getList();
//        List<Menu> menus = service.getListByCategory(categoryId);
//        List<Menu> menus = service.getListOfPageByCategory(categoryId);
//        List<Menu> menus = service.getList();

        List<MenuView> menus = service.getList(page, categoryIds, query);

        model.addAttribute("categories", categories);
        model.addAttribute("menus", menus);

        return "menu/list";
    }
}

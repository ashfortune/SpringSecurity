package kr.co.rland.boot3.service;

import kr.co.rland.boot3.entity.Category;
import kr.co.rland.boot3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCategoryService implements CategoryService{
    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> getList() {
        List<Category> list = repository.findAll();
        return list;
    }
}

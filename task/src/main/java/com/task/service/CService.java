package com.task.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.task.model.cat;
import com.task.repository.CRepository;

@Service
public class CService {
    @Autowired
    private CRepository categoryRepository;

    public List<cat> getAllCategories() {
        return categoryRepository.findAll();
    }

    public cat getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public cat createCategory(cat category) {
        return categoryRepository.save(category);
    }

    public cat updateCategory(cat category) {
        return categoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
    public List<cat> getAllCategories(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<cat> categoryPage = categoryRepository.findAll(pageable);
        return categoryPage.getContent();
    }
}



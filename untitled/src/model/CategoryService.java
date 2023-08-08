package model;

import repository.CategoryRepository;

public class CategoryService {

    private CategoryRepository categoryRepository;


    public Category findCategoryByName(String name) {

        for (Category category : categoryRepository.getCategory()) {
            if (category.getName().equals(name)) {
                return category;
            }
        }
        return null;

    }





}

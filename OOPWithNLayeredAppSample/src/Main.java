import Businnes.CategoryManager;
import Entities.Category;

public class Main {

    public static void main(String[] args) {
        Category yazilim = new Category(1, "yazilim");
        Category edebiyat = new Category(2, "edebiyat");
        Category fen = new Category(3, "fen");
        Category yapay_zeka = new Category(4, "yapay_zeka");
        
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(yazilim);
        categoryManager.add(edebiyat);
        categoryManager.add(fen);
        categoryManager.add(yapay_zeka);

        categoryManager.getAllCategoryNames();
        categoryManager.delete(yapay_zeka);
        categoryManager.getAllCategoryNames();
        
    }
}

package com.pb.bolshakov.hw7;

public class DressMakingStudio {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда в наличии:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда в наличии:");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}

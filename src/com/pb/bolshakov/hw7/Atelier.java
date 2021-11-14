package com.pb.bolshakov.hw7;

public class Atelier {
    public static void main(String[] args) {
    Clothes[] clothes = {
            new Tshirt(Sizes.XS, "темно-коричнеый", 450),
            new Tshirt(Sizes.L, "болый", 340),
            new Pants(Sizes.M, "черный", 550),
            new Pants(Sizes.XXS, "синий", 250),
            new Skirt(Sizes.S, "голубой", 450),
            new Skirt(Sizes.M, "красный", 600),
            new Tie(Sizes.L, "синий", 320),
            new Tie(Sizes.L, "жёлтый", 370),
    };

    DressMakingStudio studio = new DressMakingStudio();
    studio.dressMan(clothes);
    System.out.println();
    studio.dressWomen(clothes);
        System.out.println();
}
}
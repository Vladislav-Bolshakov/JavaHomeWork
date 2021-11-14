package com.pb.bolshakov.hw7;

public enum Sizes {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    Sizes (int getEuroSize) {
        EuroSize = getEuroSize;
    }


    public String getDescription() {
        return "взрослый размер";
    }

    @Override
    public String toString() {
        return name() + "(" + EuroSize + ") " + getDescription();
    }

    private int EuroSize;
}
package com.example.recyclerview12102022;

public enum ServiceType {
    RESTAURANT("Nhà hàng"),
    BIRTH_DAY("Sinh Nhật"),
    FAMILY("Gia Đình"),
    GROUP("Hội Nhóm"),
    SHOP_ONLINE("Shop Online"),
    STREET_FOOD("Đồ Ăn Đường Phố"),
    BUFFET("Buffer");

    private final String name;

    ServiceType(String s){
        name = s;
    }

    public String toString(){
        return name;
    }

}

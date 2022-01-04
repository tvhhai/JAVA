package com.company.designpattern.structural.adapter;

public class Adapter4 {
    public static void main(String[] args) {
        BuilderImplementation builderImpl = new BuilderImplementation();

        builderImpl.build("Nhà", "trung tâm");
        builderImpl.build("Tòa nhà chọc trời", "trung tâm thành phố");
        builderImpl.build("Tòa nhà chọc trời", "vùng ngoại ô");
        builderImpl.build("Khách sạn", "trung tâm thành phố");
        System.out.println("-------------------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}

interface Builder {
    void build(String type, String location);
}

interface AdvancedBuilder {
    void buildHouse(String location);

    void buildSkyScrapper(String location);
}

class HouseBuilder implements AdvancedBuilder {
    @Override
    public void buildHouse(String location) {
        System.out.println("Xây dựng một ngôi nhà nằm trong khu vực " + location  );
    }

    @Override
    public void buildSkyScrapper(String location) {
    }
}

class SkyscrapperBuilder implements AdvancedBuilder {
    @Override
    public void buildHouse(String location) {
    }

    @Override
    public void buildSkyScrapper(String location) {
        System.out.println("Xây dựng một tòa nhà chọc trời trong khu vực " + location);
    }
}

class BuilderAdapter implements Builder {
    AdvancedBuilder advancedBuilder;

    public BuilderAdapter(String type) {
        if (type.equalsIgnoreCase("Nhà")) {
            advancedBuilder = new HouseBuilder();
        } else if (type.equalsIgnoreCase("Tòa nhà chọc trời")) {
            advancedBuilder = new SkyscrapperBuilder();
        }
    }

    @Override
    public void build(String type, String location) {
        if (type.equalsIgnoreCase("Nhà")) {
            advancedBuilder.buildHouse(location);
        } else if (type.equalsIgnoreCase("Tòa nhà chọc trời")) {
            advancedBuilder.buildSkyScrapper(location);
        }
    }
}

class BuilderImplementation implements Builder {
    BuilderAdapter builderAdapter;

    @Override
    public void build(String type, String location) {
        if (type.equalsIgnoreCase("Nhà") || type.equalsIgnoreCase("Tòa nhà chọc trời")) {
            builderAdapter = new BuilderAdapter(type);
            builderAdapter.build(type, location);
        } else {
            System.out.println("Loại tòa nhà không hợp lệ.");
        }
    }
}
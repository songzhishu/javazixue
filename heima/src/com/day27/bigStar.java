package com.day27;

public class bigStar implements star {
    private String name;

    //唱歌
    @Override
    public String sing(String songname){
        System.out.println(this.name+"正在唱"+songname);
        return "谢谢";
    }
    //跳舞
    @Override
    public void dance(String name){
        System.out.println(this.name+"正在跳舞");
    }

    public bigStar() {
    }

    public bigStar(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "bigStar{name = " + name + "}";
    }
}

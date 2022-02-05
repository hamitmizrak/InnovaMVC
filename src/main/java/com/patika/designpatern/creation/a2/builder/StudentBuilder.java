package com.patika.designpatern.creation.a2.builder;

public class StudentBuilder {

    private String adi;
    private String soyadi;

    public  StudentBuilder(){
    }

    public  StudentBuilder(Builder builder){
        this.adi=builder.adi;
        this.soyadi=builder.soyadi;
    }

    //getter and setter
    public String getAdi() {
        return adi;
    }

    public StudentBuilder setAdi(String adi) {
        this.adi = adi;
        return this;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public StudentBuilder setSoyadi(String soyadi) {
        this.soyadi = soyadi;
        return this;
    }

    //inner class
    public static class Builder{
        private String adi;
        private String soyadi;

        public Builder() {
        }

        public Builder adi(String adi){
            this.adi=adi;
            return this;
        }

        public Builder soyadi(String soyadi){
            this.soyadi=soyadi;
            return this;
        }

        public StudentBuilder build(){
            return  new StudentBuilder(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "adi='" + adi + '\'' +
                    ", soyadi='" + soyadi + '\'' +
                    '}';
        }
    }
}

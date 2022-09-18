package ru.mirea.kvbo1.khabarova;

public enum Seasons {
    WINTER(-10), SRINGS(15), SUMMER(25){
        @Override
        public String getDescrption() {
            return "Тёплое время года";
        }
    }, AUTUMN(5);
    private double avgTemp;
    Seasons(double avgTemp){
        this.avgTemp= avgTemp;
    }
    public double getTemp(){
        return avgTemp;
    }
    public String getDescrption(){
        return "Холодное время года";
    }
}

package CSA;

public class Country {
    private int population;
    private int area;
    private String name;
    public Country(){}
    public Country(int population, String name) {

    }

    public String getName(){
        return name;
    }

    public String setName(String newName){
        return name = newName;
    }

    public int getPopulation(){
        return population;
    }

    public int setPopulation(int newPopulation){
        return population = newPopulation;
    }

    public int getArea(){
        return area;
    }

    public int setArea(int newArea){
        return area = newArea;
    }

    public void density() {
        System.out.println("The population density is " + population/area + " people per sq mile.");
    }

    public int updatePopulation(int births, int deaths){
        population += births;
        population -= deaths;
        return population;
    }

    public String toString(){
        return "The country is " + getName() + ", its population is " + getPopulation() + " and the area is " + getArea() + ".";
    }

    public static void main(String[] args) {
        Country country1 = new Country();
        Country country2 = new Country(5000000, "Zambonia");
        country2.setPopulation(50000000);
        country2.updatePopulation(50, 25);
        country1.setArea(123531);
        country2.setArea(123531);
        country2.setName("Zambonia");
        country2.density();
        System.out.println(country2.toString());
    }
}

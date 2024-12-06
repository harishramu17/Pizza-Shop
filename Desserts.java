public class Desserts {
    private String dessertname;
    private float cost;

    public Desserts(String name,int amount){
        dessertname=name;
        cost=amount;
    }
    public String getDessertname(){
        return dessertname;
    }
    public float getCost(){
        return cost;
    }
}

public class User {
    private float totalcost;

    User(){
        totalcost=0;
    }
    public void updateCost(float cost){
        totalcost+=cost;
    }
    public float getCost(){
        return totalcost;
    }
}

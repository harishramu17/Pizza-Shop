public class Base {
    private String basename;
    private float cost;

    Base(String basename,float cost){
        this.basename=basename;
        this.cost=cost;
    }
    public String getBase(){
        return basename;
    }
    public float getCost(){
        return cost;
    }

}

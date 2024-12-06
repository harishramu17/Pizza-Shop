import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Base>bs=new ArrayList<>();
        ArrayList<Desserts>ds=new ArrayList<>();
        User us=new User();
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Pizza Shop Application");
        while(true){
            
            System.out.println("Enter your role: 1 for User,2 for Admin,3 to Exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Our Menus are:");
                System.out.println("Pizza Base");
                System.out.println("ID"+"\t"+"Name"+"\t"+"\t"+"Cost");
                for(int i=0;i<bs.size();i++){
                    int id=i+1;
                    System.out.println(id+"\t"+bs.get(i).getBase()+"\t"+"\t"+bs.get(i).getCost());
                }
                System.out.println("Its time to order");
                System.out.println("Select "+(bs.size()+1)+" to skip");
                System.out.println("Select your base through its id:");
                while(true){
                    int n=sc.nextInt();
                    if(n>0&&n<=bs.size()){
                        us.updateCost(bs.get(n-1).getCost());
                    }
                    else{
                        break;
                    }
                }
                System.out.println("Desserts");
                System.out.println("ID"+"\t"+"Name"+"\t"+"\t"+"Cost");
                for(int i=0;i<ds.size();i++){
                    int id=i+1;
                    System.out.println(id+"\t"+ds.get(i).getDessertname()+"\t"+"\t"+ds.get(i).getCost());
                }
                System.out.println("Its time to order");
                System.out.println("Select your Desserts through its id");
                System.out.println("Select "+(ds.size()+1)+" to skip ");
                while(true){
                    int n=sc.nextInt();
                    if(n>0&&n<=ds.size()){
                        us.updateCost(ds.get(n-1).getCost());
                    }
                    else{
                        break;
                    }
                }
                System.out.println("The cost for your order:"+us.getCost());
                System.out.println("Thank you Visit again");
                System.out.println();

            }
            else if(choice==2){
                System.out.println("Select 1 to add for pizza base or 2 for desserts in menu card or 3 to exit");
                int dchoice=sc.nextInt();
                    if(dchoice==1){
                        System.out.println("Enter Base name:");
                        String dname=sc.next();
                        System.out.println("Enter the cost:");
                        float dcost=sc.nextFloat();
                        Base b=new Base(dname,dcost);
                        bs.add(b);
                    }
                    else if(dchoice==2){
                        System.out.println("Enter Desserts name:");
                        String dname=sc.next();
                        System.out.println("Enter the cost:");
                        float dcost=sc.nextFloat();
                        Desserts d=new Desserts(dname, dchoice);
                        System.out.println(ds);
                    }
                    else{
                        System.out.println("Thank You");
                        break;
                    }
                
            }
            else{
                System.out.println("Thank You");
                break;
            }
        }
    }
}

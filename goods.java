public class goods implements discount{
    private  double prise;
    public goods(double t){
        this.prise=t;
    }
    @Override
    public void dodiscount() {
        System.out.println("价格为"+this.prise);
    }
}
class goods1 implements discount{
    private double prise;
    public goods1(double u){
        this.prise=u;
    }
    @Override
    public void dodiscount() {
        this.prise=this.prise*0.8;
        System.out.println("价格为"+this.prise);
    }
}
class goods2 implements discount{
    private double prise;
    public goods2(double u){
        this.prise=u;
    }
    @Override
    public void dodiscount() {
        double i=this.prise*0.15;
        System.out.println("返还为"+i);
    }
}
class sell{
    String name;
    double prise;
    int fangshi;
    public sell(String newname,double newprise,int newfangshi){
        this.name=newname;
        this.prise=newprise;
        this.fangshi=newfangshi;
    }
    public sell(){

    }
    public void mai(){
        if(fangshi==1){
            new goods(this.prise).dodiscount();
        }
        if(fangshi==2){
            new goods1(this.prise).dodiscount();
        }
        if (fangshi==3){
            new goods2(this.prise).dodiscount();
        }
    }
    public  static void main(String [] args){
        sell t=new sell("water",2,1);
        sell t1=new sell("smoke",10,3);
        sell t2=new sell("keyboad",25,2);
        t.mai();
        t1.mai();
        t2.mai();
    }

}

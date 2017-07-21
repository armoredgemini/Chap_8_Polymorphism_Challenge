/**
 * Created by ac003588 on 7/21/2017.
 */
    public class Q50 extends Infiniti {
     public Q50(String trim) {

        super("Q50", trim);
    }

    public void startEngine(){
        System.out.println("I am Q50's startEngine");
    }

    @Override
    void setTrim(String trim) {
       this.trim = trim;
    }

    public void q50Behavior() {

    }
}


//dates data insert in list and increase
import java.util.ArrayList;

public class DtList {
    public ArrayList<Date> dates = new ArrayList();

    public void addDate(Date dt){
        dates.add(dt);
    }

    public void display(){
        for(int i=0; i<dates.size(); i++){
            System.out.println("Year: " + dates.get(i).get_year() );
            System.out.println("Start Time: " + dates.get(i).get_start_time() );
            System.out.println("End Time: " + dates.get(i).get_end_time() );
        }
    }
}

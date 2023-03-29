//total dates based on counted days in a year
public class DateList {
    public Date dates[] = new Date[365];
    public int currnum;

    public void addDate(Date dt){
        dates[currnum] = dt;
        currnum++;

    }

    public static void main(String args[]){
        DateList Dlist = new DateList();
        Dlist.addDate(new Date());

       /* DateList.DtList dl = new DateList.DtList();
        dt.display();*/
    }
}

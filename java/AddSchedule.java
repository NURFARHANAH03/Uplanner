public class AddSchedule {
    protected static Schedule schedules;
    private final ArrayList<Schedule> addSchedules = new ArrayList<Schedule>();

    public Schedule getSchedule(int i) {
        return addSchedules.get(i);
    }
    public void addSchedule(Schedule schedules) {
        addSchedules.add(schedules);
    }

    public static void main(String[] args) {
        AddSchedule schedules1 = new AddSchedule();
        schedules1.addSchedule(schedules);

        System.out.println("Schedules :" + schedules1.getSchedule(0));
    }
}

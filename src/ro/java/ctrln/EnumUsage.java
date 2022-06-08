package ro.java.ctrln;

public class EnumUsage {
    public static void main(String[] args) {
        WeakDay weakDay = WeakDay.SUNDAY;
        switch (weakDay){
            case MONDAY:
                System.out.println("Luni");
                break;
            case TUESDAY:
                System.out.println("Marti");
                break;
            case WEDNESDAY:
                System.out.println("Miercuri");
                break;
            case THURSDAY:
                System.out.println("Joi");
                break;
            case FRIDAY:
                System.out.println("Vineri");
                break;
            case SATURDAY:
                System.out.println("Sambata");
                break;
            case SUNDAY:
                System.out.println("Duminica");
                break;
        }
    }
}

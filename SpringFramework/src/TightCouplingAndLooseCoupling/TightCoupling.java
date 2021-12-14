package TightCouplingAndLooseCoupling;

public class TightCoupling {
    static class Subject {
        Topic t = new Topic();
        public void startReading()
        {
            t.understand();
        }
    }
    static class Topic {
        public void understand()
        {
            System.out.println("Tight coupling concept");
        }
    }

    public static void main(String[] args) {
        Subject sj = new Subject();
        sj.startReading();
    }
}

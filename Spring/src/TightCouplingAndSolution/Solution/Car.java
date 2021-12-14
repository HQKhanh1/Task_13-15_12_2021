package TightCouplingAndSolution.Solution;

public class Car {
    private  Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void getRun(){
        engine.run();
    }
    public static void main(String[] args) {
        Engine goodEngine = new VietNamEngine();
        Engine chepEngine = new ChinaEngine();
        Car VNCar = new Car(goodEngine);
        Car chinaCar = new Car(chepEngine);
        VNCar.getRun();
        chinaCar.getRun();
    }
}

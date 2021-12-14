package TightCouplingAndSolution;

public class Box {
    public int volume;

    Box(int length, int width, int height) {

        this.volume = length * width * height;
    }
    //If we change anything in the Box classes then we don't have to change anything in Volume class
    public int getVolume() {
        return volume;

    }
}

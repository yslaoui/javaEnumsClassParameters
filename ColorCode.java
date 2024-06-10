package enumObjectParameter;

public class ColorCode {
    private int red;
    private int green;
    private int blue;

    public ColorCode(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public String toString() {
        return "#%02X%02X%02X";
    }
}


//Q. Create ColorCode class:
//Add fields: private int red, private int green, private int blue.
//Create constructor
//Add getter methods: public int getRed(), public int getGreen(), public int getBlue().
//Override toString method to return the color code in hexadecimal format.


package enumObjectParameter;

public enum Color {
    RED(new ColorCode(255,0,0)),
    GREEN(new ColorCode(0,255,0)),
    BLUE(new ColorCode(0,0,255));

    ColorCode colorCode;
    private Color(ColorCode colorCode) {
        this.colorCode = colorCode;
    }

    public ColorCode getColorCode() {
        return this.colorCode;
    }
}


//Q. Create Color enum:
//Define constants for red, green and blue.
//Pass as parameters new instances of the Color class you created above
//Add field: private ColorCode colorCode.
//Create constructor
//Add getter methodUse the Color enum in a main class:




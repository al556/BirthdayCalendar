public enum Okras {

    BLACK("black fur"),WHITE("white fur"),STRIPES("striped fur"),
    ORANGE("orange fur"),GREY("grey fur"),SPOTTED("spotted fur");

    private String color;

    private Okras(String i){
        color = i;

    }

    public String getColor(){
        return this.color;
    }



}

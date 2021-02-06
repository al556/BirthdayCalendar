public enum Color {

    GREEN("green"),BLUE("blue"),BROWN("brown");

    private String color;

    private Color(String i){
        color = i;

    }

    public String getColor(){
        return this.color;
    }

}

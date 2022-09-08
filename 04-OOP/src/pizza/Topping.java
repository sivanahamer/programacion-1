package pizza;

class Topping{
    private String name;

    public Topping(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String describir(){
        return String.format("Topping: %s", this.name);
    }
}
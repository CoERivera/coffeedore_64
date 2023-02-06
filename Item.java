class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    private int index;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }


    // GETTERS & SETTERS  - for name, price and index
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public double getIndex(){
        return index;
    }


}

abstract class CoffeeMod extends Coffee {
    protected Coffee coffee;
    public CoffeeMod(Coffee coffee) {
        this.coffee = coffee;
    }
    public abstract String getDesc();
    public abstract double cost();
    public abstract double time();
}

class MilkMod extends CoffeeMod {
    public MilkMod(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return coffee.getDesc() + " and dry Cream";
    }
    public double cost(){
        return coffee.cost() + 30.0;
    }
    public double time(){
        return coffee.time() + 0.5;
    }
}

class ChocolateMod extends CoffeeMod {
    public ChocolateMod(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return coffee.getDesc() + " and mini Kazakhstan chocolate";
    }
    public double cost(){
        return coffee.cost() + 50.0;
    }
    public double time(){
        return coffee.time() + 0.5;
    }
}

class CupcakeMod extends CoffeeMod {
    public CupcakeMod(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return coffee.getDesc() + " and delicious strawberry cupcake";
    }
    public double cost(){
        return coffee.cost() + 200.0;
    }
    public double time(){
        return coffee.time() + 1.5;
    }
}

class OrganicMilkMod extends CoffeeMod {
    public OrganicMilkMod(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getDesc(){
        return coffee.getDesc() + " and almond organic milk";
    }
    public double cost(){
        return coffee.cost() + 400.0;
    }
    public double time(){
        return coffee.time() + 0.5;
    }
}

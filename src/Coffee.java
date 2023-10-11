public class Coffee {
    String desc = "Classical instant Coffee";
    public String getDesc(){
        return desc;
    }
    public double cost(){
        return 90.0;
    }
    public double time(){
        return 2.0;
    }
}

class Nescafe extends Coffee {
    public Nescafe(){
        desc = "Instant Coffee from Nescafe 3in1";
    }
    @Override
    public double cost(){
        return 130.0;
    }
    public double time() { return 2.0;}
}

class Nesquik extends Coffee {
    public Nesquik(){
        desc = "Instant Coffee from Nesquik with cacao flavor";
    }
    @Override
    public double cost(){
        return 150.0;
    }
    public double time(){ return 2.5;}
}

class Starbucks extends Coffee {
    public Starbucks(){
        desc = "Instant Coffee from famous Starbucks";
    }
    @Override
    public double cost(){
        return 200.0;
    }
    public double time() {
        return 2.5;
    }
}

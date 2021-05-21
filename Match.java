public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    int round=1;
    public void run(){
        if(isCheck()){
            while(true){
                System.out.println("------------------------------------");
                System.out.println("            Round "+round);
                System.out.println("------------------------------------");

                if(this.f1.startFirst>this.f2.startFirst) {
                    this.f2.healthy = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.healthy = this.f2.hit(this.f1);

                    if (isWin()) {
                        break;
                    }

                    System.out.println("\n-----Sağlık-----");
                    System.out.println(this.f2.name+" sağlık :"+this.f2.healthy);
                    System.out.println(this.f1.name+" sağlık :"+this.f1.healthy);
                }
                else{
                    this.f1.healthy = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.healthy = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    System.out.println("\n-----Sağlık-----");
                    System.out.println(this.f1.name+" sağlık :"+this.f1.healthy);
                    System.out.println(this.f2.name+" sağlık :"+this.f2.healthy);

                }

                ++round;
            }

        }
        else{
            System.out.println("Sporcuların sikletleri uyuşmuyor !");
        }

    }

    public boolean isCheck(){
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }

    public boolean isWin(){
        if(this.f1.healthy==0){
            System.out.println("\n-----------------------------------------\n####### Tebrikler "+this.f2.name+" kazandı ! #######\n-----------------------------------------");
            return true;
        }
        if(this.f2.healthy==0){
            System.out.println("\n-----------------------------------------\n####### Tebrikler "+this.f1.name+" kazandı ! #######\n-----------------------------------------");
            return true;
        }
        return false;
    }

}



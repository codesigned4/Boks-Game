public class Fighter {
    String name;
    int damage;
    int healthy;
    int weight;
    int dodge;
    double startFirst=Math.random();

    Fighter(String name,int damage,int healthy,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.healthy=healthy;
        this.weight=weight;
        if(dodge>=0&&dodge<100)
        {
            this.dodge=dodge;
        }
        else{
            this.dodge=0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name+" ==> "+foe.name+"  -"+this.damage+" vuruş yaptı ");
        if(foe.isDodge()){
            System.out.println(foe.name+" gelen hasarı blokladı ");
            return foe.healthy;
        }
        if(foe.healthy-this.damage<=0){
            return 0;
        }
        return foe.healthy-this.damage;
    }

    public boolean isDodge(){
        double randomNumber=Math.random()*100;
        return this.dodge>=randomNumber;
    }

}

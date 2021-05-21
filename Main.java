public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Marc",22,145,77,45);
        Fighter f2=new Fighter("Alex",25,130,76,55);

        Match match=new Match(f1,f2,75,80);
        match.run();
    }

}

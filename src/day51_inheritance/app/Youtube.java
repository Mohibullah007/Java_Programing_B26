package day51_inheritance.app;

public class Youtube extends App{

    public Youtube(double version){
        super("Youtube", version);
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }
}

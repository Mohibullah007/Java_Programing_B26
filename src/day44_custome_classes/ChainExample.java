package day44_custome_classes;

public class ChainExample {
    public ChainExample(){
//        this(4); this is not valid because the chaining contain themselves
        System.out.println("First");
    }
    public ChainExample(int i){
        this(); // TODO: this empty one will move the counter to read the first chaining one after that it will come and read the rest
        System.out.println("Second");
    }
    public ChainExample(String s){
        this(); // TODO: this empty one will move the counter to read the first chaining one after that it will come and read the rest
        System.out.println("Third");
    }
    public ChainExample(double d){
        this(0); // todo: this will go for the first int method -> int i -> it has ->  this(); -> will go to read the empty method (First)
        // todo: -> then it will come and read the rest of -> int i (Second) -> then it will come and read the fourth one (Fourth)
        System.out.println("Fourth");
    }
}

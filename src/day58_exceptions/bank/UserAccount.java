package day58_exceptions.bank;

public class UserAccount {
    public static void main(String[] args) {

        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);

        // valid
        try{
            accountOne.login("jamesbond", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        // invalid username
        try{
            accountOne.login("jamesjohn", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        // invalid password
        try{
            accountOne.login("jamesbond", "009");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }
    }
}

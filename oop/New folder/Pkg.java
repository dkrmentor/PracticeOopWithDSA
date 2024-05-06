import bank.*;

public class Pkg {
    public static void main(String[] args) {
        bank.Bank bank = new bank.Bank();
        bank.publicInfo ="publicInfo is accessible everywhere at every pkg ";     
        System.out.println(bank.publicInfo); 
    }
}


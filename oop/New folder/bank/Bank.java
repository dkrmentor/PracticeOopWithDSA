package bank;

public class Bank {
    public String publicInfo;
    protected String protectedInfo;
    String defaultInfo;
    private String privateInfo;
    private String password;

    public String getPrivateInfo() {
        return privateInfo;
    }

    public void setPrivateInfo(String privateInfo) {
        this.privateInfo = privateInfo;
    }

    public String getPassword() {
        setPassword("You can private set password and then get ");
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.privateInfo = "privateInfo is accessible in same class only ";
        System.out.println(bank.privateInfo);
    }

}

class Account {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.protectedInfo = "protectedInfo is accessible everywhere in same pkg only and outside the pkg only is subclasses ";
        System.out.println(bank.protectedInfo);

        bank.defaultInfo = "defaultInfo is accessible everywhere in same pkg only ";
        System.out.println(bank.defaultInfo);
        bank.setPrivateInfo("privateInfo is accessible in different classes in same pkg using getter/setter");

        System.out.println(bank.getPrivateInfo());
        System.out.println(bank.getPassword());

    }
}

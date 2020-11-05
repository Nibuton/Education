import java.util.*;

public class Task_3_176{

    private static Set<User> users = new HashSet<>();

    public static void main(String[] args) {

        users.add(new User("nikita"));
        users.add(new User("boris"));
        users.add(new User("ivan"));
        users.add(new User("igor"));
        users.add(new User("petr"));

        printBalanceIfNotEmpty("olga");

    }

    public static Optional<User> findUserByLogin(String login) {
        return users.stream().filter((s) -> s.getLogin().equals(login)).findAny();
    }

    public static void printBalanceIfNotEmpty(String userLogin) {
        Optional<User> user = findUserByLogin(userLogin);
        if (user.isPresent() ) {
            if (Optional.ofNullable(user.get().getAccount()).isPresent()) {
                long balance = user.get().getAccount().getBalance();
                if (balance > 0) {
                    System.out.println(userLogin + ": " + balance);
                }
            }
        }
    }
}

class User {

    private String login;
    private Account account;

    public User(String login) {
        this.login = login;
        this.account = new Account(100);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return login.equals(user.login) &&
                Objects.equals(account, user.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, account);
    }
}

class Account {

    private static UUID guid = new UUID(100l, 200l);
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}


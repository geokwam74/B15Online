package day52;

import java.util.ArrayList;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add( new Account("George Sarpong", 10000));
        accountList.add( new Account("Ezra", 11000));
        accountList.add( new Account("Nancy",13000));
        accountList.add( new Account("Sophie", 8000) );
        accountList.add( new Account("Christa",17000));
    }
}

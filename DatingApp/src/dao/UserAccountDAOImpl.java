package dao;

import model.UserAccount;

import java.util.*;

public class UserAccountDAOImpl implements UserAccountDAO {
    Map<Integer,UserAccount> userAccounts=new HashMap<>();
    @Override
    public void save(UserAccount userAccount) {
        userAccounts.put(userAccount.getId(),userAccount);
    }
    @Override
    public UserAccount findById(int id) {
        return userAccounts.get(id);
    }

    @Override
    public List<UserAccount> findAll(){
        return new ArrayList<UserAccount>(userAccounts.values());
    }

    @Override
    public List<UserAccount> findMatches(int age, String city) {
        Collection<UserAccount> accounts=userAccounts.values();
        ArrayList<UserAccount> matches=new ArrayList<UserAccount>();
        for(UserAccount account:accounts){
            if(account.getAge() == age && city.equals(account.getCity())){
                matches.add(account);
            }
        }
        return matches;
    }
    @Override
    public void delete(int id) {
        userAccounts.remove(id);
    }
}

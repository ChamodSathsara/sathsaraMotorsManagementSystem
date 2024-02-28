package lk.ijse.SathsaraMoters.repository;

import lk.ijse.SathsaraMoters.config.SessionFactoryConfig;
import lk.ijse.SathsaraMoters.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserRepository {

    private final Session session;

    public UserRepository(){
        session = SessionFactoryConfig.getInstance().getSession();
    }
    public boolean isSaved(User user){
        Transaction transaction = session.beginTransaction();
        try {
            session.save(user);
            transaction.commit();
            return true ;
        }
        catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
            return false;
        }
        finally {
            session.close();
        }
    }
    public boolean isCheck(User user){
        String userName = user.getUserName();
        try {
            User usercheck = session.get(User.class,userName);
            boolean isCorrect = isCorrect(user,usercheck);
            if (isCorrect){
                return true;
            }
            else
                return false;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
        finally {
            session.close();
        }
    }

    private boolean isCorrect(User user, User usercheck) {
        if(user.getPassword().equals(usercheck.getPassword())){
            return true;
        }
        else
            return false;
    }

}

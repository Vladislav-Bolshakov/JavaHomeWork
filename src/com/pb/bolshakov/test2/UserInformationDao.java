package com.pb.bolshakov.test2;

public interface UserInformationDao {
    public abstract boolean isLogin(String username,String passworld);

    // Функция регистрации пользователя
    public abstract void regist(UserInformation userinformation);

}


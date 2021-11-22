package com.pb.bolshakov.test2;

import java.util.ArrayList;

public class UserInformationDaoImpl  implements UserInformationDao{

    // Обратите внимание, что переменные здесь должны быть статическими,
    // Поскольку переменные-члены существуют вместе с объектом, и мы создаем и используем два объекта при регистрации и входе в систему,
    // логин и регистрация должны использовать одну и ту же коллекцию, чтобы иметь смысл (чтобы можно было найти зарегистрированную учетную запись)
    private static ArrayList<UserInformation> array=new ArrayList<UserInformation>();

    public boolean isLogin(String username, String passworld) {

        boolean flag=false;

        for (UserInformation ui:array){
            if(ui.getUsername().equals(username)&&
                    ui.getPassworld().equals(passworld)){
                flag=true;
                break;
            }
        }

        return flag;
    }


    public void regist(UserInformation userinformation) {

        array.add(userinformation);

    }

}


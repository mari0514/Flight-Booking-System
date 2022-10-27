
public class Main {
    public static void main(String[] args) {
        User myUser = new User();
        
        if(myUser.isActive()){
            myUser.showMenu();
        }else{
            myUser.signUp();
            myUser.showMenu();
        }

    }
}

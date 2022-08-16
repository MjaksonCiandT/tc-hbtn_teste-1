public class Person {

    public static boolean checkUser(String usuario){
        boolean contains = !usuario.contains("(?=.*[@#$%^&+=])");
        if (usuario.length() >= 8 && contains){
            return true ;
        }
        return false;
    }

    public static boolean checkPassword(String password){
        if (password.matches("(^|$)[a-z]+(^|$)[0-9]")){
            return true ;
        }
        return false;
    }
}

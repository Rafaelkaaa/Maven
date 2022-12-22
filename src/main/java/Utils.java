import com.google.gson.Gson;


public class Utils {
    public static String userToJson(User user){
        return new Gson().toJson(user);
    }
}

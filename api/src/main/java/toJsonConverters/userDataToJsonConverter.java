package toJsonConverters;

public class userDataToJsonConverter {

    public userDataToJsonConverter(){}
    public String convertUserDataToJson(String email,String username)
    {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{\n");
        stringBuilder.append("\"email\":").append("\"").append(email).append("\",\n").append("\"username\":").append(username).append("\n}");
        return stringBuilder.toString();
    }
}

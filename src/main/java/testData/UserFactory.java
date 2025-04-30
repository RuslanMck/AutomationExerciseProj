package testData;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserFactory {

    private static final Map<String, User> allUsers = new HashMap<>();

    static {
        loadUsersFromJson();
    }

    private static void loadUsersFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("src/test/resources/testdata/users.json");

        /**
         * <p>This method reads the .json file with the list of users and converts it into the List that contains User objects <i>
         *     (class src/main/java/testData/User.java)
         * </i></p>
         */
        Map<String, List<User>> userGroups = null;
        try {
            userGroups = mapper.readValue(jsonFile,
                    new TypeReference<Map<String, List<User>>>() {
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(List<User> userList : userGroups.values()){
            for(User user : userList){
                allUsers.put(user.getId(), user);
            }
        }
    }
    public static User get (String id){
        User user = allUsers.get(id);
        if(user == null){
            throw new IllegalArgumentException("User with ID '" + id + "' not found.");
        }
        return user;
    }
}

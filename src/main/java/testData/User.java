package testData;

import lombok.Data;

@Data
public class User {
    private String id;
    private String email;
    private String password;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String gender;
    private String date_of_birth;
}

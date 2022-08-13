package com.axioma.axiomatrainee.requestdto;

import com.axioma.axiomatrainee.model.Group;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveUserRequestDto {
    String username;
    String firstname;
    String lastname;
    String password;
    List<Group> groups;
}

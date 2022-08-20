package com.axioma.axiomatrainee.requestdto;

import com.axioma.axiomatrainee.model.Group;
import com.axioma.axiomatrainee.model.Role;
import com.axioma.axiomatrainee.model.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaveUserRequestDto {
    String username;
    String firstname;
    String lastname;
    String password;
    Set<Group> groups;
    Role role;
}

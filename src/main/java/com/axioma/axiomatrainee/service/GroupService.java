package com.axioma.axiomatrainee.service;

import com.axioma.axiomatrainee.model.Group;
import com.axioma.axiomatrainee.model.User;
import com.axioma.axiomatrainee.repository.IGroupRepository;
import com.axioma.axiomatrainee.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Set;

@Service
public class GroupService {

    private IGroupRepository groupRepository;
    private IUserRepository userRepository;

    @Autowired
    public void setGroupRepository(IGroupRepository groupRepository, IUserRepository userRepository) {
        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
    }

    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group findById(Long id) {
        return groupRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public Group findByName(String name) {
        return groupRepository.findByName(name)
                .orElseThrow(EntityNotFoundException::new);
    }

    public List<Group> findAllByUserId(Long id) {
        User user = userRepository.getReferenceById(id);
        return groupRepository.findAllByUsersContaining(user);
    }

    public void insertUserIntoGroup(Long groupId, Long userId) {
        User user = userRepository.getReferenceById(userId);
        Group group = groupRepository.getReferenceById(groupId);
        Set<User> users = group.getUsers();
        users.add(user);
        group.setUsers(users);
    }

    public void deleteUserFromGroup(Long groupId, Long userId) {
        User user = userRepository.getReferenceById(userId);
        Group group = groupRepository.getReferenceById(groupId);
        Set<User> users = group.getUsers();
        users.remove(user);
        group.setUsers(users);
    }

    public void deleteGroupById(Long id) {
        groupRepository.deleteById(id);
    }

}

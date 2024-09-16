/*
 * Copyright 2024 Paion Data
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.paiondata.aristotle.service;

import com.paiondata.aristotle.model.dto.UserCreateDTO;
import com.paiondata.aristotle.model.dto.UserUpdateDTO;
import com.paiondata.aristotle.model.entity.User;
import com.paiondata.aristotle.model.vo.UserVO;

import java.util.List;
import java.util.Optional;

/**
 * Service implementation for user-related operations.
 * This class provides methods for managing users, including creating, updating, and deleting users.
 */
public interface UserService {

    /**
     * Retrieves a UserVO by UIDCID.
     *
     * @param uidcid the UIDCID of the user
     * @return the UserVO containing user details and associated graphs
     */
    UserVO getUserVOByUidcid(String uidcid);

    /**
     * Retrieves an optional user by UIDCID.
     *
     * @param uidcid the UIDCID of the user
     * @return an Optional containing the user if found, or empty otherwise
     */
    Optional<User> getUserByUidcid(String uidcid);

    /**
     * Retrieves all users as UserVOs.
     *
     * @return a list of UserVOs containing user details and associated graphs
     */
    List<UserVO> getAllUsers();

    /**
     * Creates a new user.
     *
     * @param user the UserCreateDTO containing user details
     */
    void createUser(UserCreateDTO user);

    /**
     * Updates an existing user.
     *
     * @param user the UserUpdateDTO containing updated user details
     */
    void updateUser(UserUpdateDTO user);

    /**
     * Deletes multiple users along with their related graphs and graph nodes.
     *
     * @param uidcids a list of UIDCIDs of the users to be deleted
     */
    void deleteUser(List<String> uidcids);
}

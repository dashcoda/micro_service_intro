package com.example.dashcoda.photoapp.api.users.photo_app_api_users.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.dashcoda.photoapp.api.users.photo_app_api_users.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}

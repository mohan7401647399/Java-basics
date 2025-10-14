package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Video;

@Repository
public interface VideoRepo extends JpaRepository<Video, Integer> {

}

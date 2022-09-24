package com.m2i.projetSlack.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.m2i.projetSlack.entity.ChatRoom;



public interface ChatRoomRepository extends  JpaRepository<ChatRoom, Integer> {
	
	

}

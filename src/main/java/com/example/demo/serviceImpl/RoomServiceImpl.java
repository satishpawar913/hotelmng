package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Rooms;
import com.example.demo.repositroy.RoomRepository;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomRepository roomRepository;

	@Override
	public List<Rooms> getRoomsByCId(int cId) {
		return roomRepository.findByCId(cId);
	}

	@Override
	public Rooms saveRoom(Rooms rooms) {
		return roomRepository.save(rooms);
	}

}

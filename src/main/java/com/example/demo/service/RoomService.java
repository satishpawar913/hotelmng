package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Rooms;

public interface RoomService {

	List<Rooms> getRoomsByCId(int cId);

	Rooms saveRoom(Rooms rooms);

}

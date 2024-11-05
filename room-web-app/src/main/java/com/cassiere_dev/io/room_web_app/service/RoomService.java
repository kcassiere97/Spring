package com.cassiere_dev.io.room_web_app.service;
import com.cassiere_dev.io.room_web_app.data.RoomRepository;
import com.cassiere_dev.io.room_web_app.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomService {
    public final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }


    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    };
}

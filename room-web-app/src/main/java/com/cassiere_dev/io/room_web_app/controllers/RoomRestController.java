package com.cassiere_dev.io.room_web_app.controllers;

import com.cassiere_dev.io.room_web_app.models.Room;
import com.cassiere_dev.io.room_web_app.service.RoomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    private final RoomService roomService;

    public RoomRestController(RoomService roomService) {
        this.roomService = roomService;
    }

    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}

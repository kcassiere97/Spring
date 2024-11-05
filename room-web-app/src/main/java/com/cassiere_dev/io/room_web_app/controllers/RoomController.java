package com.cassiere_dev.io.room_web_app.controllers;
import com.cassiere_dev.io.room_web_app.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    public  static  final List<Room> rooms = new ArrayList<>();
    static {
        for(int i = 0; i < 10; i++){
            rooms.add(new Room(i,"Room " + i,"R"+i,"Q"));
        }
    }
    public List<Room> getAllRooms() {return rooms;};

}

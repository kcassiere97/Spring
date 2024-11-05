package com.cassiere_dev.io.room_web_app.data;

import com.cassiere_dev.io.room_web_app.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}

package com.cassiere_dev.io.room_web_app.controllers;
import com.cassiere_dev.io.room_web_app.models.StaffMember;
import com.cassiere_dev.io.room_web_app.service.StaffService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {
    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    public List<StaffMember> getAllStaff(){
        return staffService.getAllStaff();
    }
}

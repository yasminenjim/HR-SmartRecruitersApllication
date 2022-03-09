package com.alightmea.meeting.controller;


import com.alightmea.meeting.entities.Appointment;
import com.alightmea.meeting.repository.AppointmentRepo;
import com.alightmea.meeting.services.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AppointmentController {

    @Autowired
    IMeetingService meetingService;
    @Autowired
    AppointmentRepo apprep;


    @GetMapping("/getmeetings")
    @ResponseBody
    public List<Appointment> DisplayAllAppt(){

        return meetingService.listAllAppointments();
    }

@GetMapping("/findappbyID/{id}")
@ResponseBody
    public Appointment findbyID (@PathVariable int id){
Appointment app1= apprep.findAppointmentByMeetingID(id);
if (app1!=null)
    return app1;
    else return null;
}

@PostMapping("/addApp")
    @ResponseBody
    public Appointment addAppointment(Appointment app2){

        return meetingService.saveAppointment(app2);
}

@DeleteMapping("/deleteApp/{idApp}")
    @ResponseBody
    public void deleteAppoint(@PathVariable int idApp)
{
    meetingService.deleteAppointment(idApp
    );
}

@GetMapping ("getAppByID/{idApp}")
@ResponseBody

    public Appointment findAppByID(@PathVariable int idApp){
        return apprep.findAppointmentByMeetingID(idApp);
}

}

package com.alightmea.meeting.services;


import com.alightmea.meeting.entities.Appointment;
import com.alightmea.meeting.repository.AppointmentRepo;
import com.alightmea.meeting.services.IMeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentServiceImp implements IMeetingService {

    @Autowired
    AppointmentRepo apprep;


    @Override
    public List<Appointment> listAllAppointments() {
        return apprep.findAll();
    }

    @Override
    public Appointment findAppointmentByMeetingID(int id) {
        return apprep.findAppointmentByMeetingID(id);
    }

    @Override
    public Appointment saveAppointment(Appointment appoint) {
        return apprep.save(appoint);
    }

    @Override
    public void deleteAppointment(int id) {
apprep.deleteById(id);
    }
}

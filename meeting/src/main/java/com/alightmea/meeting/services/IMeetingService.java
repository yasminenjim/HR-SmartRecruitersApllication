package com.alightmea.meeting.services;

import com.alightmea.meeting.entities.Appointment;

import java.util.List;
import java.util.Optional;

public interface IMeetingService {

    List<Appointment> listAllAppointments();

   Appointment findAppointmentByMeetingID(int id);

    Appointment saveAppointment(Appointment appoint);

    void deleteAppointment(int id);

}

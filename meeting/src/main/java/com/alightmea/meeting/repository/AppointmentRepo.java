package com.alightmea.meeting.repository;

import com.alightmea.meeting.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {
    Appointment findAppointmentByMeetingID(int meetingID);



}

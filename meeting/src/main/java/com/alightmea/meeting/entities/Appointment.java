package com.alightmea.meeting.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MEETING")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingID;
    @Column(name = "URL", nullable = false)
    private String url;
    @Column(name = "DATE", nullable = false)
    private String date;
    @Column(name = "NOTE", nullable = false)
    private String note;

}

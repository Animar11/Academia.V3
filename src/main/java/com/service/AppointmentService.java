package com.service;

import com.Entities.Appointment;
import com.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> allAppointments(){
        List<Appointment> appointmentsList = new ArrayList<>();
        appointmentRepository.findAll().forEach(appointmentsList::add);
        return appointmentsList;
    }

    public Appointment createAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public void deleteAppointment(Integer id_appointment){

        appointmentRepository.delete(id_appointment);
    }
}

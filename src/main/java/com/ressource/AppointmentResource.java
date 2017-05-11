package com.ressource;



import com.Entities.Appointment;
import com.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

////import org.springframework.security.access.annotation.Secured;

@RestController

public class AppointmentResource {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/allAppointments")
    public List<Appointment> retrieveAllAppointments()throws URISyntaxException{
        return appointmentService.allAppointments();
    }

    @PostMapping("/appointments")
    public Appointment createAppointment(@RequestBody Appointment appointment) throws URISyntaxException {

       return appointmentService.createAppointment(appointment);

    }

    @PutMapping("/updateAppointment")
    public Appointment updateAppointment (@RequestBody Appointment appointment) throws URISyntaxException{
        return appointmentService.updateAppointment(appointment);
    }

    @DeleteMapping("/appointments/{id_appointment}")
    public void deleteAppointment(@PathVariable Integer id_appointment) throws URISyntaxException {
        appointmentService.deleteAppointment(id_appointment);
    }


}

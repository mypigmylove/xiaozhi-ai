package com.young.javaailangchain4j.service;

import com.young.javaailangchain4j.model.Appointment;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    /**
     * 查询订单是否存在
     * @param appointment
     * @return
     */

    public Appointment getOne(Appointment appointment) {
//        LambdaQueryWrapper<Appointment> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(Appointment::getUsername, appointment.getUsername());
//        queryWrapper.eq(Appointment::getIdCard, appointment.getIdCard());
//        queryWrapper.eq(Appointment::getDepartment, appointment.getDepartment());
//        queryWrapper.eq(Appointment::getDate, appointment.getDate());
//        queryWrapper.eq(Appointment::getTime, appointment.getTime());
//        Appointment appointmentDB = baseMapper.selectOne(queryWrapper);
        return new Appointment();
    }
}

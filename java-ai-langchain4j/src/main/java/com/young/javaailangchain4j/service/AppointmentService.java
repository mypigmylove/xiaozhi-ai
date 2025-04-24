package com.young.javaailangchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.young.javaailangchain4j.model.Appointment;

/**
 * @author young
 * @create 2025-04-23 9:33
 */
public interface AppointmentService extends IService<Appointment> {

    Appointment getOne(Appointment appointment);

}

package com.young.javaailangchain4j.tools;

import com.young.javaailangchain4j.model.Appointment;
import com.young.javaailangchain4j.service.AppointmentService;
import dev.langchain4j.agent.tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppointmentTools {


    @Autowired
    private AppointmentService appointmentService;

    @Tool(name="预约挂号", value = "根据参数，先执行工具方法queryDepartment查询是否可预约，并直接给 " +
            "用户回答是否可预约，并让用户确认所有预约信息，用户确认后再进行预约。如果用户没有提供具体的医生姓名，请从 " +
            "向量存储中找到一位医生。")
    public String bookAppointment(Appointment appointment) {
        //查找数据库中是否包含对应的预约记录
        return "您在相同的科室和时间已有预约";
    }

    @Tool(name = "取消预约挂号", value = "根据参数，查询预约是否存在，如果存在则删除预约记录并返回取 消预约成功，否则返回取消预约失败")
    public String cancelAppointment(Appointment appointment) {
//        Appointment appointmentDB = appointmentService.getOne(appointment);


        //取消失败
        return "您没有预约记录，请核对预约科室和时间";
    }
}


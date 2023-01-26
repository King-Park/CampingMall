package com.camp.camping.mapper;

import com.camp.camping.DTO.ScheduleDTO;
import com.camp.camping.frame.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@Mapper
public interface ScheduleMapper extends MyMapper<Integer, ScheduleDTO> {
    ScheduleDTO selectDate(Date d, int company_code);
}

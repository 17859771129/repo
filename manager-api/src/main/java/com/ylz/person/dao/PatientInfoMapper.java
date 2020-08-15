package com.ylz.person.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.vo.PatientParam;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientInfoMapper extends BaseMapper<PatientInfo> {
    /**
     * 统计数据
     *
     * @param patientParam
     * @return
     * @throws Exception
     */
    int countByInfo(PatientParam patientParam) throws Exception;

    /**
     * 查询分页数据的数目
     *
     * @param patientParam
     * @return
     * @throws Exception
     */
    List<PatientInfo> queryByInfo(PatientParam patientParam) throws Exception;

}

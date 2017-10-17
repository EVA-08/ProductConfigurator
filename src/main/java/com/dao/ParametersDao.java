package com.dao;

import com.domain.Parameters;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface ParametersDao {
        List<Parameters> getParametersExpId(@Param("paraId") int paraId);
        List<Parameters> getParametersExpName(@Param("paraName") String paraName);
        void insertParameter(@Param("paraId") int paraId, @Param("paraName") String paraName, @Param("paraInfo") String paraInfo,
                             @Param("paraType") String paraType, @Param("paraValue") String paraValue, @Param("paraValField") int paraValField,
                             @Param("paraValExp") String paraValExp, @Param("superId") int superId, @Param("productNumber") int productNumber,
                             @Param("isInput") int isInput, @Param("userPrompt") String userPrompt, @Param("isRelease") int isRelease);
        void removeParameter(@Param("paraId") int paraId);
        void setParaValExp(@Param("paraId") int paraId, @Param("paraValExp") String paraValExp);
}
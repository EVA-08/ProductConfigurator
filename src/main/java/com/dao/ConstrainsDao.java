package com.dao;

import com.domain.Constrains;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface ConstrainsDao {
        String getConstrainsEx(@Param("consId") int consId);
        void insertConstrain(@Param("consId") int consId, @Param("consName") String consName, @Param("expression") String expression,
                             @Param("description") String description, @Param("alert") String alert, @Param("productNumber") int productNumber,
                             @Param("consType") String consType, @Param("isRelease") int isRelease);
        void removeConstrain(@Param("consId") int consID);
        void setConsName(@Param("consId") int consId, @Param("consName") String consName);
        void setExpression(@Param("consId") int consId, @Param("expression") String expression, @Param("description") String description);
}

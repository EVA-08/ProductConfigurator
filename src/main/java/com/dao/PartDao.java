package com.dao;

import com.domain.Part;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

@MapperScan
@Repository
public interface PartDao {
        List<Part> getPartList(@Param("partId") int partId);
        void setPartName(@Param("partId") int partId, @Param("partName") String partName);
        void setSuperId(@Param("partId") int partId, @Param("superId") int superId);
        void insertPart(@Param("partId") int partId, @Param("partName") String partName, @Param("partInfo") String partInfo,
                        @Param("partUnit") String partUnit, @Param("partVersion") String partVersion, @Param("superId") int superId,
                        @Param("productNumber") String productNumber, @Param("isRelease") int isRelease);
        void removePart(@Param("partId") int partId);
}

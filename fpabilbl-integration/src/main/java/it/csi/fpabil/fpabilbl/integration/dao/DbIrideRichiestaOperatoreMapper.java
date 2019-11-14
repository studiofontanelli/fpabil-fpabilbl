package it.csi.fpabil.fpabilbl.integration.dao;

import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaOperatore;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideRichiestaOperatoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbIrideRichiestaOperatoreMapper {
    long countByExample(DbIrideRichiestaOperatoreExample example);

    int deleteByExample(DbIrideRichiestaOperatoreExample example);

    int deleteByPrimaryKey(Integer idRichiestaOperatore);

    int insert(DbIrideRichiestaOperatore record);

    int insertSelective(DbIrideRichiestaOperatore record);

    List<DbIrideRichiestaOperatore> selectByExample(DbIrideRichiestaOperatoreExample example);

    DbIrideRichiestaOperatore selectByPrimaryKey(Integer idRichiestaOperatore);

    int updateByExampleSelective(@Param("record") DbIrideRichiestaOperatore record, @Param("example") DbIrideRichiestaOperatoreExample example);

    int updateByExample(@Param("record") DbIrideRichiestaOperatore record, @Param("example") DbIrideRichiestaOperatoreExample example);

    int updateByPrimaryKeySelective(DbIrideRichiestaOperatore record);

    int updateByPrimaryKey(DbIrideRichiestaOperatore record);
}
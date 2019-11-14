package it.csi.fpabil.fpabilbl.integration.dao;

import it.csi.fpabil.fpabilbl.integration.dto.DbIrideStatoRichiesta;
import it.csi.fpabil.fpabilbl.integration.dto.DbIrideStatoRichiestaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DbIrideStatoRichiestaMapper {
    long countByExample(DbIrideStatoRichiestaExample example);

    int deleteByExample(DbIrideStatoRichiestaExample example);

    int deleteByPrimaryKey(Integer idStatoRichiestaOperatore);

    int insert(DbIrideStatoRichiesta record);

    int insertSelective(DbIrideStatoRichiesta record);

    List<DbIrideStatoRichiesta> selectByExample(DbIrideStatoRichiestaExample example);

    DbIrideStatoRichiesta selectByPrimaryKey(Integer idStatoRichiestaOperatore);

    int updateByExampleSelective(@Param("record") DbIrideStatoRichiesta record, @Param("example") DbIrideStatoRichiestaExample example);

    int updateByExample(@Param("record") DbIrideStatoRichiesta record, @Param("example") DbIrideStatoRichiestaExample example);

    int updateByPrimaryKeySelective(DbIrideStatoRichiesta record);

    int updateByPrimaryKey(DbIrideStatoRichiesta record);
}
package com.dishdiscovery.dao.mapper;

import java.util.ArrayList;
import java.util.List;

import com.dishdiscovery.dao.data.DishSummaryVO;
import com.dishdiscovery.dao.data.ResAddressVO;
import com.dishdiscovery.dao.data.RestDetailVO;
import com.dishdiscovery.dao.entity.DshDtl;
import com.dishdiscovery.dao.entity.DshMtda;
import com.dishdiscovery.dao.entity.ResDtl;
import com.dishdiscovery.dao.entity.ResDtlMtda;

public class DishSummaryMapper {
	
	public static List<DishSummaryVO> convertDBObjectToBusinessObject(List<DshMtda> dshMtdaList){
		
		List<DishSummaryVO> dishSummaryList = new ArrayList<DishSummaryVO>();
		
		for (DshMtda dshmtda : dshMtdaList) {
			
			List<DshDtl> dshDtlList = dshmtda.getDshDtls();
			for (DshDtl dshDtl : dshDtlList) {
				
				DishSummaryVO summaryVo = new DishSummaryVO();
				summaryVo.setDishId(dshDtl.getDsh_Dtl_ID());
				summaryVo.setDishName(dshDtl.getDshMtda().getDshNme());
				summaryVo.setIngredient(dshDtl.getDshMtda().getDftIng());
				
				RestDetailVO restVO = new RestDetailVO();
				ResDtl restDtl = dshDtl.getResDtl();
				if(restDtl!=null){
					restVO.setResDtlId(restDtl.getRes_dtl_id());
					restVO.setResNme(restDtl.getRes_nme());
					List<ResDtlMtda> resMtdaList = restDtl.getResDtlMtdas();
					List<ResAddressVO> resAddrList = new ArrayList<ResAddressVO>(0);
					
					for (ResDtlMtda resDtlMtda : resMtdaList) {
						ResAddressVO resAddr = new ResAddressVO();
						resAddr.setResAddr(resDtlMtda.getResAddr());
						resAddr.setMblNbr(resDtlMtda.getMblNbr());
						resAddr.setLndLneNbr(resDtlMtda.getLndLneNbr());
						resAddrList.add(resAddr);
					}
					restVO.setResAddrList(resAddrList);
				}
				summaryVo.setRestDetailVO(restVO);
				dishSummaryList.add(summaryVo);
			}
			
			
		}
		
		return dishSummaryList;
		
	}
}

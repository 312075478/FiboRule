package com.fibo.ddp.common.service.strategyx.knowledge;

import com.fibo.ddp.common.model.strategyx.knowledge.Rule;

import java.util.List;
import java.util.Map;

/**
 * ClassName:RuleService <br/>
 * Description: 规则接口. <br/>
 * @see
 */
public interface RuleService {

	/**
	 * getRuleList:(获取规则集合)
	 *
	 * @param  paramMap 参数集合
	 * @return 规则集合
	 * */
	public List<Rule> getRuleList(Map<String, Object> paramMap);
}

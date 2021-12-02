package com.baoying.enginex.executor.tactics.consts;

public class TacticsType {
    public static final String DECISION_TABLES = "decision_tables";//决策表
    public static final String SCORECARD = "scorecard";//评分卡
    public static final String LIST_DB = "list_db";//名单库
    public static final String MODELS = "models";
    public static final String COMPLEX_RULE = "complex_rule";
    public static final String BASE_RULE = "base_rule";
    public static final String DECISION_TREE = "decision_tree";//决策树

    public static class  OutType{
        public static final String SUCCESS_OUT = "success";//成功时输出
        public static final String FAIL_OUT = "fail";//失败时输出
    }
}

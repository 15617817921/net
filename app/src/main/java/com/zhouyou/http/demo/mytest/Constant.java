package com.zhouyou.http.demo.mytest;

public class Constant {
    public static class Common {//192.168.11.25:8000
        //        public static final String BASE_URL = "http://47.111.85.189:10002";//anbao01/password
//        public static final String BASE_URL = "http://112.13.94.124:9090";//112.13.94.124:9090
        public static final String BASE_URL = "http://192.168.11.25:8000";//本地
//        public static final String BASE_URL = "http://47.111.85.189:10002";//外网
//        public static final String BASE_URL = "http://10.131.70.49:9090";//服务器
    }

    /**
     * 图片选择相关
     */
    public static class ImageConnet {
        public static final int ID_IMAGE = 1;
        public static final int OHTEr_IMAGE = 9;
    }

    /**
     * activity相关
     */
    public static class ActConnet {
        /**
         * 首页
         */
        public static final String ONE = "通知";
        public static final String TWO = "紧急任务";
        public static final String THREE = "当前任务";
        public static final String FOUR = "下一任务";
        public static final String STATIC = "/static";

        /**
         * 报告
         */
        public static final String REPORT_ADD = "report_add";


        /**
         * 打卡
         */
        public static final String DOCARD = "docard";

        public static final String SHANGBAN = "上班打卡";
        public static final String XIABAN = "下班打卡";


        public static final String NOTICE = "notice";//通知
        public static final String URGENTTASK = "urgentTask";//紧急任务
        public static final String TASK_PAGE = "task_page";//任务 的页数
        public static final String TASK_PAGE_CUR = "task_page_cur";//当前任务跳转到详情时的 的页数
        public static final String TASK_PAGE_HOME = "task_page_home";//主页跳转到详情


        public static final String DOJI_TASK_ACT = "DoJi_Task_Act";//拒绝接受跳转
//        public static final String DOJI_TASK_ACT_ACCEPT = "accept";//拒绝接受跳转
//        public static final String DOJI_TASK_ACT_REFUSE = "refuse";//拒绝接受跳转
        /**我的页面*/
        /**
         * 用户信息
         */
        public static final String USER = "user";//实体类
        // /**处罚*/
        public static final String CHUFA = "chufa";//实体类
        /**
         * 奖励
         */
        public static final String AWARD = "award";//实体类
        public static final String AWARD_PEOPLE = "award_people";
        /**
         * 报告
         */
        public static final String REPORT = "report";//实体类

        /**
         * 紧急任务
         */
        public static final String MISSION_ID = "mission_id";
        public static final String TAG = "urgenttaskact";
        public static final String MSGSTATUS = "msgstatus";

        /**
         * 下一任务
         */
        public static final String CHECKACT = "checkact";//实体类
        public static final String ID1 = "1234";
        public static final String ID2 = "2345";


    }

    /**
     * 时间
     */
    public static class Time {
        public static final String TIME_START = " 00:00:00";
        public static final String TIME_END = " 23:59:59";


    }

    /**
     * 用户相关
     */
    public static class Save {
        public static final String USER_LIST = "user_list";
        public static final String ACCOUNT = "account";
        public static final String PASSWORD = "password";

        public static final String IMAGEURL = "imageurl";
        public static final String USERNAME = "username";
        public static final String TOKEN_ID = "token_id";
        public static final String HEAD = "head";
        public static final String TOKEN = "token";
        public static final String USERID = "userid";
        public static final String LOGIN = "login";//
        public static final String DIRECTORY = "test";//\

    }

    /**
     * RxBus 相关
     */
    public static class RxBus {

        public static final String ALLTASKFRAGMENT = "alltaskfragment";
        public static final String DAILYFRAGMENT = "dailyfragment";
        public static final String TEMPORARYFRAGMENT = "temporaryfragment";

    }

    /**
     * 数据相关
     */
    public static class DataConnet {
        //，进行中，已结束
        public static final String[] TASK_STATE_CODE = new String[]{"to_be_confirmed", "pass", "not_pass"};//紧急任务状态
        public static final String[] TASK_STATE = new String[]{"未开始", "进行中", "已结束"};//紧急任务状态
        public static final String[] LEAVETYPE = new String[]{"病假", "事假", "年假", "婚假", "产假", "丧假"};


        public static final String[] JIBIE = new String[]{"全部", "一等", "二等", "三等", "四等", "五等"};

        public static final String[] JIBIE_CHENGFA = new String[]{"全部", "一等", "二等", "三等", "四等", "五等"};
        public static final String[] TIME = new String[]{"一周内", "一个月内", "三个月内"};
        public static int JIAQI_TASK = 3;
        //任务
        public static String[] TABLETITLE_TASK = new String[]{"全部", "日常任务", "紧急任务"};
        public static String[] STATE_TASK = new String[]{"进行中", "未开始", "已结束"};

        public static String[] TASK_STATE_SHOW = new String[]{"未开始", "进行中", "已结束"};

        public static String[] TASK_OBJ_TYPE = new String[]{"daily", "temporary"};

        /**
         * 报告
         */
        public static String[] TYPE_REPORT = new String[]{"全部报告", "交付报告", "异常报告", "正常报告"};


        public static int JIAQI_COUNT = 4;
        public static String[] TABLETITLE_JIAQI = new String[]{"全部", "待审批", "已通过", "已驳回"};
//        public  static String[] TABLETITLE_JIAQI= new String[]{"全部", "已通过","已驳回","已取消"};

        public static String[] REPORT_TYPE = new String[]{"异常报告", "任务交付"};
        public static String[] COMP_STATE = new String[]{"已完成", "未完成"};

        /**
         * 上传参数
         */
        public static String[] OBJ_TYPE = new String[]{"", "daily", "temporary"};
        public static String[] STATE = new String[]{"ongoing", "not_started", "finished"};

        public static final String REPORT = "report";//报告值
        public static final String AWARD = "award";//奖励值
        public static final String PUNISHMENT = "punishment";//惩罚值
    }


    public static class Sql {
        public static final String[] TABLE_RFID_COLUMNS = {"planid", "cangkuid", "cangkuname", "starttime", "endtime", "rfidnums", "rfids", "mark", "isup", "txtname"};

    }


    public static class Net {


        public final static int CODE_200 = 200;
        public final static int CODE_401 = 401;//用户名或密码错误
        public final static int CODE_410 = 410;//参数未完整
        public final static String LOGINING = "登录中...";
        public final static String LOADING = "加载中...";
        public final static String UPDATAING = "上传中...";

        public final static String GUID_LAGER = "69cac99dfeb249ffae0edec9392d93e7";
        public final static String GUID_BETCH = "d157ebbc3ce149c4a399c4ea93c4d4ff";

        /**
         * 请求每页数量
         */
        public static int PAGE_SIZE = 10;
    }


}

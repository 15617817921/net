package com.zhouyou.http.demo.mytest;

import java.io.Serializable;
import java.util.List;

public class HomeTask implements Serializable {


    /**
     * data : [{},{"uid":"99c9a50a022c4ad9aea3446a47004978","title":"(!!!不要删不要动)执勤岗位","obj_type":{"code":"daily","value":"日常"},"service_unit":"杭州安保有限公司","lat_lon":{"lat":120.15641,"lon":30.145787},"address":"杭州西湖区文三路","content":"门岗执勤","on_work_time":"","off_work_time":"","start_time":"2020-01-01 00:00:00","end_time":"2026-01-01 00:00:00","state":"进行中","user_total":4,"confirm_state":{"code":"pass","value":"已接受"},"reason":null},{"uid":"dbe2ae818150477a852c5437a64c24e5","title":"创建上班打卡时间测试","obj_type":{"code":"daily","value":"日常"},"service_unit":"创建上班打卡时间测试","lat_lon":"","address":"创建上班打卡时间测试","content":"创建上班打卡时间测试","on_work_time":"02:00","off_work_time":"07:00","start_time":"2020-06-25 00:00:00","end_time":"2020-07-22 00:00:00","state":"未开始","user_total":2,"confirm_state":{"code":"pass","value":"已接受"},"reason":null}]
     * status : 200
     */

    private int status;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * uid : 99c9a50a022c4ad9aea3446a47004978
         * title : (!!!不要删不要动)执勤岗位
         * obj_type : {"code":"daily","value":"日常"}
         * service_unit : 杭州安保有限公司
         * lat_lon : {"lat":120.15641,"lon":30.145787}
         * address : 杭州西湖区文三路
         * content : 门岗执勤
         * on_work_time :
         * off_work_time :
         * start_time : 2020-01-01 00:00:00
         * end_time : 2026-01-01 00:00:00
         * state : 进行中
         * user_total : 4
         * confirm_state : {"code":"pass","value":"已接受"}
         * reason : null
         */

        private String uid;
        private String title;
        private ObjTypeBean obj_type;
        private String service_unit;
        private LatLonBean lat_lon=new LatLonBean();
        private String address;
        private String content;
        private String on_work_time;
        private String off_work_time;
        private String start_time;
        private String end_time;
        private String date;
        private String create_time="";//下发时间
        private String state;//未开始，进行中，已结束
        private int user_total;
        private ConfirmStateBean confirm_state;
        private Object reason;

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getUid() {
            return uid == null ? "" : uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getTitle() {
            return title == null ? "" : title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public ObjTypeBean getObj_type() {
            return obj_type;
        }

        public void setObj_type(ObjTypeBean obj_type) {
            this.obj_type = obj_type;
        }

        public String getService_unit() {
            return service_unit == null ? "" : service_unit;
        }

        public void setService_unit(String service_unit) {
            this.service_unit = service_unit;
        }

        public LatLonBean getLat_lon() {
            return lat_lon;
        }

        public void setLat_lon(LatLonBean lat_lon) {
            this.lat_lon = lat_lon;
        }

        public String getAddress() {
            return address == null ? "" : address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContent() {
            return content == null ? "" : content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getOn_work_time() {
            return on_work_time == null ? "" : on_work_time;
        }

        public void setOn_work_time(String on_work_time) {
            this.on_work_time = on_work_time;
        }

        public String getOff_work_time() {
            return off_work_time == null ? "" : off_work_time;
        }

        public void setOff_work_time(String off_work_time) {
            this.off_work_time = off_work_time;
        }

        public String getStart_time() {
            return start_time == null ? "" : start_time;
        }

        public void setStart_time(String start_time) {
            this.start_time = start_time;
        }

        public String getEnd_time() {
            return end_time == null ? "" : end_time;
        }

        public void setEnd_time(String end_time) {
            this.end_time = end_time;
        }

        public String getState() {
            return state == null ? "" : state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getUser_total() {
            return user_total;
        }

        public void setUser_total(int user_total) {
            this.user_total = user_total;
        }

        public ConfirmStateBean getConfirm_state() {
            return confirm_state;
        }

        public void setConfirm_state(ConfirmStateBean confirm_state) {
            this.confirm_state = confirm_state;
        }

        public Object getReason() {
            return reason;
        }

        public void setReason(Object reason) {
            this.reason = reason;
        }

        public static class ObjTypeBean implements Serializable {
            /**
             * code : daily
             * value : 日常
             */

            private String code;
            private String value;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class LatLonBean implements Serializable {
            /**
             * lat : 120.15641
             * lon : 30.145787
             */

            private double lat=0.0;
            private double lon=0.0;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }

        public static class ConfirmStateBean implements Serializable {
            /**
             * code : pass
             * value : 已接受
             */

            private String code;
            private String value;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}

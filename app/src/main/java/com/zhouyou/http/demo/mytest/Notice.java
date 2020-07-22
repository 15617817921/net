package com.zhouyou.http.demo.mytest;

import java.io.Serializable;
import java.util.List;

public class Notice implements Serializable {
    /**
     * total : 2
     * data : [{"uid":"b7cc888651fc4f48b8acabcc3e14909c","title":"新增公告测试","content":"新增公告测试",
     * "obj_type":{"code":"common","value":"普通"},"obj_type_id":"","create_user_id":"023e105fb7ec4ef98830897a19bc320e","create_user_name":"(!!!不要删)杭州安保管理员","create_time":"2020-06-15 17:38:03","user_list":[{"value":"023e105fb7ec4ef98830897a19bc320e","label":"(!!!不要删)杭州安保管理员"},{"value":"7d0a9321c051449b922a68eefb2ee229","label":"王永康"},{"value":"84090a8362384f228f282c8be1764047","label":"(!!!不要删)沈志恒"},{"value":"91e0d206e7be43b598ed4099c25b0637","label":"(!!!不要删)安保2号"},{"value":"d4ee61fe2ef54dc99db805fe70f1600e","label":"(!!!不要删)安保1号"}]},{"uid":"714e76358e3d4545b779d96d297bff94","title":"放假通知","content":"明天放假五天","obj_type":{"code":"common","value":"普通"},"obj_type_id":"","create_user_id":"84090a8362384f228f282c8be1764047","create_user_name":"(!!!不要删)沈志恒","create_time":"2020-06-15 11:42:41","user_list":[{"value":"84090a8362384f228f282c8be1764047","label":"(!!!不要删)沈志恒"},{"value":"d4ee61fe2ef54dc99db805fe70f1600e","label":"(!!!不要删)安保1号"}]}]
     * status : 200
     */

    private int total;
    private int status;
    private List<DataBean> data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

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

    public static class DataBean implements Serializable{
        /**
         * uid : b7cc888651fc4f48b8acabcc3e14909c
         * title : 新增公告测试
         * content : 新增公告测试
         * obj_type : {"code":"common","value":"普通"}
         * obj_type_id :
         * create_user_id : 023e105fb7ec4ef98830897a19bc320e
         * create_user_name : (!!!不要删)杭州安保管理员
         * create_time : 2020-06-15 17:38:03
         * user_list : [{"value":"023e105fb7ec4ef98830897a19bc320e","label":"(!!!不要删)杭州安保管理员"},{"value":"7d0a9321c051449b922a68eefb2ee229","label":"王永康"},{"value":"84090a8362384f228f282c8be1764047","label":"(!!!不要删)沈志恒"},{"value":"91e0d206e7be43b598ed4099c25b0637","label":"(!!!不要删)安保2号"},{"value":"d4ee61fe2ef54dc99db805fe70f1600e","label":"(!!!不要删)安保1号"}]
         */

        private String uid;
        private String title;
        private String content;
        private ObjTypeBean obj_type;
        private String obj_type_id;
        private String create_user_id;
        private String create_user_name;
        private String create_time;
        private List<UserListBean> user_list;
        /**自己加的用以判断红点显示*/
        private boolean read;

        public boolean getRead() {
            return read;
        }

        public void setRead(boolean read) {
            this.read = read;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public ObjTypeBean getObj_type() {
            return obj_type;
        }

        public void setObj_type(ObjTypeBean obj_type) {
            this.obj_type = obj_type;
        }

        public String getObj_type_id() {
            return obj_type_id;
        }

        public void setObj_type_id(String obj_type_id) {
            this.obj_type_id = obj_type_id;
        }

        public String getCreate_user_id() {
            return create_user_id;
        }

        public void setCreate_user_id(String create_user_id) {
            this.create_user_id = create_user_id;
        }

        public String getCreate_user_name() {
            return create_user_name;
        }

        public void setCreate_user_name(String create_user_name) {
            this.create_user_name = create_user_name;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public List<UserListBean> getUser_list() {
            return user_list;
        }

        public void setUser_list(List<UserListBean> user_list) {
            this.user_list = user_list;
        }

        public static class ObjTypeBean  implements Serializable {
            /**
             * code : common
             * value : 普通
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

        public static class UserListBean implements Serializable{
            /**
             * value : 023e105fb7ec4ef98830897a19bc320e
             * label : (!!!不要删)杭州安保管理员
             */

            private String value;
            private String label;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }
        }
    }


//    private String name;//id
//    private String content;
//    private String state;
//    private String time;
//
//    @Override
//    public String toString() {
//        return "Notice{" +
//                "name='" + name + '\'' +
//                ", content='" + content + '\'' +
//                ", state='" + state + '\'' +
//                ", time='" + time + '\'' +
//                '}';
//    }
//
//    public Notice( ) {
//    }
//
//    public Notice(String name, String content, String state, String time) {
//        this.name = name;
//        this.content = content;
//        this.state = state;
//        this.time = time;
//    }
//
//    public String getName() {
//        return name == null ? "" : name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getContent() {
//        return content == null ? "" : content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getState() {
//        return state == null ? "" : state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getTime() {
//        return time == null ? "" : time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
}

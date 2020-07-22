package com.zhouyou.http.demo.model;

public class Login {

    /**
     * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6ImQ0ZWU2MWZlMmVmNTRkYzk5ZGI4MDVmZTcwZjE2MDBlIiwiaWF0IjoxNTkxNzcxMzI2fQ.tizBzr5ZQLf_XOnGYkPU-tn9lyIzt9SvyXLmNB8mitg|d4ee61fe2ef54dc99db805fe70f1600e
     * info : {"account":"anbao01","name":"安保1号"}
     * status : 200
     */

    private String token;
    private InfoBean info;
    private int status;


    @Override
    public String toString() {
        return "Login{" +
                "token='" + token + '\'' +
                ", info=" + info +
                ", status=" + status +
                '}';
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token == null ? "" : token;
    }

    public InfoBean getInfo() {
        return info;
    }

    public int getStatus() {
        return status;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }



    public void setStatus(int status) {
        this.status = status;
    }

    public static class InfoBean {
        @Override
        public String toString() {
            return "InfoBean{" +
                    "account='" + account + '\'' +
                    ", name='" + name + '\'' +
                    ", head='" + head + '\'' +
                    '}';
        }

        /**
         * account : anbao01
         * name : 安保1号
         */

        private String account;
        private String name;
        private String head;

        public String getHead() {
            return head == null ? "" : head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

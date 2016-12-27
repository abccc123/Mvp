package com.xintong.mvp.bean;

import java.util.List;

/**
 * Created by xintong on 2016/12/27.
 */

public class News {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2016-12-27 10:00","title":"重庆荣昌区地震致成渝高铁多趟列车晚点停运","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20161227/n477027848.shtml"},{"ctime":"2016-12-27 10:21","title":"北京扫黄后 创投圈大佬忙辟谣刷爆朋友圈","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20161227/n477030375.shtml"},{"ctime":"2016-12-27 10:24","title":"长春一学校多名教职工被指酒后斗殴 警方已调查","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20161227/n477030704.shtml"},{"ctime":"2016-12-27 10:25","title":"曹德旺：我的事业重心在中国 朋友劝我不要乱讲话","description":"搜狐社会","picUrl":"","url":"http://news.sohu.com/20161227/n477030874.shtml"},{"ctime":"2016-12-27 10:26","title":"中国网红成韩企对华销售先锋 被政府邀请\u201c考察\u201d","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20161227/Img477026601_ss.gif","url":"http://news.sohu.com/20161227/n477030915.shtml"},{"ctime":"2016-12-27 10:36","title":"南京一医院主任拿回扣140万：买房缺钱立刻有人赞助","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20161227/Img477026893_ss.jpeg","url":"http://news.sohu.com/20161227/n477032161.shtml"},{"ctime":"2016-12-27 10:37","title":"小学教师称学生伙食费疑遭克扣 教育局检查未发现","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20161227/Img477030376_ss.jpeg","url":"http://news.sohu.com/20161227/n477032303.shtml"},{"ctime":"2016-12-27 10:38","title":"广东新规：女职工无痛经假但可根据情况请月经假","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20161227/Img477030706_ss.jpeg","url":"http://news.sohu.com/20161227/n477032434.shtml"},{"ctime":"2016-12-27 10:39","title":"中国农村3万多学校不足10人 小规模学校或成常态","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20161227/Img477030876_ss.jpeg","url":"http://news.sohu.com/20161227/n477032554.shtml"},{"ctime":"2016-12-27 10:47","title":"小偷500元藏鞋底 失主嫌味儿太大拒收","description":"搜狐社会","picUrl":"http://photocdn.sohu.com/20161227/Img477032304_ss.jpeg","url":"http://news.sohu.com/20161227/n477033465.shtml"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2016-12-27 10:00
         * title : 重庆荣昌区地震致成渝高铁多趟列车晚点停运
         * description : 搜狐社会
         * picUrl :
         * url : http://news.sohu.com/20161227/n477027848.shtml
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}

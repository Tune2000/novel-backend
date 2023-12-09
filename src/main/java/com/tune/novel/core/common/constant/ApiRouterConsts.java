package com.tune.novel.core.common.constant;

/**
 * @author Tune
 * @create 2023-12-07-22:37
 * @description:
 * API 路由常量
 */
public class ApiRouterConsts {
    /**
     * API请求路径前缀
     */
    public static final String API_URL_PREFIX = "/api";

    /**
     * 前台门户系统请求路径前缀
     */
    public static final String API_FRONT_URL_PREFIX = API_URL_PREFIX + "/front";

    /**
     * 作家管理系统请求路径前缀
     */
    public static final String API_AUTHOR_URL_PREFIX = API_URL_PREFIX + "/author";

    /**
     * 平台后台管理系统请求路径前缀
     */
    public static final String API_ADMIN_URL_PREFIX = API_URL_PREFIX + "/admin";

    /**
     * 首页模块请求路径前缀
     * */
    public static final String HOME_URL_PREFIX = "/home";

    /**
     * 小说模块请求路径前缀
     * */
    public static final String BOOK_URL_PREFIX = "/book";

    /**
     * 会员模块请求路径前缀
     * */
    public static final String USER_URL_PREFIX = "/user";

    /**
     * 前台门户首页API请求路径前缀
     */
    public static final String API_FRONT_HOME_URL_PREFIX = API_FRONT_URL_PREFIX + HOME_URL_PREFIX;

    /**
     * 前台门户小说相关API请求路径前缀
     */
    public static final String API_FRONT_BOOK_URL_PREFIX = API_FRONT_URL_PREFIX + BOOK_URL_PREFIX;

    /**
     * 前台门户会员相关API请求路径前缀
     */
    public static final String API_FRONT_USER_URL_PREFIX = API_FRONT_URL_PREFIX + USER_URL_PREFIX;

    // TODO 路由常量添加
    // ...省略若干常量
}

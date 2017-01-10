package com.alibaba.android.arouter.compiler.utils;

import java.io.File;

/**
 * Some consts used in processors
 *
 * @author Alex <a href="mailto:zhilong.liu@aliyun.com">Contact me.</a>
 * @version 1.0
 * @since 16/8/24 20:18
 */
public class Consts {
    // System interface
    public static final String ACTIVITY = "android.app.Activity";
    public static final String SERVICE = "android.app.Service";

    // Java type
    public static final String BYTE = "java.lang.Byte";
    public static final String SHORT = "java.lang.Short";
    public static final String INTEGER = "java.lang.Integer";
    public static final String LONG = "java.lang.Long";
    public static final String FLOAT = "java.lang.Float";
    public static final String DOUBEL = "java.lang.Double";
    public static final String BOOLEAN = "java.lang.Boolean";
    public static final String STRING = "java.lang.String";

    // Custom interface
    public static final String IPROVIDER = "com.alibaba.android.arouter.facade.template.IProvider";
    public static final String IPROVIDER_GROUP = "com.alibaba.android.arouter.facade.template.IProviderGroup";

    public static final String IINTERCEPTOR = "com.alibaba.android.arouter.facade.template.IInterceptor";
    public static final String IINTERCEPTOR_GROUP = "com.alibaba.android.arouter.facade.template.IInterceptorGroup";

    public static final String ITROUTE_ROOT = "com.alibaba.android.arouter.facade.template.IRouteRoot";
    public static final String IROUTE_GROUP = "com.alibaba.android.arouter.facade.template.IRouteGroup";

    // Log
    public static final String PREFIX_OF_LOGGER = "ARouter::Compiler ";

    // Options of processor
    public static final String KEY_MODULE_NAME = "moduleName";

    // Generate
    public static final String SEPARATOR = "$$";
    public static final String WARNING_TIPS = "DO NOT EDIT THIE FILE!!! IT WAS GENERATED BY AROUTER.";
    public static final String METHOD_LOAD_INTO = "loadInto";
    public static final String NAME_OF_ROOT = "ARouter$$Root";
    public static final String NAME_OF_PROVIDER = "ARouter$$Providers";
    public static final String NAME_OF_GROUP = "ARouter$$Group$$";
    public static final String NAME_OF_INTERCEPTOR = "ARouter$$Interceptors";
    public static final String PACKAGE_OF_GENERATE_FILE = "com.alibaba.android.arouter.routes";
}
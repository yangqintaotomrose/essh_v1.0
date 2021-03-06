package com.eryansky.utils;

/**
 * 缓存静态变量.
 * @author 尔演&Eryan eryanwcp@gmail.com
 * @date 2013-3-19 下午6:45:50 
 *
 */
public class CacheConstants {
	
	//hibernate cach
	/**
	 * basecom.eryansky.entity.sys
	 */
	public static final String HIBERNATE_CACHE_BASE = "com.eryansky.entity.base";
	
	/**
	 * sys
	 */
	public static final String HIBERNATE_CACHE_SYS = "com.eryansky.entity.sys";
	
	//Spring Ehcache Annoction
	/**
	 * 用户导航菜单(根据用户权限缓存).
	 */
	public static final String RESOURCE_USER_MENU_TREE_CACHE = "resource_user_menu_Tree_cache";
    /**
     * 用户资源树(根据用户权限缓存).
     */
    public static final String RESOURCE_USER_RESOURCE_TREE_CACHE = "resource_user_resource_Tree_cache";

    /**
     * 某个url对应的是否授权给某个用户.
     */
    public static final String RESOURCE_USER_AUTHORITY_URLS_CACHE = "resource_user_authority_urls_cache";
	
	/**
	 * 角色(无).
	 */
	public static final String ROLE_ALL_CACHE = "role_all_cache";

    /**
     * 数据字典类型下的数据(根据数据字典类型缓存).
     */
    public static final String DICTIONARYS_BY_TYPE_CACHE = "dictionarys_byType_cache";
	/**
	 * 数据字典类型下的数据(根据数据字典类型缓存).
	 */
	public static final String DICTIONARYS_CONBOTREE_BY_TYPE_CACHE = "dictionarys_conbotree_byType_cache";
    /**
     * 数据字典类型下的数据(根据数据字典类型缓存).
     */
    public static final String DICTIONARYS_CONBOBOX_BY_TYPE_CACHE = "dictionarys_conbobox_byType_cache";
	/**
	 * 所有数据字典类型.
	 */
	public static final String DICTIONARY_TYPE_ALL_CACHE = "dictionaryType_all_cache";
    /**
     * 所有数据字典类型组（即第一层）.
     */
    public static final String DICTIONARY_TYPE_GROUPS_CACHE = "dictionaryType_groups_cache";

	
}

package com.lbx.cache;


import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.ehcache.EhCacheCacheManager;

/**
 * Create by lbx on 2018/7/22  8:52
 **/
public class CacheService {
    /**
     * 缓存管理对象
     */
    private EhCacheCacheManager ehCacheCacheManager;

    /**
     * 缓存名称
     */
    private String cachename;

    public EhCacheCacheManager getEhCacheCacheManager() {
        return ehCacheCacheManager;
    }

    public void setEhCacheCacheManager(EhCacheCacheManager ehCacheCacheManager) {
        this.ehCacheCacheManager = ehCacheCacheManager;
    }

    public String getCachename() {
        return cachename;
    }

    public void setCachename(String cachename) {
        this.cachename = cachename;
    }

    /**
     * 获取进行操作的Cache对象
     *
     * @return
     */
    private Cache getCache() {
        return this.ehCacheCacheManager.getCache(this.cachename);
    }

    /**
     * 获取对象
     *
     * @param key
     *            对象对应的key值
     * @return
     */
    public Object get(Object key) {
        ValueWrapper valueWrapper = getCache().get(key);
        if (valueWrapper != null) {
            return getCache().get(key).get();
        }
        return valueWrapper;
    }

    /**
     * 缓存对象
     *
     * @param key
     * @param value
     */
    public void put(Object key, Object value) {
        getCache().put(key, value);
    }

    /**
     * 如果key对应的缓存数据存在则删除
     * @param key
     */
    public void evict(Object key){
        getCache().evict(key);
    }


    /**
     * 该方法获取的就是 net.sf.ehcache.Cache对象
     *
     * @return  net.sf.ehcache.Cache对象
     */
    public Object getNativeCache() {
        return getCache().getNativeCache();
    }
}

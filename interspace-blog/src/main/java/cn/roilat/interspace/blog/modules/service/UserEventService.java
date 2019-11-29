package cn.roilat.interspace.blog.modules.service;

import cn.roilat.interspace.blog.base.lang.Consts;
import org.springframework.cache.annotation.CacheEvict;

import java.util.Set;

/**
 * @author roilat-J on 2015/8/6.
 */
public interface UserEventService {
	/**
	 * 自增发布文章数
	 * 
	 * @param userId
	 */
	@CacheEvict(value = { Consts.CACHE_USER, Consts.CACHE_POST }, allEntries = true)
	void identityPost(Long userId, boolean plus);

	/**
	 * 自增评论数
	 * 
	 * @param userId
	 */
	@CacheEvict(value = { Consts.CACHE_USER, Consts.CACHE_POST }, allEntries = true)
	void identityComment(Long userId, boolean plus);

	/**
	 * 批量自动评论数
	 * 
	 * @param userIds
	 * @param plus
	 */
	@CacheEvict(value = { Consts.CACHE_USER, Consts.CACHE_POST }, allEntries = true)
	void identityComment(Set<Long> userIds, boolean plus);
}

package cn.roilat.interspace.blog.modules.service;

import cn.roilat.interspace.blog.modules.data.PostTagVO;
import cn.roilat.interspace.blog.modules.data.TagVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author : roilat-J
 */
public interface TagService {
	Page<TagVO> pagingQueryTags(Pageable pageable);

	Page<PostTagVO> pagingQueryPosts(Pageable pageable, String tagName);

	void batchUpdate(String names, long latestPostId);

	void deteleMappingByPostId(long postId);
}

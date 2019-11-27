package org.linjiezhijia.blog.web.controller.site.user;

import org.linjiezhijia.blog.base.lang.Result;
import org.linjiezhijia.blog.base.lang.Consts;
import org.linjiezhijia.blog.modules.data.AccountProfile;
import org.linjiezhijia.blog.modules.event.MessageEvent;
import org.linjiezhijia.blog.modules.service.PostService;
import org.linjiezhijia.blog.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author roilat-J
 */
@RestController
@RequestMapping("/user")
public class FavorController extends BaseController {
	@Autowired
	private PostService postService;
	@Autowired
	private ApplicationContext applicationContext;

	/**
	 * 收藏文章
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/favor")
	public Result<?> favor(Long id) {
		Result<?> data = Result.failure("操作失败");
		if (id != null) {
			try {
				AccountProfile up = getProfile();
				postService.favor(up.getId(), id);
				sendMessage(up.getId(), id);
				data = Result.success();
			} catch (Exception e) {
				data = Result.failure(e.getMessage());
			}
		}
		return data;
	}

	/**
	 * 取消收藏
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/unfavor")
	public Result<?> unfavor(Long id) {
		Result<?> data = Result.failure("操作失败");
		if (id != null) {
			try {
				AccountProfile up = getProfile();
				postService.unfavor(up.getId(), id);
				data = Result.success();
			} catch (Exception e) {
				data = Result.failure(e.getMessage());
			}
		}
		return data;
	}

	/**
	 * 发送通知
	 * 
	 * @param userId
	 * @param postId
	 */
	private void sendMessage(long userId, long postId) {
		MessageEvent event = new MessageEvent("MessageEvent" + System.currentTimeMillis());
		event.setFromUserId(userId);
		event.setEvent(Consts.MESSAGE_EVENT_FAVOR_POST);
		// 此处不知道文章作者, 让通知事件系统补全
		event.setPostId(postId);
		applicationContext.publishEvent(event);
	}
}

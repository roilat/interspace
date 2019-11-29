package cn.roilat.interspace.blog.modules.template.directive;

import cn.roilat.interspace.blog.modules.data.MessageVO;
import cn.roilat.interspace.blog.modules.service.MessageService;
import cn.roilat.interspace.blog.modules.template.DirectiveHandler;
import cn.roilat.interspace.blog.modules.template.TemplateDirective;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * 查询用户消息列表
 *
 * @author roilat-J
 * @since 3.0
 */
@Component
public class UserMessagesDirective extends TemplateDirective {
	@Autowired
	private MessageService messageService;

	@Override
	public String getName() {
		return "user_messages";
	}

	@Override
	public void execute(DirectiveHandler handler) throws Exception {
		long userId = handler.getInteger("userId", 0);
		Pageable pageable = wrapPageable(handler);

		Page<MessageVO> result = messageService.pagingByUserId(pageable, userId);
		handler.put(RESULTS, result).render();
	}

}

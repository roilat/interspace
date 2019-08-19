package cn.roilat.linjiezhijia.blog.plugin.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import cn.roilat.linjiezhijia.blog.core.event.FeedsEvent;
import cn.roilat.linjiezhijia.blog.core.hook.event.FeedsEventHook;

/**
 * @author Beldon 2015/10/29
 */
@Component
public class FeedsEventPlugin implements FeedsEventHook.FeedsEventListener {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void onEvent(FeedsEvent event) {
        logger.debug("插件发出来的消息:您又派发动态了");
    }
}

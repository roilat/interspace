package org.linjiezhijia.blog.modules.service;

import java.util.Map;

/**
 * @author : roilat-J
 */
public interface MailService {
    void config();
    void sendTemplateEmail(String to, String title, String template, Map<String, Object> content);
}

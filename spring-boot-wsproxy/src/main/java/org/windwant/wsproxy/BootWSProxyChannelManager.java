package org.windwant.wsproxy;

import io.netty.channel.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 通道管理
 */
public class BootWSProxyChannelManager {

    public static final Map<String, Channel> userChannels;

    private static final Logger logger = LoggerFactory.getLogger(BootWSProxyChannelManager.class);

    static {
        userChannels = new HashMap<>();
    }

    public static Channel getUserChannel(String userId) {
        return userChannels.get(userId);
    }

    public static void registerUserChannel(String userId, Channel channel) {
        userChannels.put(userId, channel);
    }

    public static void removeUserChannel(String userId) {
        userChannels.remove(userId);
    }

}

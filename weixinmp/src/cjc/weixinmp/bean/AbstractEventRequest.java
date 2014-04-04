package cjc.weixinmp.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * 被动事件请求（公共部分）
 * @author jianqing.cai@qq.com, https://github.com/caijianqing/weixinmp4java/
 */
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AbstractEventRequest extends AbstractRequest {

    private static final long serialVersionUID = 1L;

    /** 事件类型 */
    public EventType Event;

    /**
     * 事件类型
     * @author jianqing.cai@qq.com, https://github.com/caijianqing/weixinmp4java/
     */
    public static enum EventType {
        /** 1:订阅; 2:用户未关注时，进行关注后的事件推送 */
        subscribe,
        /** 取消订阅 */
        unsubscribe,
        /** 用户已关注时的事件推送 */
        SCAN,
        /** 上报地理位置事件 */
        LOCATION,
        /** 自定义菜单事件 */
        CLICK;
    }

}

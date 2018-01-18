package com.liumapp.pattern.schedule.core;

import com.liumapp.pattern.encode.EncodingBack;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 控制任务调度的启停
 * 立即执行
 * Created by liumapp on 1/5/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class SwitchPattern implements EncodingBack {

    private String type = "scheduleSwitch";

    private OrderType order = OrderType.CLOSED;

    public static enum OrderType {

        CLOSED,
        RESTART,
        START;

        private OrderType() {
        }

    }

    public static SwitchPattern parse (String line) throws Exception {
        SwitchPattern switchPattern = new SwitchPattern();

        String[] items = line.split("[\\s_]+");
        List<String> tmp = Arrays.asList(items);
        LinkedList<String> list = new LinkedList<String>(tmp);

        if (list.size() != 2) {
            throw new PatternPropertiesNumberNotEnough();
        }

        if (!list.pop().equals(switchPattern.getType())) {
            throw new WrongType();
        }

        switchPattern.setOrder(OrderType.valueOf(list.pop()));

        return switchPattern;

    }

    public void setImportant(OrderType order) {
        this.order = order;
    }

    @Override
    public String getEncoding() {
        LinkedList<String> list = new LinkedList<String>();
        String result = "";

        list.add(type);
        list.add(String.valueOf(order));

        while(list.size() > 1) {
            result += list.pop() + "_";
        }

        result += list.pop();
        return result;
    }

    @Override
    public boolean chk() {
        return !(this.type == null ||
            this.order == null);
    }

    public String getType() {
        return type;
    }

    public OrderType getOrder() {
        return order;
    }

    public void setOrder(OrderType order) {
        this.order = order;
    }
}

package com.liumapp.pattern.schedule;

import com.liumapp.pattern.encode.EncodingBack;
import com.liumapp.pattern.exception.PatternPropertiesNumberNotEnough;
import com.liumapp.pattern.exception.WrongType;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by liumapp on 1/4/18.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class HelloPattern extends SchedulePattern implements EncodingBack{

    private String type = "helloSchedule";

    private String name;

    private String triggerName;

    private String group;

    private String msg;

    private Integer time;

    private IntervalUnit Unit;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public IntervalUnit getUnit() {
        return Unit;
    }

    public void setUnit(IntervalUnit unit) {
        Unit = unit;
    }

    public static HelloPattern parse(String line) throws PatternPropertiesNumberNotEnough, WrongType {
        HelloPattern helloPattern = new HelloPattern();

        String[] items = line.split("[\\s_]+");
        List<String> tmp = Arrays.asList(items);
        LinkedList<String> list = new LinkedList<String>(tmp);

        if (list.size() < 4 ) {
            throw new PatternPropertiesNumberNotEnough();
        }

        if (!list.pop().equals(helloPattern.getType())) {
            throw new WrongType();
        }

        helloPattern.setMsg(list.pop());
        helloPattern.setTime(Integer.valueOf(list.pop()));
        helloPattern.setUnit(IntervalUnit.valueOf(list.pop()));

        return helloPattern;
    }

    public void setImportant(String msg, Integer time, IntervalUnit unit) {
        this.msg = msg;
        this.time = time;
        Unit = unit;
    }

    @Override
    public String getEncoding() {
        LinkedList<String> list = new LinkedList<String>();
        String result = "";

        list.add(type);
        list.add(msg);
        list.add(String.valueOf(time));
        list.add(String.valueOf(Unit));

        while(list.size() > 1) {
            result += list.pop() + "_";
        }

        result += list.pop();

        return result;
    }

    @Override
    public boolean chk() {
        return !(this.type == null
                || this.msg == null
                || this.time == null
                || this.Unit == null);
    }
}

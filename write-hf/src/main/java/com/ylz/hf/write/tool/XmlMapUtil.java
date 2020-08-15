package com.ylz.hf.write.tool;

/**
 * @Description: 描述内容
 * @Author: sunqiang
 * @CreateDate: 2019/12/16  13:18
 * @UpdateUser: sunqiang
 * @UpdateDate: 2019/12/16  13:18
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */

import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * xml/map转换工具类
 */
public class XmlMapUtil {


    //将map通过反射转化为实体
    public static Object mapToModel(Map map, Class clazz) throws Exception {
        Object o = clazz.newInstance();
        if (!map.isEmpty()) {
            List<Field> fields = Arrays.asList(clazz.getDeclaredFields());
            for (Object key : map.keySet()) {
                Object v = map.get(key);
                String keyString = String.valueOf(key);
                for (Field field : fields) {
                    if (null == v) {
                        continue;
                    }
                    String obj = v.toString();
                    if (StringUtils.isEmpty(obj)) {
                        continue;
                    }
                    String fieldName = field.getName();
                    if (StringUtils.equals(fieldName, keyString)) {
                        field.setAccessible(true);
                        //region--进行类型判断，type：class java.lang.String
                        String type = field.getType().toString();
                        if (type.endsWith("Date")) {
                            if (obj.length() == 8) {
                                v = DateUtils.strToDate(obj, "yyyyMMdd");
                            } else if (obj.length() == 14) {
                                v = DateUtils.strToDate(obj, "yyyyMMddHHmmss");
                            } else if (obj.length() == 14) {
                                v = DateUtils.strToDate(obj, "yyyyMMddHHmmss");
                            } else {
                                throw new Exception("字段为" + keyString + ",长度不符合要求！");
                            }
                        }
                        if (type.endsWith("String")) {
                            v = obj;
                        }
                        if (type.endsWith("Boolean")) {
                            v = Boolean.getBoolean(obj);
                        }
                        if (type.endsWith("int") || type.endsWith("Integer")) {
                            v = new Integer(obj);
                        }
                        if (type.endsWith("Long")) {
                            v = new Long(obj);
                        }
                        if (type.endsWith("Float")) {
                            v = new Float(obj);
                        }
                        if (type.endsWith("Double")) {
                            v = new Double(obj);
                        }
                        if (type.endsWith("Short")) {
                            v = new Short(obj);
                        }
                        if (type.endsWith("BigDecimal")) {
                            v = new BigDecimal(obj);
                        }
                        /*if (type.endsWith("List")) {
                            Map sMap = (Map) v;
                            Set value = sMap.keySet();
                            List slist = null;
                            //判断map中key是不是唯一的，唯一后可能存在value是集合
                            if (value.size() == 1) {
                                slist = (List) sMap.get(value.toArray()[0]);
                            } else {
                                continue;
                            }
                            JSONArray array = JSONArray.fromObject(slist);
                            //先获取List的类型：java.util.List<E>
                            ParameterizedType pt = (ParameterizedType) field.getGenericType();
                            //获取泛型：E
                            Class e = (Class) pt.getActualTypeArguments()[0];
                            List list =  JSONArray.fromObject(slist);
                            v = list;
                        }*/
                        field.set(o, v);
                    }
                }
            }
        }
        return o;
    }
}

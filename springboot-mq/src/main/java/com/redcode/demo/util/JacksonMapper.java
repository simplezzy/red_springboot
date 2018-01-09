package com.redcode.demo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/**
 * Created by zhiyu.zhou on 2018/1/9.
 */
@Component
public class JacksonMapper {

    private final ObjectMapper objectMapper;

    @Autowired
    public JacksonMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> String toJsonString(T object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new JsonException(e);
        }
    }

    public <T> T toJson(String jsonStr, Class<T> tClass) {
        try {
            return objectMapper.readValue(jsonStr, tClass);
        } catch (IOException e) {
            return (T) new JsonException(e);
        }
    }

    public <T, C extends Collection<T>> C toJson(String json, Class<C> collectionClazz, Class<T> clazz) {
        try {
            JavaType javaType = objectMapper.getTypeFactory().constructCollectionLikeType(collectionClazz, clazz);
            return objectMapper.readValue(json, javaType);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }

    public <K, V, M extends Map<K, V>> M toJson(String json, Class<M> mapClazz, Class<K> keyClazz, Class<V> valueClazz) {
        try {
            JavaType javaType = objectMapper.getTypeFactory().constructMapType(mapClazz, keyClazz, valueClazz);
            return objectMapper.readValue(json, javaType);
        } catch (IOException e) {
            throw new JsonException(e);
        }
    }
}

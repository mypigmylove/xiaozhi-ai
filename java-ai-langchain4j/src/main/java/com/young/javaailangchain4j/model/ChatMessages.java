package com.young.javaailangchain4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

/**
 * @author young
 * @create 2025-04-23 9:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("chat_messages")
public class ChatMessages {

    //唯一标识，映射到 MongoDB 文档的 _id 字段
    @Id
    private ObjectId id;
    private int messageId;
    private String content; //存储当前聊天记录列表的json字符串
}

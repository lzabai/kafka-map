package cn.typesafe.km.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

/**
 * @author dushixiang
 * @date 2021/3/27 9:45 下午
 */
@Table
@Entity
@Data
public class Cluster {

    @Column(length = 36)
    @Id
    private String id;
    @Column(length = 200)
    private String name;
    @Column(length = 500)
    private String servers;
    @Column(length = 20)
    private String delayMessageStatus;
    private String controller;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date created;

    @Column(length = 200)
    private String securityProtocol;
    @Column(length = 200)
    private String saslMechanism;
    @Column(length = 200)
    private String authUsername;
    @Column(length = 200)
    private String authPassword;

    @Transient
    private Integer topicCount;
    @Transient
    private Integer brokerCount;
    @Transient
    private Integer consumerCount;
}

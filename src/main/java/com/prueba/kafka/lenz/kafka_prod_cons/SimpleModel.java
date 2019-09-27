package com.prueba.kafka.lenz.kafka_prod_cons;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@JsonSerialize
public class SimpleModel implements Serializable {

    private String field1;
    private String field2;

}

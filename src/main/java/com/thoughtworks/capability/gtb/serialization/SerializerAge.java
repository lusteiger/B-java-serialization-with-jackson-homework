package com.thoughtworks.capability.gtb.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.thoughtworks.capability.gtb.vo.PersonVo;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Objects;

public class SerializerAge extends StdSerializer<Integer> {

    public SerializerAge() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (age==null){
                gen.writeNumber(0);
            }
    }


}

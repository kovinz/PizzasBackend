package com.kovinz.pizzasbackend.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.kovinz.pizzasbackend.model.Size;

import java.io.IOException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SizeSerializer extends StdSerializer<Set<Size>> {

    public SizeSerializer() {
        this(null);
    }

    public SizeSerializer(Class<Set<Size>> t) {
        super(t);
    }

    @Override
    public void serialize(Set<Size> sizes, JsonGenerator generator, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        SortedSet<Integer> ids = new TreeSet<>();
        for (Size size : sizes) {
            ids.add(size.getId());
        }
        generator.writeObject(ids);
    }

}

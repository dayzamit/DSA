package com.dsa.grap;

import java.util.Objects;

public class Vertices {

    String value;

    public Vertices(String vData)
    {
        value=vData;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertices vertices = (Vertices) o;
        return Objects.equals(value, vertices.value);
    }


    @Override
    public int hashCode() {

        return Objects.hash(value);
    }
}

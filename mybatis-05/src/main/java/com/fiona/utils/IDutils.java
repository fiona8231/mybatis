package com.fiona.utils;
import org.junit.jupiter.api.Test;

import java.util.UUID;

@SuppressWarnings("all")
public class IDutils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-", "");

    }

    @Test
    public void test(){
        System.out.println(IDutils.getId());
    }

}

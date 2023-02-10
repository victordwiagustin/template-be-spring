package com.vdaproject.templatebespring.util;

import java.sql.Timestamp;

public class DateUtil {
        public static Timestamp now() {
        return new Timestamp(System.currentTimeMillis());
    }
}

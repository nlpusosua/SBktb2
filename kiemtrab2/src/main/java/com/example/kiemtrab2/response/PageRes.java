package com.example.kiemtrab2.response;

import java.util.List;

public interface PageRes <T>{
    int getCurrentPage();

    List<T> getContent();

    int getPageSize();

    int getTotalPages();

    int getTotalElements();
}

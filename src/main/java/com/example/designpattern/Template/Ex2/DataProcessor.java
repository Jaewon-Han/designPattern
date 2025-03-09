package com.example.designpattern.Template.Ex2;

import org.springframework.aop.framework.adapter.GlobalAdvisorAdapterRegistry;

abstract class DataProcessor {
    public final void process(String data) {
        loadData(data);
        if (isValidData(data)) {
            processData(data);
            saveData(data);
        } else {
            System.out.println("Data is invalid, processing aborted.");
        }
    }

    //protected -- 같은 패키지 접근 가능
    //다른 패키지 자식클래스 접근 가능
    protected abstract void loadData(String data);
    protected abstract boolean isValidData(String data);
    protected abstract void processData(String data);
    protected abstract void saveData(String data);
}

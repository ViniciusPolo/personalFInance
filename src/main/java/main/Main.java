package main;

import service.GetApi;

public class Main {

    public void hello(){
        var getData = new GetApi();
        var citation = getData.GetData().toString();
        System.out.println(citation);
    }
}

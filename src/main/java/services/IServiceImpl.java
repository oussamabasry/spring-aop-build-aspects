package services;

import aspects.Log;
import aspects.SecuredByAspect;
import org.springframework.stereotype.Component;

@Component
public class IServiceImpl implements IService {
    @Override
    @Log
    public void process() {
        System.out.println("Business processing ...");
    }

    @Override
    @SecuredByAspect(roles = {"ADMIN","USER"})
    public double compute() {
        double data=80;
        System.out.println("Business Computing and returning result ....");
        return data;
    }
}

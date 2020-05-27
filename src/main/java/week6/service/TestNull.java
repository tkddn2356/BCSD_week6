package week6.service;


import org.springframework.stereotype.Service;

@Service
public class TestNull implements Null {
    @Override
    public void ThrowNull() {
        throw new NullPointerException();
    }
}

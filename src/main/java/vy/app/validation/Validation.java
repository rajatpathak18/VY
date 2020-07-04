package vy.app.validation;

public interface Validation<T> {
    public void validate(T t) throws Exception;
}

package service;

import com.google.gson.Gson;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class AbstractCrudService<T> {

    protected final Gson gson = new Gson();
    protected abstract String getFilePath();
    protected abstract Type getTypeToken();

    public List<T> findAll() {
        File file = new File(getFilePath());
        if (!file.exists()) return new ArrayList<>();
        try (Reader reader = new FileReader(file)) {
            List<T> list = gson.fromJson(reader, getTypeToken());
            return list != null ? list : new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void saveAll(List<T> list) {
        try (Writer writer = new FileWriter(getFilePath())) {
            gson.toJson(list, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addOne(T item) {
        List<T> list = findAll();
        list.add(item);
        saveAll(list);
    }

    public void deleteIf(Predicate<T> condition) {
        List<T> list = findAll();
        list.removeIf(condition);
        saveAll(list);
    }

}

package IO_NIO;

import java.io.Serializable;
import java.util.List;

public class Model implements Serializable {

    private static final long serialVersionUID = 45647L;

    private Long id;
    private String data;
    private List<String> properties;

    public Model() {
    }

    public Model(Long id, String data, List<String> properties) {
        this.id = id;
        this.data = data;
        this.properties = properties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", properties=" + properties +
                '}';
    }
}

package my.edu.webixedu.domain;

public interface ComboListItem {
    Long getId();

    String getName();

    void setId(Long id);

    void setName(String name);

    default String getRepr() {
        return getName();
    }
}

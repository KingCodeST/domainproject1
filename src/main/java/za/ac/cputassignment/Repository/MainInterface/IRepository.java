package za.ac.cputassignment.Repository.MainInterface;

public interface IRepository<T, ID> {

    T create(T t);
    T read(ID id);
    void delete(ID id);
    T update(T t);


}

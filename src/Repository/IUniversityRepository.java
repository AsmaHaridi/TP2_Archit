package Repository;
import Entities;
public interface IUniversityRepository {
          University GetById(int university);
          University GetById(string nameuniversity);
}

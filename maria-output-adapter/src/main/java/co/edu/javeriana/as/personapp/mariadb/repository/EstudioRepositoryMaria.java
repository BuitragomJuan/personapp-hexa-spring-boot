package co.edu.javeriana.as.personapp.mariadb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.javeriana.as.personapp.mariadb.entity.EstudiosEntity;

public interface EstudioRepositoryMaria extends JpaRepository<EstudiosEntity, Integer> {
    public <Optional> EstudiosEntity findByProfesionAndPersona(Integer professionID, Integer personID);
}
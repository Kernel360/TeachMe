package kr.kernel.teachme.lecture.repository;

import kr.kernel.teachme.lecture.entity.Lecture;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LectureRepository extends JpaRepository<Lecture, Long> {

    List<Lecture> findByOrderByIdDesc(Pageable pageable);
    void deleteByUrl(String url);
    void deleteByLectureId(Lecture id);
    List<Lecture> findAllByDetailUploadFlagIsFalseAndPlatform(String platform);
}

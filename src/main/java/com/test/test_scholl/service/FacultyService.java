package com.test.test_scholl.service;

import com.test.test_scholl.model.Faculty;


import java.util.Collection;

public interface FacultyService {

    Faculty createFaculty(Faculty faculty);
    Faculty updateFaculty(Long id, Faculty faculty);
    Faculty getFaculty(Long id);
    Faculty deleteFaculty(Long id);

    Collection<Faculty> facFilter(String color);
}

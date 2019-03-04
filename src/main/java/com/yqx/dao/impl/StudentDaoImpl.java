package com.yqx.dao.impl;

import org.springframework.stereotype.Repository;

import com.yqx.dao.StudentDao;
import com.yqx.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

}
